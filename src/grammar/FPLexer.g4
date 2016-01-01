lexer grammar FPLexer;

DOT: '.';
FUN_ID: [a-z][a-zA-Z_0-9]+;
NUM: ('-')?['0-9]+;
BOOL: 'TRUE' | 'FALSE';

/* ignore whitespace */
WS: [ \n\t] -> skip;

