/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputPackage;

import sesionii_jsv.*;

/**
 *
 * @author juanv
 */
public class ConductorClass {

    //Creamos las siguientes variables. nombre, matricula, categoria_pase, multa, nro_documento
    String nombre_propietario = "";
    int nro_documento = 0;
    char categoria_pase;
    String tipo_infraccion = "";
    boolean multar = false;

    //Función
    public boolean asignar_multa(int doc_id, String nombre_conductor, String infraccion) {
        nombre_propietario = nombre_conductor;
        nro_documento = doc_id;
        tipo_infraccion = infraccion;

        if (tipo_infraccion != "") {
            System.out.println(nombre_propietario + ", se le impondrá una multa por la infracción " + tipo_infraccion);
            multar = true;
        } else {
            System.out.println(nombre_propietario + ", felicitaciones te salvaste de la ");
        }

        return multar;
    }

    // Método
    public void asignar_multa_m(int doc_id, String nombre_conductor, String infraccion) {
        nombre_propietario = nombre_conductor;
        nro_documento = doc_id;
        tipo_infraccion = infraccion;

        if (tipo_infraccion != "") {
            System.out.println(nombre_propietario + ", se le impondrá una multa por la infracción " + tipo_infraccion + " a ");
            multar = true;
        } else {
            System.out.println(nombre_propietario + ", felicitaciones te salvaste de la ");
        }
    }

    //Función 2
    //Función
    public String asignar_multa_f(int doc_id, String nombre_conductor, String infraccion) {
        nombre_propietario = nombre_conductor;
        nro_documento = doc_id;
        tipo_infraccion = infraccion;
        String mensaje = "";

        if (tipo_infraccion != "") {
            mensaje = nombre_propietario + ", se le impondrá una multa por la infracción " + tipo_infraccion;
            multar = true;
        } else {
            mensaje =nombre_propietario +  ", felicitaciones te salvaste de la ";
        }

        return mensaje;
    }
}
