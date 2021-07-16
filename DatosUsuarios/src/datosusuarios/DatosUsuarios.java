/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosusuarios;

/**
 *
 * @author juanv
 */
public class DatosUsuarios {
    //Atributos globales
    String nombre = "";
    int edad = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre_formador = "Yaneth Mejía";
        char genero = 'F';
        int edad = 30;
        
        //Validar si el usuario es mayor de edad
        if(edad > 17){
            System.out.println(nombre_formador + " es Mayor de edad");
        }else{
            System.out.println(" es menor de edad");
        }

    }

}
