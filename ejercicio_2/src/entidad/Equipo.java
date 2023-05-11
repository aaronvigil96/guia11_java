/*
    Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
    y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
    esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
*/
package entidad;

import java.util.ArrayList;

public class Equipo {
    ArrayList<Jugador> jugadores;

    public Equipo(){
        this.jugadores = new ArrayList<>();
    }
    
    public void ingresarJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }
    
    public void mostrarJugadores(){
        for (Jugador jugadore : this.jugadores) {
            System.out.println(jugadore.toString());
        }
    }
}
