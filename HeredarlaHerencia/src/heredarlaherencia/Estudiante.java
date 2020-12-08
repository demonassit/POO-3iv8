/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heredarlaherencia;

/**
 *
 * @author demon
 */
public class Estudiante extends Persona {
    
    private int numbol;

    public Estudiante() {
        
    }

    public Estudiante(int numbol, String nombre, int edad, char genero) {
        super(nombre, edad, genero);
        this.numbol = numbol;
    }

    public int getNumbol() {
        return numbol;
    }

    public void setNumbol(int numbol) {
        this.numbol = numbol;
    }
    
    
    
    
}
