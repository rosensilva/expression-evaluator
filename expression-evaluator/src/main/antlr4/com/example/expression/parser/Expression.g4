// Expression.g4
grammar Expression;

expression
    : logicalExpression EOF
    ;

logicalExpression
    : comparisonExpression (('and' | 'or') comparisonExpression)*
    ;

comparisonExpression
    : arithmeticExpression (('==' | '!=' | '<' | '<=' | '>' | '>=') arithmeticExpression)?
    ;

arithmeticExpression
    : term (('+' | '-') term)*
    ;

term
    : factor (('*' | '/' | '%') factor)*
    ;

factor
    : functionCall
    | literal
    | variableReference
    | attributeReference
    | payloadReference
    | '(' logicalExpression ')'
    | operator=('+' | '-' | 'not') factor
    ;

functionCall
    : IDENTIFIER '(' argumentList? ')'
    ;

argumentList
    : logicalExpression (',' logicalExpression)*
    ;

variableReference
    : 'vars' '.' IDENTIFIER
    ;

attributeReference
    : 'attributes' '.' IDENTIFIER ('.' IDENTIFIER)*
    ;

payloadReference
    : 'payload' propertyPath
    ;

propertyPath
    : ('.' IDENTIFIER | '[' STRING_LITERAL ']' | '[' NUMBER ']' | '[' logicalExpression ']')+
    ;

literal
    : NUMBER
    | STRING_LITERAL
    | BOOLEAN_LITERAL
    | NULL_LITERAL
    ;

IDENTIFIER
    : [a-zA-Z_] [a-zA-Z0-9_]*
    ;

NUMBER
    : [0-9]+ ('.' [0-9]+)?
    ;

STRING_LITERAL
    : '\'' ( ~['\\] | '\\' . )* '\''
    | '"' ( ~["\\] | '\\' . )* '"'
    ;

BOOLEAN_LITERAL
    : 'true'
    | 'false'
    ;

NULL_LITERAL
    : 'null'
    ;

WHITESPACE
    : [ \t\r\n]+ -> skip
    ;

COMMENT
    : '//' ~[\r\n]* -> skip
    ;
