package ejercicio_3;

import entidad.Juego;
import entidad.Jugador;
import entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        Revolver revolver = new Revolver();
        revolver.llenarRevolver();
        Juego juego = new Juego();
        boolean vueltas = false;
        int opcion;
        
        System.out.println("¿Con cuantos jugadores vas a jugar?");
        opcion = entrada.nextInt();
        entrada.nextLine();
        if(opcion < 1 || opcion > 6){
            opcion = 6;
        }
        for (int i = 0; i < opcion; i++) {
            jugadores.add(new Jugador(i + 1, ("Jugador " + (i + 1))));
        }
        juego.llenarJuegos(jugadores, revolver);
        while(!vueltas){
            vueltas = juego.ronda();
        }
        
    }
    
}
