/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria_mitic;
//import java.util.Date;

/**
 *
 * @author juanv
 */
public class MascotaEncapsulateFieldsClass {
    private String nombre_mascota;
    private String fecha_nacimiento; // En este caso debemos cambiar la fecha de int a String
    private String raza;
    private String color;
    private boolean vacunas;
    private char sexo;
    private boolean historial_clinico;
    private int nro_documento_propietario;
    
    /**
     * ENCAPSULAMENTO (Getter y Setter)
     * Get: Obtener o consultar el valor d euna variable (Función)
     * Set: Asignar o editar el valor de una variable. (Método)
     * Forma I: Clic Secndario > Insert Code > Getter y Setter.
     * Forma II:Clic Secundario > Refactor> Encapsulate Fields
     */
    
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
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
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
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
    
}