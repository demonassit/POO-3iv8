/*
Como hemos visto en anteriores sesiones es posible captar
la entrada de datos a partir de readLine(),  que es un metodo
de la consola o la entrada estandar de la computadora;
pero que tal si quiero saber el tipo de dato que se esta 
introduciendo, para ello necesito un obj especial

*/ 


//libreria
import java.util.Scanner; //solo lo que se ocupa

import java.util.*;  //mandando a llamar toda la libreria


class EntradaDatosUsuario{

    //metodo principal
    public static void main(String[] args){
        //a nuestro objeto o vamos a crear una instancea
        //invocacion del objeto
        //Nombre de la clase obj 
        Scanner entrada = new Scanner(System.in);

        //variables
        String nombre;
        int edad;
        float altura;

        System.out.println("Escribe tu nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Escribe tu edad: ");
        edad = entrada.nextInt();
        System.out.println("Escribe tu estatura: ");
        altura = entrada.nextFloat();

        System.out.println("Tu nombre es: "+nombre);
        System.out.println("Tu edad es: "+edad);
        System.out.println("Tu altura es: "+altura);
    }
}