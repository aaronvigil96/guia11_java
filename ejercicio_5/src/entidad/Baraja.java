package entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Baraja {
    //Atributo
    LinkedHashSet<Carta> baraja;
    
    //Constructor
    public Baraja(){
        this.baraja = new LinkedHashSet<>();
    }
    
    //Métodos
    public void agregarCarta(Carta carta){
        this.baraja.add(carta);
    }
    public void mostrarCartas(){
        for (Carta carta : baraja) {
            System.out.println(carta);
        }
    }
    public void barajar(){
        ArrayList<Carta> cartas = new ArrayList<>(this.baraja);
        Collections.shuffle(cartas);
    }
    
    public ArrayList darCartas(int cantidad){
        ArrayList<Carta> cartas = new ArrayList<>();
        
        Iterator<Carta> iterator = this.baraja.iterator();
        if(cantidad < this.baraja.size()){
            while(iterator.hasNext()){
                Carta carta = iterator.next();
                cartas.add(carta);
                iterator.remove();
            }
        }else{
            System.out.println("Lo siento, no hay esa cantidad de cartas");
        }
        return cartas;
    }
    
    public void siguienteCarta(){
        
    }
}
