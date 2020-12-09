/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import crud.ControladorPersona;

/**
 *
 * @author demon
 */
import java.util.*;


public class manipularPrograma {
    
    public void principal(){
        Scanner entrada = new Scanner(System.in);
        
        ControladorPersona control = new ControladorPersona();
        
        
        
        System.out.println("Bienvenido a la administracion del registro"
                + "del personal de aseo");
        System.out.println("Elija la opcion que desee:"
                + "\n1.- MostrarPersonas"
                + "\n2.- Registrar una nueva persona"
                + "\n3.- Editar registro de persona"
                + "\n4.- Borrar el registro de persona"
                + "\n5.- Salir");
        
        int opcion = Integer.parseInt(entrada.nextLine());
        
        switch (opcion) {
            case 1:
                
                ArrayList<Persona> listaPersona = control.mostrarPersonas();
                //me hace falta recorrer ese array
                for(Persona objeto : listaPersona){
                    //mando imprimir los registros
                    System.out.println("El id: "+ objeto.getId()
                                      +"\n El nombre: "+ objeto.getNombre()
                                      +"\n La edad: "+ objeto.getEdad());
                }
                principal();
                break;
            case 2:
                System.out.println("Por favor ingresa el id de la persona");
                int idpersona = Integer.parseInt(entrada.nextLine());
                System.out.println("Por favor ingresa el nombre de la persona");
                String nompersona = entrada.nextLine();
                System.out.println("Por favor ingresa la edad de la persona");
                int edadpersona = Integer.parseInt(entrada.nextLine());
                
                Persona personaNueva = new Persona(idpersona, nompersona, edadpersona);
                
                control.agregarPersona(personaNueva);
                principal();
                break;
                
            case 3: 
                System.out.println("Digita el ID de la persona que vas a actualizar sus"
                        + "datos");
                int id = Integer.parseInt(entrada.nextLine());
                
                Persona personaBuscar = control.buscarPersona(id);
                
                //visualizamos la informacion de esa persona
                
                System.out.println("La informacion de la persona es:\n"
                        + "ID: " + personaBuscar.getId()+"\n"
                        + "Nombre: " + personaBuscar.getNombre()+"\n"
                        + "Edad: "+ personaBuscar.getEdad());
                
                //ahora vamos a cambiar los datos
                System.out.println("Ingresa el nuevo nombre: ");
                String nuevonombre = entrada.nextLine();
                System.out.println("Ingresa la nueva edad: ");
                int nuevaedad = Integer.parseInt(entrada.nextLine());
                
                //con set esos nuevos parametros
                personaBuscar.setNombre(nuevonombre);
                personaBuscar.setEdad(nuevaedad);
                
                //actualizo mi lista
                control.actualizarPersona(personaBuscar);
                principal();
                break;
            case 4:
                System.out.println("Digite el ID de la persona que desea eliminar");
                int ideliminar = Integer.parseInt(entrada.nextLine());
                
                Persona personaeliminar = control.buscarPersona(ideliminar);
                
                control.eliminarPersona(personaeliminar);
                
                System.out.println("El registro se borro correctamente");
                principal();
                break;
                
            case 5:
                System.out.println("uwu");
                System.exit(0);
                
            default:
                System.out.println("Por favor, digite una opcion correcta");
        }
    }
    
}
