/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import Classes.*;
import java.util.Date;

/**
 *
 * @author juanv
 */
public class PetManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Estructura de instancia de clases
        // tipoDato nombre_variable = new MetodoConstructor ();
        clsDog pet1 = new clsDog("Criollo", false, "001", "Firulais", 2015, "Negro", "Sano");
        clsCat pet2 = new clsCat("Angora", "001", "Minino", 2018, "Blanco y negro", "Enfermo");

        Date current_date = new Date();
        int current_year = current_date.getYear();

        int age_pet1 = current_year - pet1.getBorn_year();
        int age_pet2 = current_year - pet2.getBorn_year();

        if (age_pet1 > age_pet2) {
            System.out.println("La mascota " + pet1.getName() + " es mayor que la mascota " + pet2.getName());
        } else {
            if (age_pet2 > age_pet1) {
                System.out.println("La mascota " + pet2.getName() + " es mayor que la mascota " + pet1.getName());
            } else {
                if (age_pet1 == age_pet2) {
                    System.out.println("La mascota " + pet1.getName() + " tiene la misma edad que " + pet2.getName());
                }
            }
        }

        pet1.Eat();
        pet2.Eat();
        pet2.Move();
        pet2.Sound();
        
        pet1.WalkAround();
        pet2.SelfCleaning();
    }

}
