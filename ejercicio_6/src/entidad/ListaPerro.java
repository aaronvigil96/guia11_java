package entidad;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaPerro {
    //Atributos
    private ArrayList<Perro> listaPerro = new ArrayList<>();
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
        Perro perro = new Perro();
        Iterator<Perro> iterator = this.listaPerro.iterator();
        while(iterator.hasNext()){
            Perro actual = iterator.next();
            if(actual.getNombre().equals(nombre)){
                perro = actual;
                break;
            }
        }
        return perro;
    }
    
}
