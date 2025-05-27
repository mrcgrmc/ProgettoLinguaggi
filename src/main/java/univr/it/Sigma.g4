grammar Sigma;

    //**RULES**
main: funcDef* DEF MAIN block EOF;

block: LCBRAC statement* RCBRAC;

funcDef: DEF FUNC ID LPAR ((TYPEA|TYPES|TYPEF) ID (TILDE (TYPEA|TYPES|TYPEF) ID)*)? RPAR block;
funCall: ID LPAR ((fExp | sExp| array) (TILDE (fExp | sExp| array))*)? RPAR;

statement: IF LPAR bExp RPAR block
           (ELSE block)?                        #ifElseStmt
         | WHILE LPAR bExp RPAR block           #whileStmt
         | FOR ID IN
           LPAR (fExp TILDE)? fExp RPAR block   #forStmt
         | funCall SEMIC                        #funStmt
         | PRINT LPAR sExp? RPAR SEMIC          #printStmt
         | declaration SEMIC                    #decStmt
         | (ID|RETURN) (LSPAR NAT RSPAR)?
           IS (sExp | fExp) SEMIC               #reDecStmt
         | block ND block                       #ndStmt
         | SLY LCBRAC bfComm RCBRAC ARNOLD      #bfStmt
         ;

declaration: DEF TYPES ID IS sExp               #decString
           | DEF TYPEF ID IS fExp               #decFloat
           | DEF TYPEA TILDE (TYPES | TYPEF)
             ID IS array                        #decArray
           ;

array: ID                                       #arrayVar
     | LSPAR (fExp (TILDE fExp)*)? RSPAR        #arrayFloat
     | LSPAR (sExp (TILDE sExp)*)? RSPAR        #arrayString
     ;

//b(oolean)
bExp: sExp EQ sExp                              #sCompare
    | fExp (EQ | LT | GT | LE | GE) fExp        #fCompare
    | LPAR bExp RPAR                            #bPar
    | NOT bExp                                  #not
    | bExp AND bExp                             #and
    | bExp OR bExp                              #or
    ;

//s(tring)
sExp: sAtoms                                    #sAtom
    | sExp PLUS sExp                            #concat
    | LCBRAC fExp RCBRAC                        #floatToString
    ;

sAtoms: ID (LSPAR NAT RSPAR)?                   #sVar
      | STRING                                  #string
      | INPUT LPAR RPAR                         #sInput
      | funCall                                 #sReturn
      ;

//f(loat)
fExp: fAtoms                                    #fAtom
    | LPAR fExp RPAR                            #fPar
    | <assoc=right> fExp POW fExp               #power
    | fExp (MUL | DIV | MOD) fExp               #mulDivMod
    | fExp (PLUS | MINUS) fExp                  #plusMinus
    ;

fAtoms: ID (LSPAR NAT RSPAR)?                   #fVar
      | (FLOAT | NAT | NEG)                     #numbers
      | INPUT LPAR RPAR                         #fInput
      | funCall                                 #fReturn
      ;

//BF rules
bfComm: LT bfComm                               # lt
      | GT bfComm                               # gt
      | PLUS bfComm                             # plus
      | MINUS bfComm                            # minus
      | DOT bfComm                              # dot
      | COMMA bfComm                            # comma
      | LSPAR bfComm RSPAR bfComm               # loop
      |                                         # nil
      ;

    //**TOKENS**
//Keywords:
WHILE: 'while';
FOR: 'for';
IN: 'in';
IF: 'if';
ELSE: 'else';
PRINT: 'print';
INPUT: 'input';
RETURN: 'ret';
SLY: 'sly' ;
ARNOLD: 'arnold' ;
ND: 'ND' ;
TYPES: 'STRING';
TYPEF: 'FLOAT';
TYPEA: 'ARRAY';
FUNC: 'FUNC';
MAIN: 'MAIN';

//Simboli operazionali, booleani e di declaration (o statement)
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
MOD: '%';
POW: '^';

EQ: '=';
LT: '<';
GT: '>';
LE: '<=';
GE: '>=';
NOT: 'not';
AND: 'and';
OR: 'or';

IS: ':';
DEF: '@';
TILDE: '~';
SEMIC: ';';
DOT:'.';
COMMA:',';
LPAR: '(';
RPAR: ')';
LSPAR: '[';
RSPAR: ']';
LCBRAC:'{';
RCBRAC:'}';

//Commenti e identazione
COMMENT:'/*'.*?'*/' -> skip;
LINE_COMMENT:'//'~[\r\n]* -> skip;
WS: [ \n\t\r] -> skip;

//Numeri (Naturali, Negativi e Float)
FLOAT: (NAT | NEG | MINUS '0') DOT DIGIT+;
NEG: MINUS POS;
NAT: '0' | POS;
fragment POS: POSDIGIT DIGIT*;
fragment DIGIT: '0' | POSDIGIT;
fragment POSDIGIT: [1-9];

//Stringhe (con i vari Escape)
STRING: '"'STRCHAR*'"';
fragment STRCHAR: ~["\\] | ESC;
fragment ESC: '\\'[btnfr"\\];

//Identificatori di variabili e funzioni
ID: [a-zA-Z_][a-zA-Z0-9_]*;