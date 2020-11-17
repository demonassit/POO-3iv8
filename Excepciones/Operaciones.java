//en esta clase vamos a comprobar que pasa cuando pongan letras enlugar de numeros

import java.util.*;

public class Operaciones{

    //objeto scanner
    Scanner entrada = new Scanner(System.in);

    //variable
    int y=0;

    //metodo para verificar un numero

    public void Ejemplo(){

        //para el manejo de excepciones hay que utilizar
        try{

            System.out.println("Ingresa un valor numerico");
            y = entrada.nextInt();
            System.out.println("El numero es: "+ y);
            //para salir
            System.exit(0);

            //cacha el error mediante el objeto e
        }catch(Exception e){
            //mensaje de error
            System.out.println("Ingresa solo valores enteros");
            //saber el tipo de error
            System.out.println("Error: "+ e.getMessage());
        }
    }
}