/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria_mitic;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
        //Se intancias las clases SimpleFormat("FormatoParametro"") como tipo DateFormat
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Se requiere el java.text para manejar este objeto

        //Ahora solo queremos obtener la fecha con el foprmato creado
        String fecha_nacimiento = dateFormat.format(fecha_actual);
        
        //Mediante las instancias llamamos los métodos SET del encapsulamiento para asignar valor
        inst_mascota.setNombre_mascota("Rocky");
        inst_mascota.setFecha_nacimiento(fecha_nacimiento);
        inst_mascota.setRaza("Golden");
        inst_mascota.setColor("Café");
        inst_mascota.setHistorial_clinico(true);
        inst_mascota.setNro_documento_propietario(22222);
        //inst_mascota.setVacunas(false);
        
        // Consultamos el valor de ciertas variables mediante la función GET del encapsulamiento de la clsse de origen.
        System.out.println("Nombre mascota: " + inst_mascota.getNombre_mascota() + "\nFecha nacimiento: " + inst_mascota.getFecha_nacimiento() + "\n¿Cuenta con historial clínico? " + inst_mascota.isHistorial_clinico() + "\nNúmero de documento del dueño: " + inst_mascota.getNro_documento_propietario() + "\nVacunación al día?: " + inst_mascota.isVacunas());
    }
    
}
