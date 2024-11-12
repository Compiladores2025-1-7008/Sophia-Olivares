package main.java;

/**
 * Clase Token
 *
 * Representa un token generado por el analizador léxico, que incluye una clase léxica y el lexema asociado.
 * La clase contiene métodos para obtener la clase léxica y el lexema, y un método toString() para
 * representar el token en el formato "<ClaseLexica, lexema>".
 */
public class Token {
    private ClaseLexica clase;  // Clase léxica del token
    private String lexema;      // Lexema del token

    /**
     * Constructor para inicializar el token con una clase léxica y su lexema.
     *
     * @param clase Clase léxica del token
     * @param lexema Lexema asociado al token
     */
    public Token(ClaseLexica clase, String lexema) {
        this.clase = clase;
        this.lexema = lexema;
    }

    /**
     * Obtiene la clase léxica del token.
     *
     * @return Clase léxica del token
     */
    public ClaseLexica getClase() {
        return clase;
    }

    /**
     * Obtiene el lexema del token.
     *
     * @return Lexema del token
     */
    public String getLexema() {
        return lexema;
    }

    /**
     * Representación del token en formato "<ClaseLexica, lexema>".
     *
     * @return String que representa el token en el formato esperado
     */
    @Override
    public String toString() {
        return "<" + clase + ", " + lexema + ">";
    }
}

