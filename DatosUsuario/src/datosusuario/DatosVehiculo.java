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
public class DatosVehiculo {
    //Declaramos una función pública
    //Tipo de datos que va a retornar sería un String
    //Estructura: modificador_acceso tipo_dato_retorno nombre_funcion() {}

    public String informacion_vehiculo() {
        // Declarar variables a nivel local de la función
        String placa = "TIC2022";
        int modelo = 2021;
        String marca = "MINITIC";
        String mensaje = placa + " " + modelo + " " + marca;
        //Retornamos u tipo String
        return mensaje;
    }

    //Método: Cuando se trabaja con métodos en Java siempre se debe utilizar la palabra reservada Void
    public void informacion_vehiculo_m() {
        String placa = "TIC2022";
        int modelo = 2021;
        String marca = "MINITIC_Método";
        System.out.println(placa + " " + modelo + " " + marca);
    }
}
