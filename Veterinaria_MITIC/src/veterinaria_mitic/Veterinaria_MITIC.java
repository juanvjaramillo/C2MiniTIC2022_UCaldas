/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria_mitic;
import java.util.Date;
/**
 *
 * @author juanv
 */
public class Veterinaria_MITIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciamiento de las clases
        MascotaClass inst_mascota = new MascotaClass();
            // Para trabajr con Date se debe importar java.util.Date
            // y se debe instanciar la clase como se hace a continuacion
        Date fecha_actual = new Date();
        
        
        
        // Asignamos fecha actual como fecha de nacimiento.
        final int ANNO_BASE = 1900; //Este año se usa como base para trabajar con la librería java.util.Date
        //Date fecha_nacimiento = fecha_actual;
        
        //Ahora solo queremos obtener el año actual
        int anno_actual = ANNO_BASE + (fecha_actual.getYear());
        
        //Mediante las instancias llamamos los métodos SET del encapsulamiento para asignar valor
        inst_mascota.setNombre_mascota("Rocky");
        inst_mascota.setFecha_nacimiento(anno_actual);
        inst_mascota.setRaza("Golden");
        inst_mascota.setColor("Café");
        inst_mascota.setHistorial_clinico(true);
        inst_mascota.setNro_documento_propietario(22222);
        //inst_mascota.setVacunas(false);
        
        // Consultamos el valor de ciertas variables mediante la función GET del encapsulamiento de la clsse de origen.
        System.out.println("Nombre mascota: " + inst_mascota.getNombre_mascota() + "\nFecha nacimiento: " + inst_mascota.getFecha_nacimiento() + "\n¿Cuenta con historial clínico? " + inst_mascota.isHistorial_clinico() + "\nNúmero de documento del dueño: " + inst_mascota.getNro_documento_propietario() + "\nVacunación al día?: " + inst_mascota.isVacunas());
    }
    
}
