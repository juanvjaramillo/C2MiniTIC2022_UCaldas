/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputPackage;
import java.util.Scanner;

/**
 *
 * @author juanv
 */
public class Principal {
    //psvm + TAB
    public static void main(String[] args) {
        // Instanciamos la clase ConductorClass
        ConductorClass inst_conductor = new ConductorClass();
        // Instancimos la libreria Scanner para ahcer uso de sus funciones
        Scanner entrada_usuario = new Scanner(System.in);
        // Solicitamos al usuario el ingreso de la información
        System.out.println("Ingresa el nombre del infractor: ");
        // Usuario ingresa cadena de texto
        String nombre_conductor = entrada_usuario.nextLine();
        // Solicitamos al usuario el ingreso de la información
        System.out.println("Infracción cometida: ");
        // Solicitamos al usuario el ingre
        String infraccion = entrada_usuario.nextLine();
        // Solicitamos al usuario el ingreso de la información
        System.out.println("Ingresa el número del documento: ");
        // Usuario ingresa números
        int nro_documento = entrada_usuario.nextInt();
        System.out.println(inst_conductor.asignar_multa_f(nro_documento, nombre_conductor, infraccion));
        
    }

}
