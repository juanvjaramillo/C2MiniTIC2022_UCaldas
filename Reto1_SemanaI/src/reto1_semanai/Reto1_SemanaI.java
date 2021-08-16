/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1_semanai;

/**
 *
 * @author juanv
 */
public class Reto1_SemanaI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //TODO instanciar una calse persona externa
        clsPersona persona1 = new clsPersona("105330293", "C.C.", "Laura Daniela", "Forero Botero", 1.72, 56.4,"F", "transexual", "1972-07-23");
        
        persona1.Caminar();
        persona1.Comer();
        persona1.Correr();
        persona1.Escribir();
        persona1.Hablar();
        persona1.HacerSonido();
        persona1.Oir();
        persona1.Oler();
        persona1.Pararse();
        persona1.Sentarse();
        persona1.Sentir();
        persona1.Saborear();
        persona1.Ver();
        
                
        clsPersona persona2 = new clsPersona("126547893", "CE", "Tod", "Restrepo Ramirez", 1.92, 85.8, "M", "hombre", "1958-11-03");
        persona2.Correr();
        
        
        clsPersona persona3;
        persona3 = new clsPersona("32569874", "TI", "Laura", "Zuluaga Urasmetofh", 1.72, 63.2, "F", "Femenino", "1988-09-30");
        persona3.Caminar();
        persona3.Hablar();
    }   
}
