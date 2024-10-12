grammar Simple;

/**
    ------------------------------------------
           Analizador Sintáctico
    ------------------------------------------
*/


programa: START sentencia END;

sentencia: (definicion | asignacion | if_sentence | while_sentence) SEMICOLON;

definicion: type DDPOINT VAR (ASSIG literal_value)?
           | ('?int' | '?real' | '?char' | '?bool') DDPOINT VAR('[' NUM ']')? ;

asignacion: VAR ASSIG (literal_value | exp_mat
                       | '[' NUM ']' ASSIG literal_value | exp_mat);

exp_mat: termino (SUM termino | REST termino)*;

termino: factor (MULT factor | REST factor)*;

factor: OPENBRACKET exp_mat CLOSEDBRACKET
      | NUM
      | VAR;


bool: ('True' | 'False') | exp_log EQUAL exp_log;


exp_log
    : exp_log AND exp_log
    | exp_log OR exp_log
    | exp_log HIGH exp_log
    | exp_log LESS exp_log
    | exp_log HEQL exp_log
    | exp_log LEQL exp_log
    | VAR EQUAL (VAR | NUM)
    | NEGT OPENBRACKET exp_log CLOSEDBRACKET
    | OPENBRACKET exp_log CLOSEDBRACKET

    | VAR
    | NUM
    ;


if_sentence: IF OPENBRACKET bool CLOSEDBRACKET OPENKEY sentencia+ CLOSEKEY ENDIF;

while_sentence: WHILE OPENBRACKET bool CLOSEDBRACKET OPENKEY sentencia+ CLOSEKEY ENDWHILE;

type: DEFINT | DEFREAL | DEFCHAR;

literal_value: NUM | CHAR | bool;


/**
    ------------------------------------------
           Analizador Léxico Gramatico
    ------------------------------------------
*/

start
:
	'hello' 'world'
;



// Palabras reservadas
START: 'start:';
END: 'end';
DEFINT: 'int';
DEFREAL: 'real';
DEFCHAR: 'char';
IF: 'if';
ENDIF: 'endif';
WHILE: 'while';
ENDWHILE: 'endwhile';
TRUE: 'True';
FALSE: 'False';

// Operadores matemáticos
SUM: '+';
REST: '-';
MULT: '*';

// Operadores de comparación
HIGH: '>';
LESS: '<';
HEQL: '>=';
LEQL: '<=';
UNEQL: '!=';
AND: '&&';
OR: '||';
EQUAL: '==';
NEGT: '¬';

// Asignación
ASSIG: '<<';

// Puntos
DOUPOINT: ':';
DDPOINT: '::';
SEMICOLON: ';';

// Paréntesis
OPENBRACKET: '(';
CLOSEDBRACKET: ')';

// Llaves
OPENKEY: '{';
CLOSEKEY: '}';

// Números
NUM: '-'? [0-9]+ ('.' [0-9]+)?;

// Caracteres (variables)
CHAR: [a-zA-Z_];

// Variable
VAR: 'var' [0-9] [0-9] [0-9];

// Espacios en blanco
SW: [ \t\r\n]+ -> skip;


