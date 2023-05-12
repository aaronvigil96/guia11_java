package entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Baraja {
    //Atributo
    private ArrayList<Carta> baraja;
    
    //Constructor
    public Baraja(){
        this.baraja = new ArrayList<>();
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
    
    public void ordenarBarajaAscendete(){
        Collections.sort(this.baraja, new ComparatorOdenarPorNumero());
    }
    
    public void ordenarBarajaDescendete(){
        Collections.sort(this.baraja, new ComparatorOrdenarPorNumeroDescendete());
    }
    
    public void barajar(){
        Collections.shuffle(this.baraja);
    }
    
    public void siguienteCarta(){
        Iterator<Carta> iterator = this.baraja.iterator();
        boolean estado = false;
        Carta carta;
        if (this.baraja.size() > 0) {
            while (iterator.hasNext()) {
                Carta cartaIterator = iterator.next();
                carta = cartaIterator;
                System.out.println(carta);
                iterator.remove();
                System.out.println("Carta eliminada");
                estado = true;
                break;
            }
        }
        if(!estado){
            System.out.println("No quedan más cartas");
        }
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
}
