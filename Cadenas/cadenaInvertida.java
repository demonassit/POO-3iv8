//vamos a invertir una cadena

import java.util.*;

public class cadenaInvertida{

    Scanner entrada = new Scanner(System.in);

    public void cadenaInvertida(){

        String cadena = "";

        System.out.println("Ingresa la oracion a invertir: ");
        cadena = entrada.nextLine();

        String invertida = "";

        //tengo que recorrer el tamaño de la cadena 
        //si yo ingreso     habia una vez un patito
        for(int i = cadena.length()-1; i>=0; i--){
            //obtener el char por cada posicion de i
            char car = cadena.charAt(i);
            //se lo voy a sumar a la invertida
            invertida += car;
            //invertida = invertida + car;
        }

        System.out.println("La invocacion dice:" + invertida);
    }
}