/*

Esta clase es la que va a tener una relacion con la clase principal, 
en esta se va a encargar de realizar los metodos necesarios para 
resolver lo siguiente

una calculadora
conversion de unidades
creacion de cuadros
movimiento de cuadro

*/

import java.util.Scanner;

public class Operaciones{

    //crear un objeto para manipular datos
    Scanner entrada = new Scanner(System.in);

    //vamos a crear un metodo menu

    public void menu(){

        char op;

        System.out.println("Ejemplo de un menu que se encarga de:");
        System.out.println("A.- Calculadora");
        System.out.println("B.- Conversor de unidades");
        System.out.println("C.- Creacion de cuadros");
        System.out.println("D.- Movieminto en cuadro");

        op = entrada.next().charAt(0);

        //vamos a crear un switch

        switch(op){

            case 'A':
                //vamos a crear el metodo de calculadora
                Calculadora();
                break;

            case 'B':
                //vamos a crear el metodo de Converso de unidades
                ConversorUnidades();
                break;  

            case 'C':
                //vamos a crear el metodo de creacion de cuadros
                CreaCuadro();
                break;
            case 'D':
                //vamos a crear el metodo de moviemiento de cuadros
                MoviCuadro();
                break;


        }
    }

    //metodo para la calculadora

    public void Calculadora(){

        //variables que voy a ocupar
        double numero = 0.00, suma = 0.00, multi = 1.00;

        char operacion, p;

        System.out.println("Seleccione la opcion deseada: ");
        System.out.println("a. Suma y Resta");
        System.out.println("b. Multiplicacion");
        System.out.println("c. Division");

        operacion = entrada.next().charAt(0);

        switch(operacion){

            case 'a':
                do{

                    System.out.println("Para dejar de sumar ingresa 0");
                    System.out.println("Ingresa el valor a sumar: ");
                    numero = entrada.nextDouble();

                    suma += numero;
                    //suma = suma + numero;
                }while(numero!=0);
                System.out.println("La suma total es de: "+ suma);
                break;
            case 'b':
                do{

                    System.out.println("Para dejar de multiplicar ingresa 0");
                    System.out.println("Ingresa el valor a multiplicar: ");
                    numero = entrada.nextDouble();

                    if(numero > 0){
                        multi *= numero;
                    }else{
                        System.out.println("Ingresa solo positivos");
                    }


                    }while(numero!=0);
                System.out.println("La suma total es de: "+ multi);
                break;
            case 'c':
                    //ahi lo hacen soy flojito *w*
                    break;
            
                
        }


    }

    public void ConversorUnidades(){

        /*
        van a tener que realizar las conversiones de unidades de:
        metros a cm 
        metros a pulgadas
        kilogramos a libras
        kilogramos a onzas
        */ 
    }

    public void CreaCuadro(){

        //este lo hago yo alratito ono
        //otro cambio wiiiiii
    }

    public void MoviCuadro(){

        //es suyo despues de que yo haga el anterior
    }
}