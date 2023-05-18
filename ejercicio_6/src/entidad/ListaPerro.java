package entidad;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaPerro {
    //Atributos
    private final ArrayList<Perro> listaPerro = new ArrayList<>();
    //Constructor
    public ListaPerro(){
        
    }
    //Métodos
    public void agregarPerro(Perro perro){
        this.listaPerro.add(perro);
    }
    public void mostrarPerro(){
        for (Perro perro : listaPerro) {
            System.out.println(perro);
        }
    }
    public boolean existePerro(String nombre){
        boolean existe = false;
        for (Perro perro : listaPerro) {
            existe = perro.getNombre().equals(nombre);
        }
        return existe;
    }
    public Perro traerPerro(String nombre){
        Iterator<Perro> iterator = this.listaPerro.iterator();
        while(iterator.hasNext()){
            Perro actual = iterator.next();
            if(actual.getNombre().equals(nombre)){
                return actual;
            }
        }
        return null;
    }
    
}
