/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

/**
 *
 * @author demon
 * 
 * vamos a hacer el crud de las personas, distinguiendo si es un alumno
 * o si es un profesor
 * 
 */

import java.io.*;
import java.util.*;
import javax.swing.*;


public class Funciones {
    
    //variables y objetos
    ArrayList<Persona> listaPersonas = new ArrayList();
    String rep = "si";
    String nombre;
    int edad, num_emp, bol;
    //polimorfismo Persona -Profesor
    Persona profe = new Profesor();
    //polimorfismo Persona -Alumno
    Persona alumno = new Alumno();
    
    //menu
    void menu(){
        //ciclo infinito
        while(true){
            while(rep.equalsIgnoreCase("si")){
                try{
                    
                    String var = (JOptionPane.showInputDialog("Ingresa la opcion "
                            + "deseada: \n"
                            + "1.- Registrar nuevo Profesor\n"
                            + "2.- Registrar nuevo Alumno\n"
                            + "3.- Consultar Estudiantes\n"
                            + "4.- Salir\n"));
                    
                    if(var == null){
                        System.exit(0);
                    }
                    
                    int opcion = Integer.parseInt(var);
                    
                    switch (opcion) {
                        case 1:
                            //metodos
                            pedirDatosProfesor();
                            profe = new Profesor(num_emp, nombre, edad);
                            guardarProfesor();
                            
                            break;
                        case 2:
                            //metodos
                            pedirDatosAlumno();
                            alumno = new Alumno(bol, nombre, edad);
                            guardarAlumno();
                            
                            break;
                            
                        case 3:
                            
                            //listar las personas de tipo alumno
                            leerAlumno();
                            break;
                        
                    }
                    rep = JOptionPane.showInputDialog("¿Deseas Repetir?");
                
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
                
                }
            }
        }
    }

    public void pedirDatosProfesor() {
        nombre = JOptionPane.showInputDialog("Ingresa el nombre del profesor");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del profesor"));
        num_emp = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de empleado del profesor"));
    }

    public void guardarProfesor() throws FileNotFoundException, IOException {
        listaPersonas.add(profe);
        //donde vamos a crear el archivo o fichero
        guardar();
    }

    public void pedirDatosAlumno() {
        nombre = JOptionPane.showInputDialog("Ingresa el nombre del alumno");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del alumno"));
        bol = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la boleta del alumno"));
   
    }

    public void guardarAlumno() throws FileNotFoundException, IOException {
        listaPersonas.add(alumno);
        //donde vamos a crear el archivo o fichero
        guardar();
    }

    public void leerAlumno() throws FileNotFoundException, IOException, ClassNotFoundException {
        
        //aqui hay una entrada de datos
        FileInputStream archiv = new FileInputStream("archivo.dat");
        //generar la lectura del obj
        ObjectInputStream entrada = new ObjectInputStream(archiv);
        
        
        //que hay en mi objeto y como leerlo?
        //castear el objeto
        listaPersonas = (ArrayList)entrada.readObject();
        
        //debo recorrer el array
        for(int i = 0; i< listaPersonas.size(); i++){
            //para poderlo recorrer necesitamos un obj del tipo de persona
            Alumno obj = (Alumno)listaPersonas.get(i);
            
            JOptionPane.showMessageDialog(null, "\n"
                    + "N° Alumno: " + (i+1)+ "\n"
                    + "Nombre: " + obj.getNombre()+ "\n"
                    + "Edad: " + obj.getEdad()+ "\n"
                    + "Boleta: " + obj.getBol()+ "\n"
                    + "Tipo de Persona: " + obj.tipoPersona()+ "\n");
        }
        
    }

    public void guardar() throws FileNotFoundException, IOException {
        /*
        debemos entender que se guarda en un archivo, significa yo voy a crear
        P una entrada o una salida?
        R se genera una salida
        */
        FileOutputStream archivo = new FileOutputStream("archivo.dat");
        //debo generar el flujo de objetos gracias a la clase abstracta
        //estoy guardado una persona que puede ser
        //alumno
        //profesor
        ObjectOutputStream salida = new ObjectOutputStream(archivo);
        salida.writeObject(listaPersonas);
        //cerrar el flujo
        salida.close();
        
    }
    
}
