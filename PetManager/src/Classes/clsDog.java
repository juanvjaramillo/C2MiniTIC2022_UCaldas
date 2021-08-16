/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author juanv
 */
public class clsDog extends clsPet{
    
    private String breed;
    private boolean pedigree;
    
    public clsDog(String breed, boolean pedigree, String code, String name, int born_year, String color, String health_status){
        super(code, name, born_year, color, health_status);
        this.breed = breed;
        this.pedigree = pedigree;
    }
    
    
    
    public void WalkAround() {
        System.out.println("El perro " + super.getName() + " está de paseo.");
    }
    
    public void WalkAround(int km) {
        System.out.println("El perro " + super.getName() + " está caminando " + km + "km.");
    }
    
    public void WalkAround(boolean dogLeash) {
        String hasLeash = dogLeash ? "con correa" : "sin correa";
        System.out.println("El perro " + super.getName() + " está caminando " + hasLeash);
        
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }
    
    @Override
    public void Sound() {
        System.out.println("El perro " + super.getName() + " hace guuaau  guuaauu.");      
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the pedigree
     */
    public boolean getPedigree() {
        return pedigree;
    }

    /**
     * @param pedigree the pedigree to set
     */
    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }
    
}
