/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosusuario;

/**
 *
 * @author juanv
 */
public class DatosUsuario {

    //Atributos globales
    String nombre = "";
    int edad = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Instancia de la calse
        DatosVehiculo instClass = new DatosVehiculo();
        System.out.println(instClass.informacion_vehiculo());
        instClass.informacion_vehiculo_m();
    }

}
