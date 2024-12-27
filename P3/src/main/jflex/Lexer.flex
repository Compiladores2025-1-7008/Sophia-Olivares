package main.jflex;

import main.java.ClaseLexica;
import main.java.Token;

%%

%{

// Declaración de atributo para el token actual
public Token actual;
public int getLine() { return yyline + 1; } // Devuelve la línea actual del token

%}

%public
%class Lexer
%standalone
%unicode
%line

// Definición de patrones de caracteres
espacio = [ \t\n]
digit = [0-9]
letter = [a-zA-Z]
identifier = {letter}({letter}|{digit})*

%%

// Ignorar espacios en blanco
{espacio}+ { }

// Palabras reservadas y símbolos terminales
"int" { 
    System.out.println("Encontramos una palabra reservada: int");
    return new Token(ClaseLexica.INT, yytext()); 
}
"float" { 
    System.out.println("Encontramos una palabra reservada: float");
    return new Token(ClaseLexica.FLOAT, yytext()); 
}

// Identificadores
{identifier} { 
    System.out.println("Encontramos un identificador: " + yytext());
    return new Token(ClaseLexica.IDENTIFICADOR, yytext()); 
}

// Números enteros
{digit}+ { 
    System.out.println("Encontramos un número: " + yytext());
    return new Token(ClaseLexica.NUMERO, yytext()); 
}

// Fin de archivo
<<EOF>> { 
    return new Token(ClaseLexica.EOF, "EOF"); 
}

// Caracteres no reconocidos
. { 
    System.err.println("Error léxico en línea " + getLine() + ": símbolo no reconocido " + yytext());
    return new Token(ClaseLexica.ERROR, yytext()); 
}
