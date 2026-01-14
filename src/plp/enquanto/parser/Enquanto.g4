grammar Enquanto;

programa : seqComando;     // sequência de comandos

seqComando: comando+ ;

comando: ID (',' ID)* ':=' expressao (',' expressao)* ';'   # atribuicao
       | 'skip' ';'                                      # skip
       | 'se' booleano 'entao' comando ('senaose' booleano 'entao' comando)* ('senao' comando)?   # se
       | 'enquanto' booleano 'faca' comando              # enquanto
       | 'repita' expressao 'vezes' comando              # repita
       | 'para' ID 'de' expressao 'ate' expressao 'faca' comando  # para
       | 'escolha' expressao ('caso' INT ':' comando)+ ('outro' ':' comando)?  # escolha
       | 'exiba' TEXTO ';'                               # exibaTexto
       | 'exiba' expressao ';'                           # exibaExp
       | 'escreva' expressao ';'                         # escreva
       | '{' seqComando '}'                              # bloco
       ;

expressao: INT                                           # inteiro
         | 'leia'                                        # leia
         | ID                                            # id
         | expressao '^' expressao                       # opBin
         | expressao ('*' | '/') expressao               # opBin
         | expressao ('+' | '-') expressao               # opBin
         | '(' expressao ')'                             # expPar
         ;

booleano: BOOLEANO                                       # bool
        | expressao ('=' | '<=' | '<' | '>=' | '>' | '<>') expressao  # opRel
        | 'nao' booleano                                 # naoLogico
        | booleano 'e' booleano                          # eLogico
        | booleano 'ou' booleano                         # ouLogico
        | booleano 'xor' booleano                        # xorLogico
        | '(' booleano ')'                               # boolPar
        ;


BOOLEANO: 'verdadeiro' | 'falso';
INT: ('0'..'9')+ ;
ID: ('a'..'z')+;
TEXTO: '"' .*? '"';

Comentario: '#' .*? '\n' -> skip;
Espaco: [ \t\n\r] -> skip;