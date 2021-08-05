/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import Classes.clsPet;
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
        clsPet pet1 = new clsPet();
        pet1.setName("Firulais");
        pet1.setBorn_year(2015);
        pet1.setHealth_status("Sano");
        pet1.setCode("001");
        pet1.setColor("Negro");
        pet1.setBreed("Criollo");

        clsPet pet2 = new clsPet("001", "Minino", 2018, "Criollo", "Blanco y negro", "Enfermo");

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
    }

}
