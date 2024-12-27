package main.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import main.jflex.Lexer;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Error: Se requiere un archivo de entrada.");
            System.exit(1);
        }

        try {
            // Crear el analizador léxico usando el archivo de entrada
            Lexer lexer = new Lexer(new FileReader(args[0]));
            
            // Crear el analizador sintáctico y pasarle el analizador léxico
            Parser parser = new Parser(lexer);
            
            // Iniciar el análisis sintáctico
            parser.parse();
        } catch (FileNotFoundException fnfe) {
            System.err.println("Error: No fue posible leer del archivo de entrada: " + args[0]);
            System.exit(1);
        } catch (IOException ioe) {
            System.err.println("Error: Fallo de lectura del archivo de entrada.");
            System.exit(1);
        }
    }
}
