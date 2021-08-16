/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import Classes.clsDoctor;
import Classes.clsVeterinary;

/**
 *
 * @author juanv
 */
public class AbstractClass {
    public static void main(String[] args) {
        
        // Instancias de doctor y veterinaria.
        clsDoctor doctor = new clsDoctor("Maria Fernandez", "L12345");
        clsVeterinary veterinary = new clsVeterinary("Veterinary UdC", "(036)878 15 00", "Calle 65 No. 26-10", doctor);
        
        //Creamos un hospital para ser leido en los datos
        veterinary.setData(veterinary.getName() + " - Adress: " + veterinary.getAddress() + " - Phone: " + veterinary.getPhone());
        
        String data = veterinary.getHospitalInformation();
        String type = veterinary.getPatienType();
        String surgery = veterinary.Surgery();

        System.out.println("Data " + data);
        System.out.println("Type " + type);
        System.out.println("Surgery " + surgery);
    }
}
