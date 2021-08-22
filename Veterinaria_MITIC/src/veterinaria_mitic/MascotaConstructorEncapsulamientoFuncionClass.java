/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria_mitic;

/**
 *
 * @author juanv
 */
public class MascotaConstructorEncapsulamientoFuncionClass {
    // 1. Declaramos las variables de forma privada
    // 2. Creamos los GETTER de las variables de la clase
    //      Clic secundario> Refactor> Encapsulate Fields...
    // 3. Vamos  ainsertar el contructor de de las variables de la calse
    //      Clic secundario>Insert Code> Constructor 
    // 4. Crear un método o una función que imprima los valores de todos los getter de la clase
    
    // DECLARACIÓN DE ATRIBUTOS O VARIABLES
    private String nombre_mascota;
    private String fecha_nacimiento; // En este caso debemos cambiar la fecha de int a String
    private String raza;
    private boolean vacunas;
    private boolean historial_clinico;
    private int nro_documento_propietario;

    public MascotaConstructorEncapsulamientoFuncionClass(String nombre_mascota, String fecha_nacimiento, String raza, boolean vacunas, boolean historial_clinico, int nro_documento_propietario) {
        this.nombre_mascota = nombre_mascota;
        this.fecha_nacimiento = fecha_nacimiento;
        this.raza = raza;
        this.vacunas = vacunas;
        this.historial_clinico = historial_clinico;
        this.nro_documento_propietario = nro_documento_propietario;
    }

    
    /**
     * @return the nombre_mascota
     */
    public String getNombre_mascota() {
        return nombre_mascota;
    }

    /**
     * @param nombre_mascota the nombre_mascota to set
     */
    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    /**
     * @return the fecha_nacimiento
     */
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * @param fecha_nacimiento the fecha_nacimiento to set
     */
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the vacunas
     */
    public boolean isVacunas() {
        return vacunas;
    }

    /**
     * @param vacunas the vacunas to set
     */
    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }

    /**
     * @return the historial_clinico
     */
    public boolean isHistorial_clinico() {
        return historial_clinico;
    }

    /**
     * @param historial_clinico the historial_clinico to set
     */
    public void setHistorial_clinico(boolean historial_clinico) {
        this.historial_clinico = historial_clinico;
    }

    /**
     * @return the nro_documento_propietario
     */
    public int getNro_documento_propietario() {
        return nro_documento_propietario;
    }

    /**
     * @param nro_documento_propietario the nro_documento_propietario to set
     */
    public void setNro_documento_propietario(int nro_documento_propietario) {
        this.nro_documento_propietario = nro_documento_propietario;
    }
    
    public String consultar_informacion_mascota_f(){
        String vacunado;
        String historial_cl = "No";
        if(isVacunas()) {
            vacunado = "Sí, está vacunado"; 
        } else {
            vacunado = "No, no tiene las vacunas al día";
        }
     
        if(isHistorial_clinico()) {
            historial_cl = "Sí";
        }
        
        return "\n\n***FUNCIÓN***\nFORMA III: Encapsulamiento constructor y método que imprime los getter de las variables.\n     Nombre mascota: " + getNombre_mascota() +"\n     Raza: " + getRaza() + "\n     Fecha Nacimiento: " + getFecha_nacimiento() + "\n     Número docuemnto propieatario: " + getNro_documento_propietario() + "\n     ¿Está vacunado? " + vacunado + "\n     ¿Tiene historial clínico?: " + historial_cl;
    }
    
     public void consultar_informacion_mascota_m(){
        String vacunado;
        String historial_cl = "No";
        if(isVacunas()) {
            vacunado = "Sí, está vacunado"; 
        } else {
            vacunado = "No, no tiene las vacunas al día";
        }
     
        if(isHistorial_clinico()) {
            historial_cl = "Sí";
        }
        
         System.out.println("\n\n***MÉTODO***\nFORMA III: Encapsulamiento constructor y método que imprime los getter de las variables.\n     Nombre mascota: " + getNombre_mascota() +"\n     Raza: " + getRaza() + "\n     Fecha Nacimiento: " + getFecha_nacimiento() + "\n     Número docuemnto propieatario: " + getNro_documento_propietario() + "\n     ¿Está vacunado? " + vacunado + "\n     ¿Tiene historial clínico?: " + historial_cl);
    } 
    
}
