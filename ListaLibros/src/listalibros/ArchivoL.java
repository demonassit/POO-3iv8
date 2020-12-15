/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listalibros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author demon
 */

//modulo de creacion y lectura de archivos
public class ArchivoL implements Serializable {
    
    ArrayList<CLibro> listarecuperada = new ArrayList<CLibro>();
    
    //aqui es donde tenemos el manejor de archivos por separado
    public ArrayList<CLibro> leer(){
        try{
            
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("libro.txt"));
            
            listarecuperada = (ArrayList<CLibro>)in.readObject();
            
            in.close();
        
        }catch(Exception e){
            System.out.println("Esperando ..... " + e.getMessage());
        
        }
        return listarecuperada;
    }
    
    void serializar(ArrayList<CLibro> listaseriar){
        try{
            FileOutputStream out = new FileOutputStream("libro.txt");
            ObjectOutputStream objout = new ObjectOutputStream(out);
            objout.writeObject(listaseriar);
            objout.close();
        
        }catch(Exception e){
            System.out.println("Error ... "+ e.getMessage());
        
        }
    }
    
    
    
}
