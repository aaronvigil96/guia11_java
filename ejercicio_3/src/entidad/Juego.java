package entidad;

import java.util.ArrayList;

public class Juego {
    //Atributos
    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    //Constructores
    public Juego() {
        
    }
    
    //Métodos
    public void llenarJuegos(ArrayList<Jugador> jugadores, Revolver revolver){
        this.jugadores = jugadores;
        this.revolver = revolver;
    }
    
    public boolean ronda(){
        for (Jugador jugadore : jugadores) {
            System.out.println("agua: " + revolver.getPosicionAgua());
            System.out.println("posicion: " + revolver.getPosicionActual());
            jugadore.disparo(revolver);
            if(jugadore.isMojado()){
                System.out.println(jugadore.getNombre() + " perdió");
                return true;
            }
        }
        return false;
    }
}
