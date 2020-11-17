//num de vidas

public class Gato extends Animal{

    private int num_vidas;

    public Gato(){

    }

    public Gato(String nombre, String raza, String tipo_alimento, int edad, int num_vidas){
        super(nombre, raza, tipo_alimento, edad);
        this.num_vidas = num_vidas;
    }

    //recibe obtiene
    public int getNumvidas(){
        return num_vidas;
    }
    //envia u establecer
    public void setNumvidas(int num_vidas){
        this.num_vidas = num_vidas;
    }

    public void mostrarGato(){
        System.out.println("El nombre del gato es: " + getNombre()
                            + " su raza es: " + getRaza()
                            + " come: " + getTipoAlimento()
                            + " su edad es de: " + getEdad()
                            + " su num de vidas son: " + getNumvidas());
    }
}