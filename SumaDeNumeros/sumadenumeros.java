import java.util.Scanner;

class sumadenumeros{

    public static void main(String[] args){
        /*
        Vamos a crear un programa que se encargue de sumar
        2 numeros positivos


        que sume n numeros positivos 
        
        */

        //instancea del objeto
        Scanner entrada = new Scanner(System.in);

        //variables
        int num1, num2;
        int resultado=0;
        do{

        System.out.println("Ingresa el primer numero: ");
        
        num1 = entrada.nextInt();
        
        while(num1<0){

            System.out.println("Introduzca un valor positivo por fis");
            num1 = entrada.nextInt();
        }
        
        /*

        System.out.println("Ingresa el segundo numero: ");
        num2 = entrada.nextInt();

        while(num2<0){

            System.out.println("Introduzca un valor positivo por fis");
            num2 = entrada.nextInt();
        }

        */
        resultado = resultado + num1;

        }while(num1 != 0);
        
        System.out.println("La suma es de: "+resultado);
    }
}