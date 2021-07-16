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
public class DatosVehiculo {
    //Declaramos una función de visibilidad pública
    //Tipo de dato que va a retornar sería un String
    //Nombre de la función con (parametros)
    //Estructura: modificador acceso tipo_dato_retorno nombre_funcion(){}
    public String informacion_vehiculo(){
        //Declarar variables a nivel local de la función
        String placa = "TIC202";
        int modelo = 2022;
        String marca = "MINTIC";
        String mensaje = placa + " " + modelo + " " + marca;
        //Retornamos un tipo string  
        return mensaje;
    }
    
    // MÉTODO
    /**
     * Cuando se trabaja con métodos en Java
     * se debe usar la palabra reservada void.
     */
    public void informacion_vehiculo_m() {
        //Declarar variables a nivel local de la función
        String placa = "TIC022";
        int modelo = 2018;
        String marca = "SPACE-X";
        System.out.println(placa + " " + modelo + " " + marca); 
    }
}
