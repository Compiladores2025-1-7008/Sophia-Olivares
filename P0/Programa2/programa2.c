#include <stdio.h>
#include <stdlib.h>

// Definición de una constante
#define MAX_SIZE 100

// Definición de una macro con argumentos
#define SQUARE(x) ((x) * (x))

// Incluir un archivo de encabezado
#include "config.h"

// Directiva de preprocesador condicional
#ifdef DEBUG
#define LOG(msg) printf("DEBUG: %s\n", msg)
#else
#define LOG(msg) // No hace nada si DEBUG no está definido
#endif

int main(void) {
    // Definir una variable utilizando la constante MAX_SIZE
    int array[MAX_SIZE];
    
    // Inicializar el array
    for (int i = 0; i < MAX_SIZE; i++) {
        array[i] = SQUARE(i);
    }
    
    // Imprimir algunos valores del array
    for (int i = 0; i < 10; i++) {
        printf("array[%d] = %d\n", i, array[i]);
    }

    // Usar la macro LOG para depuración
    LOG("Array inicializado con éxito.");

    return 0;
}
