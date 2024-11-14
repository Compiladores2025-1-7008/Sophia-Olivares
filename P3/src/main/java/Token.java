package main.java;

public class Token {
    private int clase;      // Clase léxica del token (usando los valores definidos en ClaseLexica)
    private String lexema;  // Representación textual del token

    /**
     * Constructor de la clase Token.
     * @param clase Clase léxica del token.
     * @param lexema El texto que representa el token.
     */
    public Token(int clase, String lexema) {
        this.clase = clase;
        this.lexema = lexema;
    }

    /**
     * @return La clase léxica del token.
     */
    public int getClaseLexica() {
        return clase;
    }

    /**
     * @return El lexema del token.
     */
    public String getLexema() {
        return lexema;
    }

    /**
     * Representación en cadena del token.
     * @return Una representación del token en forma de cadena.
     */
    @Override
    public String toString() {
        return "<" + this.clase + ", " + this.lexema + ">";
    }
}
