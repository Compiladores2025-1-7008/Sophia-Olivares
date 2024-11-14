/**
 * Escáner que detecta el lenguaje C_1
 */

package main.jflex;

import main.java.ClaseLexica;
import main.java.Token;

%%
%public
%class Lexer
%standalone
%unicode

%{
    public Token actual;
/**
     * Método auxiliar para crear un token.
     *
     * @param clase Clase léxica del token
     * @param lexema Lexema asociado al token
     * @return Token creado con la clase y lexema especificados
     */

    Token t(ClaseLexica clase, String lexema) {
        return new Token(clase, lexema);
    }
%}

/* Definición de patrones */

/* 
 * Palabras clave:
 *    Expresión regular "int": tipo de dato entero.
 *    Expresión regular "float": tipo de dato flotante.
 *    Expresión regular "if":  declaración condicional.
 *    Expresión regular "else": bloque alternativo de una declaración condicional.
 *    Expresión regular: "while":Palabra clave, un ciclo.
 */

int = "int"
float = "float"
if = "if"
else = "else"
while = "while"
num = [0-9]+
floatnum = [0-9]+\.[0-9]+(e[+-]?[0-9]+)?
id = [_a-zA-Z][_a-zA-Z0-9]*
espacio = [ \t\n\r]+
%%

/* Reglas de análisis */
{int}       { actual = t(ClaseLexica.INT, yytext()); return actual; }
{float}     { actual = t(ClaseLexica.FLOAT, yytext()); return actual; }
{if}        { actual = t(ClaseLexica.IF, yytext()); return actual; }
{else}      { actual = t(ClaseLexica.ELSE, yytext()); return actual; }
{while}     { actual = t(ClaseLexica.WHILE, yytext()); return actual; }
{num}       { actual = t(ClaseLexica.NUMERO, yytext()); return actual; }
{floatnum}  { actual = t(ClaseLexica.NUMERO, yytext()); return actual; }
{id}        { actual = t(ClaseLexica.ID, yytext()); return actual; }
";"         { actual = t(ClaseLexica.PYC, yytext()); return actual; }
","         { actual = t(ClaseLexica.COMA, yytext()); return actual; }
"("         { actual = t(ClaseLexica.LPAR, yytext()); return actual; }
")"         { actual = t(ClaseLexica.RPAR, yytext()); return actual; }
{espacio}   { /* Ignorar espacios en blanco */ }
.           { System.err.println("Caracter inesperado: " + yytext()); }
