//para caracterizar a un perro es su ladrido
/*
Para poder heredar de la clase animal, es necesario utilizar
la palabra reservada extends que significa que se extiende de una clase
padre o una superclase
*/

public class Perro extends Animal{

    private String ladrido;

    public Perro(){
        //constructor
    }

    //metodo para acceder a la clase principal y al ladrido
    public Perro(String nombre, String raza, String tipo_alimento, int edad, String ladrido){
        //tenemos que utilizar la palabra reservada super, para poder acceder a 
        //los atributos de la clase padre
        super(nombre, raza, tipo_alimento, edad);
        //acceso a la variable propia de la clase
        this.ladrido = ladrido;
    }

    //metodos get y set

    //recibe obtiene
    public String getLadrido(){
        return ladrido;
    }
    //envia u establecer
    public void setLadrido(String ladrido){
        this.ladrido = ladrido;
    }

    //el metodo para poder visualizar los datos

    public void mostrarPerro(){
        System.out.println("El nombre del perro es: " + getNombre()
                            + " su raza es: " + getRaza()
                            + " come: " + getTipoAlimento()
                            + " su edad es de: " + getEdad()
                            + " su ladrido es: " + getLadrido());
    }
}