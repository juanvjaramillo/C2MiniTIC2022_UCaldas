/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;
import Classes.clsPet;
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
        
        
    }
    
}
