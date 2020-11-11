import java.util.Scanner;

import javax.swing.JOptionPane;

/*
vamos a crear un programa que se encargue de crear un array que almacena 100
posiciones y sume los numeros del 1 al 100 y obtenga la media
*/ 

public class sumaArray{

    public static void main(String[] args){
        /*
        //vamos a crear el array
        int[] numeros = new int[100];

        //variables
        int suma = 0;
        double media = 0.00;

        //recorremos el array y le asignamos numeros
        for(int i = 0; i<numeros.length; i++){
            //ahora asginamos los numeros dentro del arreglo
            numeros[i]=i+1;
            //System.out.println("Posiciones"+i);//posiciones
            //System.out.println("Numeros"+numeros);//memoria
            //System.out.println("Valor"+numeros[i]);//valor
            //sumamos los numeros
            suma+=numeros[i];
        }

        System.out.println("La suma de los numeros es de: "+suma);

        media = (double)suma/numeros.length;

        System.out.println("La media de los numeros es de: "+media);
    */

    //multiplicacion

    /*
    vamos a crear dos array de numeros con una posicion pasando por el teclado

    uno de ellos estara rellenado con numeros aleatorios y el otro 
    aoybtara al array anterior, despues se crea uno nuevo con el primer array 
    del mismo tamaño rellenandolo de numeros aleatorios 

    */ 
    //esto es la salida de una mini interfaz
    String texto = JOptionPane.showInputDialog("Introduce el tamaño del arreglo");

    //para cuando tenemos que transformar tipos de datos tenemos que usar parse
    //2+2 = 22   2+2 = 4
    int tamanio = Integer.parseInt(texto);

    //creamos el array
    int array1[] = new int [tamanio];
    int array2[];


    //rellenamos el primer array con un metodo
    rellenarNumAleatoriosArray(array1, 10, 100);

    //apuntar el array2 al arrary1
    array2 = array1;

    //creamos un nuevo arrary usando el array1, que tendra una nueva direccion
    array1 = new int[tamanio];

    //lo volvemos a rellenar 
    rellenarNumAleatoriosArray(array1, 10, 100);

    //contiene el arrar con el resultado de multiplicar los valores de los array
    int array3[] = multiplicador(array1, array2);

    //vamos a mostrar los arreglos

    System.out.println("Arreglo 1: ");
    //metodo para mostrarlos
    mostrarArray(array1);
    System.out.println("Arreglo 2: ");
    //metodo para mostrarlos
    mostrarArray(array2);
    System.out.println("Arreglo 3: ");
    //metodo para mostrarlos
    mostrarArray(array3);

    
    
    
    }

    //metodo de relleno, quiero que sea estatico, porque no se van a mover los valores
    public static void rellenarNumAleatoriosArray(int lista[], int a, int b){
        for(int i = 0; i<lista.length; i++){
            //aqui es donde yo asigno los numeros aleatorios
            //tengo que ocupar a libreria Math.random de 10 a 100
            //aqui si hay que castear el int
            lista[i] = ((int)Math.floor(Math.random()*(a-b)+b));
        }
    }

    public static void mostrarArray(int lista[]){

        for(int i = 0; i<lista.length; i++){
            System.out.println("En la posicion " + i + " esta el valor : " +lista[i]);
        }
    }

    //la multiplicacion de arreglos funcion retornamos el resultado
    public static int[] multiplicador(int array1[], int array2[]){

        int array3[] = new int[array1.length];
        //ahora multiplicamos filas por filas 
        for(int i = 0; i<array1.length; i++){

            array3[i]=array1[i]*array2[i];
        }
        return array3;
    }





}