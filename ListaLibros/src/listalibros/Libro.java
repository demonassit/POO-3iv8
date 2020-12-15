/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listalibros;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author demon
 */
public class Libro implements Serializable{
    
    private ArrayList<CLibro> listalibros;
    
    //mandar a llamar a mis archivos
    private ArchivoL objarchivo = new ArchivoL();
    
    
    public Libro(){
        //voy a inicializar los dos objetos privados
        listalibros = new ArrayList<CLibro>();
        //sobrecargar el objeto
        listalibros = objarchivo.leer();
    }
    
    //ya viene el CRUD
    
    public void agregarLibro(){
        Scanner entrada = new Scanner(System.in);
        char resp = 's';
        
        while(resp == 's'){
            
            //objeto del cat de libros
            CLibro objlibro = new CLibro();
            objlibro.aceptaDatos();
            //lo agregamos al array
            listalibros.add(objlibro);
            System.out.println("Libro agregado gracias");
            System.out.println("¿Desea agregar otro libro? (s/n)");
            resp = entrada.next().charAt(0);
        }
    }
    
    public void consultaGral(){
        //primero debo de saber si la lista esta vacia
        if(listalibros.isEmpty()){
            System.out.println("No hay libros registrados");
        }else{
            System.out.println("Los libros son:\n");
            //debemos recorrer el arreglo
            for(int i = 0; i<listalibros.size(); i++){
                System.out.println("uwu---------uwu");
                System.out.println("Libro: " + listalibros.get(i).getNombre()+ "\n"
                                 + "Autor: " + listalibros.get(i).getAutor()+ "\n"
                                 + "Editorial: " + listalibros.get(i).getEditorial()+ "\n"
                                 + "Precio: " + listalibros.get(i).getPrecio()+ "\n");
                System.out.println("T_T --------- T_T");
            }
            
        }
    }
    
    
    /*para poder hacer el metodo de busqueda del libro por su id
    o por su nombre o por su editorial, o lo que quieran
    primero debemos de obtener un elemento para identificarlo y traerlo de 
    la posicion donde esta almacenado en el arreglo*/
    
    
    private int traePosicion(String nombreBuscar){
        int pos = 0;
        boolean existe = false;
        
        //recorrer la lista del array
        for(int i = 0; i < listalibros.size(); i++){
            if(nombreBuscar.equals(listalibros.get(i).getNombre())){
                pos = i;
                existe = true;
            }else{
                System.out.println("Libro no encontrado");
            }
        }
        if(!existe){
            System.out.println("No existe el registro de dicho libro");
            pos = -1;
        }
        return pos;
    }
    
    //metodo para buscar
    public int buscar(){
        int posBuscando = 0;
        String nombreBusca;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre del libro a buscar");
        nombreBusca = entrada.nextLine();
        
        //puedo ocupar mi metodo para buscarlo a partir de la posicion
        posBuscando = traePosicion(nombreBusca);
        
        //mando imprimir
        System.out.println("uwu uwu uwu uwu uwu uwu");
        System.out.println("Nombre: " + listalibros.get(posBuscando).getNombre());
        System.out.println("Editorial: " + listalibros.get(posBuscando).getEditorial());
        System.out.println("Precio: " + listalibros.get(posBuscando).getPrecio());
        System.out.println("Autor: " + listalibros.get(posBuscando).getAutor());
        System.out.println("ID: " + listalibros.get(posBuscando));
        
        return posBuscando;
    }
    
    //vamos a borrar
    
    public void borrar(){
        Scanner entrada = new Scanner(System.in);
        String libroBorrar;
        int posBorrar;
        
        //lo primero que necesito es saber si la lista esta vacia
        if(listalibros.isEmpty()){
            System.out.println("No hay libros registrados");
        }else{
            //si hay algo
            System.out.println("Eleccion para borrar");
            posBorrar = buscar();
            //aqui ya me mostro los datos del libro antes de borrarlo
            if(posBorrar < listalibros.size()){
                listalibros.remove(posBorrar);
                System.out.println("Libro Borrado correctamente");
            }
        }
    }
    
    //modificar
    
    public void modificar(){
        int posModificar = 0;
        int resMods = 0;
        String nombreModificar;
        String opcion = "s";
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre del libro a modificar");
        nombreModificar = entrada.nextLine();
        
        //necesito un bucle para repita el proceso
        while("s".equals(opcion)){
            posModificar = traePosicion(nombreModificar);
            //verificando que la lista no este vacia
            if(posModificar <= 0);
            
            //cuando no esta vacia
                System.out.println("¿Que dato es el que deseas modificar?");
                System.out.println("1.- Autor");
                System.out.println("2.- Editorial");
                System.out.println("3.- Precio");
                
                resMods = entrada.nextInt();
                
                switch (resMods) {
                    case 1:
                        System.out.println("El autor es: ");
                        System.out.println(listalibros.get(posModificar).getAutor() + "\n");
                        System.out.println("Ingresa el nuevo autor: ");
                        //tengo que enviar el nuevo dato
                        listalibros.get(posModificar).setAutor(entrada.next());
                        System.out.println("El dato a sido modificado");
                        //el nuevo dato es
                        System.out.println("Autor: " + listalibros.get(posModificar).getAutor());
                        
                        break;
                        
                    case 2:
                        System.out.println("El editorial es: ");
                        System.out.println(listalibros.get(posModificar).getEditorial()+ "\n");
                        System.out.println("Ingresa la nueva editorial: ");
                        //tengo que enviar el nuevo dato
                        listalibros.get(posModificar).setEditorial(entrada.next());
                        System.out.println("El dato a sido modificado");
                        //el nuevo dato es
                        System.out.println("Editorial: " + listalibros.get(posModificar).getEditorial());
                        
                        break;
                        
                    case 3:
                        System.out.println("El precio es: ");
                        System.out.println(listalibros.get(posModificar).getPrecio()+ "\n");
                        System.out.println("Ingresa el nuevo precio: ");
                        //tengo que enviar el nuevo dato
                        listalibros.get(posModificar).setPrecio(entrada.nextFloat());
                        System.out.println("El dato a sido modificado");
                        //el nuevo dato es
                        System.out.println("Precio: " + listalibros.get(posModificar).getPrecio());
                        
                        break;
                    
                }
                
                System.out.println("¿Quieres cambiar mas datos?");
                opcion = entrada.nextLine();
            
        }
    }

    public ArrayList<CLibro> getListalibros() {
        return listalibros;
    }

    public void setListalibros(ArrayList<CLibro> listalibros) {
        this.listalibros = listalibros;
    }

    public ArchivoL getObjarchivo() {
        return objarchivo;
    }

    public void setObjarchivo(ArchivoL objarchivo) {
        this.objarchivo = objarchivo;
    }
    
    //el metodo que se encarga de grabar los datos
    public void grabar(){
        getObjarchivo().serializar(listalibros);
    }
    
}
