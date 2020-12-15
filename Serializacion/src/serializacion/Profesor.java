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
public class Profesor extends Persona {
    
    private int num_empleado;

    public Profesor() {
        
    }

    public Profesor(int num_empleado, String nombre, int edad) {
        super(nombre, edad);
        this.num_empleado = num_empleado;
    }

    public int getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }

    @Override
    String tipoPersona() {
        return ("Profesor");
    }
    
    
    
}
