package main.java;

public interface ParserInterface {
    /**
     * Método para iniciar el proceso de análisis sintáctico.
     */
   public void parse();

    /**
     * Método para consumir el token actual y avanzar al siguiente, si coincide con la clase léxica especificada.
     * @param claseLexica El tipo de token esperado.
     */
        public void eat(int claseLexica);

    /**
     * Método para manejar errores de sintaxis cuando ocurre un token inesperado.
     * @param msg El mensaje de error que describe el problema.
     */
   public void error(String msg);

    /**
     * Método que representa la producción inicial de la gramática.
     */
    public void programa();
    
    /**
     * Método para analizar las declaraciones en la gramática.
     */
    public void declaraciones();
    
    /**
     * Método para analizar una sola declaración.
     */
   public void declaracion();
    
    /**
     * Método para analizar el tipo de una declaración.
     */
    public void tipo();
    
    /**
     * Método para analizar la lista de variables en una declaración.
     */
    public void lista_var();
    
    /**
     * Método para analizar el resto de la lista de variables.
     */
   public void lista_var_prime();
    
    /**
     * Método para analizar las sentencias de la gramática.
     */
   public void sentencias();
    
    /**
     * Método para analizar una sentencia en particular.
     */
   public void sentencia();
    
    /**
     * Método para analizar expresiones.
     */
    public void expresion();
    
    /**
     * Método para analizar el resto de una expresión.
     */
    public void expresion_prime();
    
    /**
     * Método para analizar términos en una expresión.
     */
   public void termino();
    
    /**
     * Método para analizar el resto de un término.
     */
  public  void termino_prime();
    
    /**
     * Método para analizar factores en una expresión.
     */
   public void factor();
}
