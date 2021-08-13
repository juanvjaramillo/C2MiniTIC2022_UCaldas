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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Instancias de clases
        VehiculoClass inst_vehiculo = new VehiculoClass();
        ConductorClass inst_conductor = new ConductorClass();
        // Como la función recibe dos parametros, los debo inicializar desde acá 
        //System.out.println(inst_vehiculo.disponibilidad_vehiculo("Mazda", 2022));

        // En este caso la función recibe tres parametros, los inicializo e n este punto.
        inst_conductor.asignar_multa(1053, "Yaneth", "Exceso de Velocidad");
        System.out.println(inst_conductor.asignar_multa_f(1053, "Yaneth M", "Mal estacionado"));
        inst_conductor.asignar_multa_m(10537, "Juan", "Adelantar en doble linea");
    }
}
