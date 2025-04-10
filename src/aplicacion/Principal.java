package aplicacion;

import palabras.CalculadoraDistancias;

public class Principal{
    public static void main(String[] args){
        String s1 =" intenti";
        String s2 =" execution";
        System.out.println("La distancia entre las palabras " + s1 + " y " + s2 + " es " +
                            CalculadoraDistancias.calcularDistancia(s1, s2));
    }
}
