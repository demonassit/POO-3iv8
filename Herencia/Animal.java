//vamos a crear una clase animal general para
//mascotas domesticas

public class Animal{

    //vamos a utilizar el principio de encapsulamiento
    //para poder proteger el acceso a las variables de la clase
    private String nombre, raza, tipo_alimento;
    private int edad;

    //ahora vamos crear el constructor
    public Animal(){
        /*
        Y los constructores se crean automaticamente en java, si es que no son
        invocados, y sirven para la inicializacion de variables y poder crear objetos
        de la clase
        
        */
    }
    //acceder a los datos     estos son parametros
    public Animal(String nombre, String raza, String tipo_alimento, int edad){
        //pq si :3
        /*
        para poder acceder a las variables porque son privadas es necesario
        utilizar la palabra reservada this
        */ 

        this.nombre = nombre;
        this.raza = raza;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;
    }

    //para poder enviar y obtener las variables necesitamos los metodos get y set
    
    //recibe obtiene
    public String getNombre(){
        return nombre;
    }
    //envia u establecer
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //recibe obtiene
    public String getRaza(){
        return raza;
    }
    //envia u establecer
    public void setRaza(String raza){
        this.raza = raza;
    }

    //recibe obtiene
    public String getTipoAlimento(){
        return tipo_alimento;
    }
    //envia u establecer
    public void setTipoAlimento(String tipo_alimento){
        this.tipo_alimento = tipo_alimento;
    }

    //recibe obtiene
    public int getEdad(){
        return edad;
    }
    //envia u establecer
    public void setEdad(int edad){
        this.edad = edad;
    }

}