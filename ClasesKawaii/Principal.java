/*

Esta es la clase principal para poder realizar una instancia
de otra clase que se va a encargar de 

una calculadora
conversion de unidades
creacion de cuadros
movimiento de cuadro


*/ 

public class Principal{

    //el metodo principal
    public static void main(String[] args){
        //y ya ahorita ahorita

        //ahora vamos a mandar a llamar nuestro metodo de la clase operaciones
        //realizamos la invocacion a partir de la creacion del objeto
        Operaciones obj = new Operaciones();
        obj.menu();
    }
}