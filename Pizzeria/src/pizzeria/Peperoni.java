/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author demon
 */
public class Peperoni extends Pizza {

    public Peperoni() {
    }

    public Peperoni(String masa, String salsa, String[] ingredientes) {
        super(masa, salsa, ingredientes);
        //diferentes tipos de presentacion del peperoni
        this.ingredientes = new String[3];
        this.ingredientes[0] = "Peperoni en rodajas";
        this.ingredientes[1] = "Peperoni con parmesano";
        this.ingredientes[2] = "Peperoni con mas peperoni";
    }
    
    public String[] getIngredientes(){
        return this.ingredientes;
    }
    
    
    
}
