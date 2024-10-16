grammar Rusticode;

/**
    ------------------------------------------
           Analizador Sintáctico
    ------------------------------------------
*/


programa: START sentencia+ END;

sentencia: (definicion | asignacion | if_sentence | while_sentence) SEMICOLON;


//definicion: type DDPOINT VAR (ASSIG literal_value)?
   //        | const_type DDPOINT VAR ('[' NUM ']')?;

definicion
    : type DDPOINT VAR            // Definición de variables sin valor inicial
    | type DDPOINT VAR ('[' NUM ']')?
    | const_type DDPOINT VAR    // Definición de constantes sin asignación
    ;

const_type
    : '?int'
    | '?real'
    | '?char'
    ;

asignacion
    : VAR ASSIG (literal_value | exp_mat)    // Asignación a una variable simple
    | VAR '[' NUM ']' ASSIG (literal_value | exp_mat)  // Asignación a una posición en un arreglo
    ;

exp_mat: termino (SUM termino | REST termino)*;

termino: factor (MULT factor | REST factor | DIV factor)*;

factor: OPENBRACKET exp_mat CLOSEDBRACKET
      | NUM
      | VAR;


bool
    : TRUE
    | FALSE
    | exp_log;


exp_log
    : exp_log AND exp_log
    | exp_log OR exp_log
    | exp_log comparador exp_log
    | (VAR | NUM) comparador (VAR | NUM)
    | NEGT OPENBRACKET exp_log CLOSEDBRACKET
    | OPENBRACKET exp_log CLOSEDBRACKET
    ;

comparador
    : HIGH
    | LESS
    | HEQL
    | LEQL
    | EQUAL
    | UNEQL
    ;


if_sentence: IF OPENBRACKET exp_log CLOSEDBRACKET OPENKEY sentencia+ CLOSEKEY ENDIF;

while_sentence: WHILE OPENBRACKET exp_log CLOSEDBRACKET OPENKEY sentencia+ CLOSEKEY ENDWHILE;

type: DEFINT | DEFREAL | DEFCHAR;

literal_value: NUM | CHAR | bool;


/**
    ------------------------------------------
           Analizador Léxico Gramatico
    ------------------------------------------
*/


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
DIV: '/';

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
CHAR: '\'' [a-zA-Z_] '\'';

// Variable
VAR: 'var' [0-9] [0-9] [0-9];

// Espacios en blanco
SW: [ \t\r\n]+ -> skip;

// Comentarios
COM: '\'' . '\'' | '"' . '"';


