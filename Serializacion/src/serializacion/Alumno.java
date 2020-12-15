/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

/**
 *
 * @author demon
 */
public class Alumno extends Persona {
    
    private int bol;

    public Alumno() {
        
    }

    public Alumno(int bol, String nombre, int edad) {
        super(nombre, edad);
        this.bol = bol;
    }
    

    public int getBol() {
        return bol;
    }

    public void setBol(int bol) {
        this.bol = bol;
    }
    

    @Override
    String tipoPersona() {
        return ("Alumno");
    }

    
}
