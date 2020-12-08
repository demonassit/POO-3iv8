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

import java.util.Scanner;

public class Pizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //no ponemos nada aun
        int opc;
        Scanner entrada = new Scanner(System.in);
        //voy a crear un objeto pizza vacio para que pueda 
        //cambiar segun la conveniencia
        
        Pizza piz = null;
        
        System.out.println("Bienvenidos a la Pizzaria Los Tacos");
        System.out.println("");
        System.out.println("¿Que desea ordenar?");
        System.out.println("1.- Pizza de Peperoni");
        System.out.println("2.- Pizza de Queso");
        System.out.println("3.- Pizza vegetariana");
        opc = entrada.nextInt();
        
        switch (opc) {
            case 1:
                //la pizza se debe transformar en peperoni
                piz = new Peperoni();
              
                break;
            case 2:
                //la pizza se debe transformar en queso
                
                piz = new Queso();
                
                piz.preparar();
                piz.hornear();
                piz.cortar();
                
                break;
                
            case 3:
                //la pizza se debe transformar en vegetariana
                Vegetariana vege = new Vegetariana();
                vege.preparar();
                vege.hornear();
                vege.cortar();
                break;
            default:
                System.out.println("Gracias adios uwu");
        }
        
        
    }
    
}
