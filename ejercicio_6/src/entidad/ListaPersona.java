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

import java.util.ArrayList;
import java.util.Iterator;

public class ListaPersona {
    
    //Atributos
    private final ArrayList<Persona> listaPersona = new ArrayList<>();
    //Constructor
    public ListaPersona(){
        
    }
    //Métodos
    public void agregarPersona(Persona persona){
        this.listaPersona.add(persona);
    }
    public void mostrarPersona(){
        for (Persona persona : listaPersona) {
            System.out.println(persona);
        }
    }
    public boolean existePersona(String nombre){
        boolean existe = false;
        for (Persona persona : listaPersona) {
            existe = persona.getNombre().equals(nombre);
        }
        return existe;
    }
    public boolean perroYaEstaAdoptado(){
       boolean adoptado = false;
       Iterator<Persona> iterator = this.listaPersona.iterator();
       while(iterator.hasNext()){
           Persona actual = iterator.next();
           if(actual.getPerro().getNombre() != null){
               adoptado = true;
               break;
           }
       }
       return adoptado;
    }
    public void adoptarPerro(String persona, String perro, ListaPerro perros){
        Iterator<Persona> iterator = this.listaPersona.iterator();
        while(iterator.hasNext()){
            Persona actual = iterator.next();
            if(actual.getNombre().equals(persona)){
                actual.setPerro(perros.traerPerro(perro));
                System.out.println("Perro adoptado");
                break;
            }
        }
    }
}
