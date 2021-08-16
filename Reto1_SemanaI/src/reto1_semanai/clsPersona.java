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
public class clsPersona {
    
    // Atributos de la classe
    String numero_id;
    String tipo_id;
    String nombres;
    String apelldios;
    double estatura;
    double peso;
    String sexo;
    String genero;
    String fecha_nacimiento;
    
    // Método constructor

    public clsPersona(String numero_id, String tipo_id, String nombres, String apelldios, double estatura, double peso, String sexo, String genero, String fecha_nacimiento) {
        this.numero_id = numero_id;
        this.tipo_id = tipo_id;
        this.nombres = nombres;
        this.apelldios = apelldios;
        this.estatura = estatura;
        this.peso = peso;
        this.sexo = sexo;
        this.genero = genero;
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    
    
    public void HacerSonido() {
        System.out.println("La persona " + nombres + " está haceindo sonidos.");
    }
    
    public void Hablar() {
        System.out.println("La persona " + nombres + " está hablando");
    }
    
    public void Caminar() {
        System.out.println("La persona " + nombres + " está caminando");
    }
    
    public void Correr() {
        System.out.println("La persona " + nombres + " está corriendo");
    }
    
    public void Escribir() {
        System.out.println("La persona " + nombres + " está escribiendo");
    }
    
    public void Sentarse() {
        System.out.println("La persona " + nombres + " está sentad@");
    }
    
    public void Pararse() {
        System.out.println("La persona " + nombres + " está parado");
    }
    
    public void Respirar() {
        System.out.println("La persona " + nombres + " está respirando");
    }
    
    public void Ver() {
        System.out.println("La persona " + nombres + " está observando");
    }
    
    public void Sentir() {
         System.out.println("La persona " + nombres + " está sintiendo mucho");
    }
    
    public void Saborear() {
         System.out.println("La persona " + nombres + " está saboreandose");
    }
    
    public void Comer() {
         System.out.println("La persona " + nombres + " está comiendo");
    }
    
    public void Oir() {
         System.out.println("La persona " + nombres + " está escuchando atentamente");
    }
    
    public void Oler() {
         System.out.println("La persona " + nombres + " está olfateando");
    }
}
