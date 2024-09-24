grammar Simple;

//Definicion del Analizador Sintactico

inicio_fin: START DOUPOINT programa END;

programa: sentencia SEMICOLON programa | sentencia;

sentencia: definicion | asignacion | if_sentencia | while_sentencia;

definicion: DEFINT DDPOINT VAR ASSIG ENTERO SEMICOLON |
			DEFREAl DDPOIN VAR ASSIG REAL SEMICOLON |
			DEFCHAR DDPOIN VAR ASSIG CHAR SEMICON |
			DEFBOOL DDPOIN VAR ASSIG BOOL SEMICON |
			QUERY DEFINT DDPOINT VAR |
			QUERY DEFREAL DDPOINT VAR |
			QUERY DEFCHAR DDPOINT VAR
			QUERY DEFBOOL DDPOINT VAR |
			QUERY DEFREAL DDPOINT VAR OPENBRACKET ENTERO CLOSEBRACKET |
			QUERY DEFCHAR DDPOINT VAR OPENBRACKET ENTERO CLOSEBRACKET |
			QUERY DEFBOOL DDPOINT VAR OPENBRACKET ENTERO CLOSEBRACKET
			;

asignacion: VAR ASSIG ENTERO |
			VAR ASSIG REAL |
			VAR ASSIG CHAR |
			VAR ASSIG BOOL |
			VAR OPENBRACKET ENTERO CLOSEBRACKET REAL |
			VAR OPENBRACKET ENTERO CLOSEBRACKET ENTERO |
			VAR OPENBRACKET ENTERO CLOSEBRACKET BOOL |
			;

if_sentencia:;

while_sentencia:;


//Definicion del Analizador Léxico Gramatico
start
:
	'hello' 'world'
;

// Palabras reservadas
START: 'start';
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


