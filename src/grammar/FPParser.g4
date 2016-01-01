grammar FPParser;

import FPLexer;

program: (definition | expression)+;

definition: 'DEF' FUN_ID '=' functional_form;

expression: functional_form ':' expression
            | atom;


functional_form : 'APPLY-ALL' functional_form         #applyAll
                 | 'INSERT-LEFT' functional_form      #insertLeft
                 | 'INSERT-RIGHT' functional_form     #insertRight
                 | construction                       #constructionLabel
                 | conditional                        #conditionalLabel
                 | constant                           #constantLabel
                 | '(' functional_form')'             #parenths
                 | functional_form DOT functional_form #composition
                 | function                           #elementary;

construction:   '[' functional_form (',' functional_form)* ']';
conditional:    '(' functional_form '->'
                               functional_form ';'
                               functional_form
                         ')';
constant: '~' NUM;


function :  built_in_function
            | FUN_ID;

built_in_function: NUM          #num
                   | 'tail'     #tail
                   | 'id'       #id
                   | 'eq'       #eq
                   | 'eq0'      #eq0
                   | 'gt'       #gt
                   | 'ge'       #ge
                   | ('*' | '/' | '+' | '-') #arithmetic
                   | 'a'        #a
                   | 's'        #s
                   | 'apndl'    #apndl
                   | 'apndr'    #apndr
                   | 'distl'    #distl
                   | 'distr'    #distr
                   | 'iota'     #iota;

atom: NUM
      | BOOL
      | list;

list: '<>'
      | '<' atom (',' atom)* '>';