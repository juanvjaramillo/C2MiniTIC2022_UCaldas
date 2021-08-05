/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroduction;

/**
 *
 * @author juanv
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variables en JAVA
        // Tipo de dato
        // Nombre
        // [Valor inicial]
        int edad = 15;
        String nombre = "Juan";
        boolean es_hombre = true;

        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " es menor de edad.");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("El valor de i es: " + i);
        }

    }

}
