/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import Classes.clsDog;

/**
 *
 * @author juanv
 */
public class Polymorphism3 {
    public static void main(String[] args) {
        // Instancias de las clases hijas
        clsDog dog = new clsDog("Criollo", false, "001", "Firulais", 2015, "Negro", "Sano");
        
        dog.WalkAround();
        dog.WalkAround(5);
        dog.WalkAround(true);
    }
}
