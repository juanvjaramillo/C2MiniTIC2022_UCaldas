/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionii_jsv;

/**
 *
 * @author juanv
 */
public class VehiculoClass {
    //Declarar las sigueintes variables: marca, modelo, color, cilindraje, placa, disponibilidad
    String marca = "Mazda", placa = "MIN202", color = "Rose";
    int modelo = 2022, cilindraje = 1000;
    boolean disponibildad = false;
    
    //Función que retorna la marca y el modelo de vehiculo si se ncuentra disponible de visibilidad pública
    public boolean disponibilidad_vehiculo (String a_marca, int a_modelo) {
        if(a_marca == marca && a_modelo == modelo){
            disponibildad = true;
        } else {
            //Mostramos mensaje informativo al usuario que indique la marca y el modelo disponible
            System.out.println("Solo tenemos vehiculos disponibles con las siguientes características: " + marca + " modelo " + modelo);
            disponibildad = false;
        }
        return disponibildad;
    }
}
