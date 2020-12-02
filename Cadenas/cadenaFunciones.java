//wiiii mas funciones wiiiii

import java.util.*;

public class cadenaFunciones{

    Scanner entrada = new Scanner(System.in);

    public void masFuncionesCadena(){

        String s1 = new String("Hola tengo otra forma de cadenas");
        String s2 = "patito";
        String s3 = "Feliz Cumpleaños";
        String s4 = "feliz cumpleaños";

        System.out.println("Escribe la letra de un caracter:");
        char y;
        y = entrada.next().charAt(0);
        System.out.println("Escribiste :" + y);

        //concatenar cadenas

        String salida = "cadena s1: " + s1 + "\n cadena s2: "+ s2 + "\n cadena s3:"
                        + s3 + "\n cadena s4: " + s4 + "\n";
                        
        System.out.println(salida);

        //probar la igualdad de una cadena

        if(s1.equals("Hola tengo otra forma de cadenas")){
            //si es verdad
            salida += "Si es igual a S1\n";
            System.out.println(salida);
        }else{
            salida += "No es igual a S1\n ";
            System.out.println(salida);
        }

        //probar con ==, recuerden que esto es para objetos 

        if(s1 == "Hola tengo otra forma de cadenas"){
            //si es verdad
            salida += "Si es igual a S1 con == \n";
            System.out.println(salida);
        }else{
            salida += "No es igual a S1 con == \n ";
            System.out.println(salida);
        }

        //probar la igualdad ignorando mayusculas

        if(s3.equalsIgnoreCase(s4)){
            //si es verdad
            salida += "s3 si es igual a s4\n";
            System.out.println(salida);
        }else{
            salida += "s3 no es igual a s4\n";
            System.out.println(salida);
        }

        //vamos a probar para que sirve compareTo

        salida += "\n s1 compareTo (s2): " + s1.compareTo(s2)+
                  "\n s2 compareTo (s1): " + s2.compareTo(s1)+
                  "\n s3 compareTo (s4): " + s3.compareTo(s4)+
                  "\n s4 compareTo (s3): " + s4.compareTo(s3);

        //obtener la segunda posicion de un caracter repetido

        String s5 = "Patito color de cafe";

        int pos=0;

        pos = s5.indexOf('t', pos+1);
        System.out.println("Segunda aparicion de t: "+ pos);

        //eliminar espacios en blanco

        String s6 = "  1 2  ";

        System.out.println("Cadena original:  " + s6);
        System.out.println("Cadena sin espacios en blanco:  " + s6.trim());

    }
}