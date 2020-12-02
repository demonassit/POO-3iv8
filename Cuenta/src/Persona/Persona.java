/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

/**
 *
 * @author demon
 */
public class Persona {
    
    //variables
    
    private String nombre;
    private String appat; //apellido paterno
    private String apmat; //apellido materno
    private int edad;
    private String domicilio;

    public Persona() {
    }
    
    public Persona(String nombre, String appat, String apmat, int edad, String domicilio) {
        this.nombre = nombre;
        this.appat = appat;
        this.apmat = apmat;
        this.edad = edad;
        this.domicilio = domicilio;
    }
    
    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppat() {
        return appat;
    }

    public void setAppat(String appat) {
        this.appat = appat;
    }

    public String getApmat() {
        return apmat;
    }

    public void setApmat(String apmat) {
        this.apmat = apmat;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    
    
    
    
    
}
