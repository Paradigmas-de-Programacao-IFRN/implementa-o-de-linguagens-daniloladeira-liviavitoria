package plp.enquanto;

import java.util.*;
import java.io.IOException;

interface Linguagem {
	Map<String, Integer> ambiente = new HashMap<>();
	Scanner scanner = new Scanner(System.in);

	interface Bool {
		boolean getValor();
	}

	interface Comando {
		void execute();
	}

	interface Expressao {
		int getValor();
	}

	/*
	 * Comandos
	 */
	class Programa {
		private final List<Comando> comandos;

		public Programa(List<Comando> comandos) {
			this.comandos = comandos;
		}

		public void execute() {
			comandos.forEach(Comando::execute);
		}
	}

	class Se implements Comando {
		private final List<Bool> condicoes;
		private final List<Comando> ramos;
		private final Comando senao;

		public Se(List<Bool> condicoes, List<Comando> ramos, Comando senao) {
			this.condicoes = condicoes;
			this.ramos = ramos;
			this.senao = senao;
		}

		@Override
		public void execute() {
			for (int i = 0; i < condicoes.size(); i++) {
				if (condicoes.get(i).getValor()) {
					ramos.get(i).execute();
					return;
				}
			}
			if (senao != null) {
				senao.execute();
			}
		}
	}

	Skip skip = new Skip();

	class Skip implements Comando {
		@Override
		public void execute() {
		}
	}

	class Escreva implements Comando {
		private final Expressao exp;

		public Escreva(Expressao exp) {
			this.exp = exp;
		}

		@Override
		public void execute() {
			System.out.println(exp.getValor());
		}
	}

	class Enquanto implements Comando {
		private final Bool condicao;
		private final Comando comando;

		public Enquanto(Bool condicao, Comando comando) {
			this.condicao = condicao;
			this.comando = comando;
		}

		@Override
		public void execute() {
			while (condicao.getValor()) {
				comando.execute();
			}
		}
	}

	class Repita implements Comando {
		private final Expressao vezes;
		private final Comando corpo;

		Repita(Expressao vezes, Comando corpo) {
			this.vezes = vezes;
			this.corpo = corpo;
		}

		@Override
		public void execute() {
			int n = vezes.getValor();
			for (int i = 0; i < n; i++) {
				corpo.execute();
			}
		}
	}

	class Para implements Comando {
		private final String id;
		private final Expressao inicio;
		private final Expressao fim;
		private final Comando corpo;

		Para(String id, Expressao inicio, Expressao fim, Comando corpo) {
			this.id = id;
			this.inicio = inicio;
			this.fim = fim;
			this.corpo = corpo;
		}

		@Override
		public void execute() {
			for (int i = inicio.getValor(); i <= fim.getValor(); i++) {
				ambiente.put(id, i);
				corpo.execute();
			}
		}
	}

	class Escolha implements Comando {
		private final Expressao seletor;
		private final Map<Integer, Comando> casos;
		private final Comando outro;

		Escolha(Expressao seletor, Map<Integer, Comando> casos, Comando outro) {
			this.seletor = seletor;
			this.casos = casos;
			this.outro = outro;
		}

		@Override
		public void execute() {
			int valor = seletor.getValor();
			Comando cmd = casos.get(valor);
			if (cmd != null) {
				cmd.execute();
			} else if (outro != null) {
				outro.execute();
			}
		}
	}

	class Exiba implements Comando {
		private final String texto;

		public Exiba(String texto) {
			this.texto = texto;
		}

		@Override
		public void execute() {
			System.out.println(texto);
		}
	}

	class ExibaExp implements Comando {
		private final Expressao exp;

		public ExibaExp(Expressao exp) {
			this.exp = exp;
		}

		@Override
		public void execute() {
			System.out.println(exp.getValor());
		}
	}

	class Bloco implements Comando {
		private final List<Comando> comandos;

		public Bloco(List<Comando> comandos) {
			this.comandos = comandos;
		}

		@Override
		public void execute() {
			comandos.forEach(Comando::execute);
		}
	}

	class Atribuicao implements Comando {
		private final List<String> ids;
		private final List<Expressao> exps;

		Atribuicao(List<String> ids, List<Expressao> exps) {
			this.ids = ids;
			this.exps = exps;
		}

		@Override
		public void execute() {
			// CRUCIAL: Avaliar todas expressões ANTES de atribuir
			// Isso permite a,b := b,a funcionar corretamente
			List<Integer> valores = new ArrayList<>();
			for (Expressao exp : exps) {
				valores.add(exp.getValor());
			}
			// Agora atribuir os valores
			for (int i = 0; i < ids.size(); i++) {
				ambiente.put(ids.get(i), valores.get(i));
			}
		}
	}

	/*
	 * Expressoes
	 */

	abstract class OpBin<T> {
		protected final T esq;
		protected final T dir;

		OpBin(T esq, T dir) {
			this.esq = esq;
			this.dir = dir;
		}
	}

	abstract class OpUnaria<T> {
		protected final T operando;

		OpUnaria(T operando) {
			this.operando = operando;
		}
	}

	class Inteiro implements Expressao {
		private final int valor;

		Inteiro(int valor) {
			this.valor = valor;
		}

		@Override
		public int getValor() {
			return valor;
		}
	}

	class Id implements Expressao {
		private final String id;

		Id(String id) {
			this.id = id;
		}

		@Override
		public int getValor() {
			return ambiente.getOrDefault(id, 0);
		}
	}

	Leia leia = new Leia();

	class Leia implements Expressao {
		@Override
		public int getValor() {
			return scanner.nextInt();
		}
	}

	class ExpSoma extends OpBin<Expressao> implements Expressao {
		ExpSoma(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public int getValor() {
			return esq.getValor() + dir.getValor();
		}
	}

	class ExpSub extends OpBin<Expressao> implements Expressao {
		ExpSub(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public int getValor() {
			return esq.getValor() - dir.getValor();
		}
	}

	class ExpMult extends OpBin<Expressao> implements Expressao {
		ExpMult(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public int getValor() {
			return esq.getValor() * dir.getValor();
		}
	}

	class ExpDiv extends OpBin<Expressao> implements Expressao {
		ExpDiv(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public int getValor() {
			return esq.getValor() / dir.getValor();
		}
	}

	class ExpPow extends OpBin<Expressao> implements Expressao {
		ExpPow(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public int getValor() {
			return (int) Math.pow(esq.getValor(), dir.getValor());
		}
	}

	class Booleano implements Bool {
		private final boolean valor;

		Booleano(boolean valor) {
			this.valor = valor;
		}

		@Override
		public boolean getValor() {
			return valor;
		}
	}

	class ExpIgual extends OpBin<Expressao> implements Bool {
		ExpIgual(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() == dir.getValor();
		}
	}

	class ExpMenorIgual extends OpBin<Expressao> implements Bool {
		ExpMenorIgual(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() <= dir.getValor();
		}
	}

	class ExpMenor extends OpBin<Expressao> implements Bool {
		ExpMenor(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() < dir.getValor();
		}
	}

	class ExpMaior extends OpBin<Expressao> implements Bool {
		ExpMaior(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() > dir.getValor();
		}
	}

	class ExpMaiorIgual extends OpBin<Expressao> implements Bool {
		ExpMaiorIgual(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() >= dir.getValor();
		}
	}

	class ExpDiferente extends OpBin<Expressao> implements Bool {
		ExpDiferente(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() != dir.getValor();
		}
	}

	class NaoLogico extends OpUnaria<Bool> implements Bool {
		NaoLogico(Bool operando) {
			super(operando);
		}

		@Override
		public boolean getValor() {
			return !operando.getValor();
		}
	}

	class ELogico extends OpBin<Bool> implements Bool {
		ELogico(Bool esq, Bool dir) {
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() && dir.getValor();
		}
	}

	class OuLogico extends OpBin<Bool> implements Bool {
		OuLogico(Bool esq, Bool dir) {
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() || dir.getValor();
		}
	}

	class XorLogico extends OpBin<Bool> implements Bool {
		XorLogico(Bool esq, Bool dir) {
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() ^ dir.getValor();
		}
	}
}
