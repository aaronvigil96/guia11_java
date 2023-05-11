/*
    Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
    y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
    esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
*/
package ejercicio_2;

import entidad.Equipo;
import entidad.Jugador;
import java.util.Scanner;
import servicio.JugadorServicio;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        JugadorServicio js = new JugadorServicio();
        Equipo equipo = new Equipo();
        int opcion;
        System.out.println("Bienvenido a TuEquipo");
        do{
            System.out.println("1)- Ingresar nuevo jugador");
            System.out.println("2)- Mostrar jugadores");
            System.out.println("0)- Salir");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1: {
                    equipo.ingresarJugador(js.crearJugador());
                    break;
                }
                case 2:{
                    equipo.mostrarJugadores();
                    break;
                }
                case 0: {
                    break;
                }
            }
        }while(opcion != 0);
    }
    
}
