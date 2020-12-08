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
public class Queso extends Pizza {

    public Queso() {
    }

    public Queso(String masa, String salsa, String[] ingredientes) {
        super();
        //vamos a suponer que hay diferentes tipos de queso
        //parmesano
        //chedar o mozzarela
        this.masa = "Corteza regular";
        this.salsa="TOmate";
        
        this.ingredientes = new String[2];
        this.ingredientes[0]="Queso Parmesano";
        this.ingredientes[1]="Queso Mozzarela";
        
    }
    
    public String[] getIngredientes(){
        return this.ingredientes;
    }
    
    public String getMasa(){
        return this.masa;
    }
    
    public String getSalsa(){
        return this.salsa;
    }
    

    
    
    
    
}
