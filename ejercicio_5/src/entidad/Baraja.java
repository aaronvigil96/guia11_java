package entidad;

import Enumeracion.PaloEnumeracion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Baraja {
    //Atributos
    Scanner entrada = new Scanner(System.in);
    private final ArrayList<Carta> baraja = new ArrayList<>();
    
    //Constructor
    public Baraja(){
        Carta carta;
        int vueltas = 0;
        for (int i = 0; i < 12; i++) {
            while(vueltas < 4){
                carta = new Carta();
                carta.setNumero(i + 1);
                if(carta.getNumero() != 0){
                    carta.setPalo(PaloEnumeracion.values()[vueltas]);
                    agregarCarta(carta);
                }
                vueltas++;
            }
            vueltas = 0;
        }
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
    public int cartasDisponibles(){
        return this.baraja.size();
    }
    public void barajar(){
        Collections.shuffle(this.baraja);
    }
    //Retorno y elimino carta o devuelvo nulo.
    public Carta siguienteCarta(){
        Carta carta = null;
        Iterator<Carta> iterator = this.baraja.iterator();
        while(iterator.hasNext()){
            carta = iterator.next();
            iterator.remove();
            return carta;
        }
        return carta;
    }
    public int darCartas(){
        System.out.println("¿Cuantas cartas queres?");
        int cantidad = entrada.nextInt();
        entrada.nextLine();
        if(cartasDisponibles() < cantidad){
            cantidad = 0;
        }
        return cantidad;
    }
}
