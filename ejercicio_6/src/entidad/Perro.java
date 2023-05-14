/*
    Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
    tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
    cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
    al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
    persona.
    Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
    personas con sus respectivos perros.
*/
package entidad;

import enumeracion.RazaEnumeracion;
import enumeracion.TamanioEnumeracion;

public class Perro {
    //Atributos
    private String nombre;
    private RazaEnumeracion raza;
    private int edad;
    private TamanioEnumeracion tamanio;
    
    //Constructor
    public Perro(){
        
    }
    
    //Métodos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public RazaEnumeracion getRaza() {
        return raza;
    }
    public void setRaza(RazaEnumeracion raza) {
        this.raza = raza;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public TamanioEnumeracion getTamanio() {
        return tamanio;
    }
    public void setTamanio(TamanioEnumeracion tamanio) {
        this.tamanio = tamanio;
    }
}
