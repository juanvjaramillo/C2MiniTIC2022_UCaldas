/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;
import Classes.*;

/**
 *
 * @author juanv
 */
public class Polymorphism2 {
    //El polymorphism 2 consisite en la Sobreescritura de métodos.
    public static void main(String[] args) {
        
        // Instancias de las clases hijas
        clsDog dog = new clsDog("Criollo", false, "001", "Firulais", 2015, "Negro", "Sano");
        clsCat cat = new clsCat("Angora", "001", "Minino", 2018, "Blanco y negro", "Enfermo");
        
        dog.Sound();
        cat.Sound();
    }
    
}
