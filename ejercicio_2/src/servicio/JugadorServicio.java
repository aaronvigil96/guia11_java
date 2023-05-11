package servicio;

import entidad.Jugador;
import java.util.Scanner;

public class JugadorServicio {
    
    Scanner entrada = new Scanner(System.in);
    
    public Jugador crearJugador(){
        Jugador jugador = new Jugador();
        System.out.println("Ingrese el nombre del jugador");
        jugador.setNombre(entrada.next());
        System.out.println("Ingrese el apellido del jugador");
        jugador.setApellido(entrada.next());
        System.out.println("Ingresá la posicion en la que juega");
        jugador.setPosicion(entrada.next());
        System.out.println("Ingresá el número del jugador");
        jugador.setNumero(entrada.nextInt());
        entrada.nextLine();
        return jugador;
    }
}
