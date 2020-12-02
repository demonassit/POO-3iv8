/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;
import java.util.*;

/**
 *
 * @author demon
 */
public class Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        int opc;
        //aperturar una cuenta
        
        
        do{
            
            System.out.println("Bienvenido al Banquito Patito\n");
            System.out.println("¿Que operacion deseas realizar:\n");
            System.out.println("1.- Cuenta de debito");
            System.out.println("2.- Cuenta de credito");
            System.out.println("3.- Cuenta de cheques");
            System.out.println("4.- Salir");
            
            opc = entrada.nextInt();
            
            switch(opc){
                case 1:
                    //abrir una cuenta debito
                    break;
                case 2:
                    //abrir una cuenta de credito
                    break;
                case 3:
                    //abrir una cuenta de cheques
                    break;
                default:
                    break;
            }
        
            
        }while(opc!=4);
        
        
        
        
    }
    
}
