grammar Simple;

/**
    ------------------------------------------
           Analizador Sintáctico
    ------------------------------------------
*/


programa: START sentencia END;

sentencia: (definicion | asignacion | if_sentence | while_sentence) SEMICOLON;

definicion: type DDPOINT VAR ('<<<' literal_value)?
           | ('?int' | '?real' | '?char' | '?bool') DDPOINT VAR('[' NUM ']')? ;

asignacion: VAR ('<<<' (literal_value | exp_mat)
                       | '[' NUM ']' '<<<' (literal_value | exp_mat));

exp_mat: termino (SUM termino | REST termino)*;

termino: factor (MULT factor | REST factor)*;

factor: OPENBRACKET exp_mat CLOSEDBRACKET
      | NUM
      | VAR;


bool: ('0' | '1') | exp_log;


exp_log: VAR EQUAL (VAR | NUM)
        | NEGT OPENBRACKET (bool | VAR) CLOSEDBRACKET
        | exp_log EQUAL exp_log;


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



