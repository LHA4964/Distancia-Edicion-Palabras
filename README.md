# Proyecto de Cálculo de Distancia de Edición
Este proyecto calcula la distancia de edición entre dos cadenas utilizando el algoritmo de Levenshtein.

## Estructura del Proyecto
El proyecto está dividido en dos paquetes principales:
1. **aplicacion**: Contiene la clase `Principal` que maneja la entrada del usuario y muestra el resultado.
2. **palabras**: Contiene la clase `CalculadoraDistancias` que realiza el cálculo de la distancia de edición.

## Clases
### Principal
La clase `Principal` se encarga de:
- Definir las cadenas de texto a comparar.
- Llamar al método `calcularDistancia` de la clase `CalculadoraDistancias`.
- Mostrar la distancia de edición entre las dos cadenas.

### CalculadoraDistancias
La clase `CalculadoraDistancias` se encarga de:
- Inicializar la matriz de distancias.
- Calcular la distancia de edición utilizando el algoritmo de Levenshtein.
- Devolver la distancia calculada.

## Cómo Ejecutar el Proyecto
1. Clona el repositorio en tu máquina local.
2. Navega al directorio del proyecto.
3. Compila las clases con el siguiente comando:
    ```sh
    javac aplicacion/Principal.java palabras/CalculadoraDistancias.java
    ```
4. Ejecuta el programa con el siguiente comando:
    ```sh
    java aplicacion.Principal
    ```
5. El programa mostrará la distancia de edición entre las dos cadenas definidas en la clase `Principal`.

## Diagrama UML
!UML.png

## Descripción del Algoritmo de Levenshtein
El algoritmo de Levenshtein es una técnica para medir la diferencia entre dos secuencias de caracteres. La distancia de Levenshtein entre dos cadenas es el número mínimo de operaciones requeridas para transformar una cadena en la otra, donde una operación puede ser una inserción, eliminación o sustitución de un solo carácter.

## Autor
Luis Holgado Arranz y Jesús Alejandro Hernández Méndez