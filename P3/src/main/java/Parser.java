package main.java;

import java.io.IOException;
import main.jflex.Lexer;

public class Parser implements ParserInterface {
    private Lexer lexer;
    private int actual;

    public Parser(Lexer lexer) {
        this.lexer = lexer;
    }

    public void eat(int claseLexica) {
        if (actual == claseLexica) {
            try {
                actual = lexer.yylex();
            } catch (IOException ioe) {
                System.err.println("Error de lectura del siguiente token");
            }
        } else {
            error("Se esperaba el token: " + claseLexica + " pero se encontró: " + actual);
        }
    }

    public void error(String msg) {
        System.err.println("ERROR DE SINTAXIS: " + msg + " en la línea " + lexer.getLine());
        System.exit(1);
    }

    public void parse() {
        try {
            this.actual = lexer.yylex();
        } catch (IOException ioe) {
            System.err.println("Error: No se pudo obtener el primer token de la entrada.");
            System.exit(1);
        }
        programa();
        if (actual == ClaseLexica.EOF) // Si llegamos al EOF sin errores
            System.out.println("La cadena es aceptada");
        else
            error("La cadena no pertenece al lenguaje generado por la gramática");
    }

    // Método inicial de la gramática
    public void programa() {
        declaraciones();
        sentencias();
    }

    public void declaraciones() {
        if (actual == ClaseLexica.INT || actual == ClaseLexica.FLOAT) {
            declaracion();
            declaraciones();
        } // Lambda, no se requiere acción adicional
    }

    public void declaracion() {
        tipo();
        lista_var();
        eat(ClaseLexica.PUNTO_Y_COMA);
    }

    public void tipo() {
        if (actual == ClaseLexica.INT) {
            eat(ClaseLexica.INT);
        } else if (actual == ClaseLexica.FLOAT) {
            eat(ClaseLexica.FLOAT);
        } else {
            error("Se esperaba un tipo ('int' o 'float')");
        }
    }

    public void lista_var() {
        if (actual == ClaseLexica.IDENTIFICADOR) {
            eat(ClaseLexica.IDENTIFICADOR);
            lista_var_prime();
        } else {
            error("Se esperaba un identificador en lista_var");
        }
    }

    public void lista_var_prime() {
        if (actual == ClaseLexica.COMA) {
            eat(ClaseLexica.COMA);
            eat(ClaseLexica.IDENTIFICADOR);
            lista_var_prime();
        }
        // Lambda, no se requiere acción adicional
    }

    public void sentencias() {
        if (actual == ClaseLexica.IDENTIFICADOR || actual == ClaseLexica.IF || actual == ClaseLexica.WHILE) {
            sentencia();
            sentencias();
        }
        // Lambda, no se requiere acción adicional
    }

    public void sentencia() {
        if (actual == ClaseLexica.IDENTIFICADOR) {
            eat(ClaseLexica.IDENTIFICADOR);
            eat(ClaseLexica.IGUAL);
            expresion();
            eat(ClaseLexica.PUNTO_Y_COMA);
        } else if (actual == ClaseLexica.IF) {
            eat(ClaseLexica.IF);
            eat(ClaseLexica.PARENTESIS_IZQ);
            expresion();
            eat(ClaseLexica.PARENTESIS_DER);
            sentencias();
            eat(ClaseLexica.ELSE);
            sentencias();
        } else if (actual == ClaseLexica.WHILE) {
            eat(ClaseLexica.WHILE);
            eat(ClaseLexica.PARENTESIS_IZQ);
            expresion();
            eat(ClaseLexica.PARENTESIS_DER);
            sentencias();
        } else {
            error("Sentencia inválida");
        }
    }

    public void expresion() {
        termino();
        expresion_prime();
    }

    public void expresion_prime() {
        if (actual == ClaseLexica.MAS) {
            eat(ClaseLexica.MAS);
            termino();
            expresion_prime();
        } else if (actual == ClaseLexica.MENOS) {
            eat(ClaseLexica.MENOS);
            termino();
            expresion_prime();
        }
        // Lambda, no se requiere acción adicional
    }

    public void termino() {
        factor();
        termino_prime();
    }

    public void termino_prime() {
        if (actual == ClaseLexica.POR) {
            eat(ClaseLexica.POR);
            factor();
            termino_prime();
        } else if (actual == ClaseLexica.DIV) {
            eat(ClaseLexica.DIV);
            factor();
            termino_prime();
        }
        // Lambda, no se requiere acción adicional
    }

    public void factor() {
        if (actual == ClaseLexica.IDENTIFICADOR) {
            eat(ClaseLexica.IDENTIFICADOR);
        } else if (actual == ClaseLexica.NUMERO) {
            eat(ClaseLexica.NUMERO);
        } else if (actual == ClaseLexica.PARENTESIS_IZQ) {
            eat(ClaseLexica.PARENTESIS_IZQ);
            expresion();
            eat(ClaseLexica.PARENTESIS_DER);
        } else {
            error("Factor inválido");
        }
    }
}
