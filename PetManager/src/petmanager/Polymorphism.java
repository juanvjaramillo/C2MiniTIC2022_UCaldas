/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import Classes.*;
/**
 * Todos los archivos de un mismo package se pueden importar usando el * como se hizo en la linea anterior.
 * import Classes.clsCat;
 * import Classes.clsDoctor;
 * import Classes.clsDog;
 * import Classes.clsVeterinary;
*/
/**
 *
 * @author juanv
 */
public class Polymorphism {
    public static void main(String[] args) {
        //POLIMORFISMO PURO
        
        // Instancias de las clases hijas
        clsDog dog = new clsDog("Criollo", false, "001", "Firulais", 2015, "Negro", "Sano");
        clsCat cat = new clsCat("Angora", "001", "Minino", 2018, "Blanco y negro", "Enfermo");
        
        
        //Antes de instancias la clase veterinaria, debo instanciar un doctor.
        clsDoctor doctor = new clsDoctor("Maria Fernandez", "L12345");
        //Instancias de veterinaria 
        clsVeterinary veterinary = new clsVeterinary("Veterinary UdC", "(036)878 15 00", "Calle 65 No. 26-10", doctor);
        
        String carePet1 = veterinary.PetCare(dog);
        System.out.println("El estado de salud de " + dog.getName() + " es " + carePet1);
         
        String carePet2 = veterinary.PetCare(cat);
        System.out.println("El estado de salud de " + cat.getName() + " es " + carePet2);        
    }
}
