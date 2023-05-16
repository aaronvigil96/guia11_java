package ejercicio_7;

import entidad.Baraja;
import entidad.Carta;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        int opcion;
        Scanner entrada = new Scanner(System.in);
        Baraja baraja = new Baraja();
        ArrayList<Carta> barajaRepartida = new ArrayList<>();
        
        System.out.println("Bienvenido a TuNaipe");
        do{
            System.out.println("1)- Barajar");
            System.out.println("2)- Mostrar cartas");
            System.out.println("3)- Numero de cartas disponibles");
            System.out.println("4)- Dar Cartas");
            System.out.println("5)- Mostrar cartas que salieron");
            System.out.println("0)- Salir");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch(opcion){
                case 1: {
                    baraja.barajar();
                    System.out.println("Cartas barajadas");
                    break;
                }
                case 2: {
                    baraja.mostrarCartas();
                    break;
                }
                case 3: {
                    System.out.println("La cantidad de cartas disponibles son: " + baraja.cartasDisponibles());
                    break;
                }
                case 4: {
                    int vueltas = baraja.darCartas();
                    if(vueltas == 0){
                        System.out.println("Lo siento, no hay esa cantidad de cartas");
                    }else {
                        for (int i = 0; i < vueltas; i++) {
                            barajaRepartida.add(baraja.siguienteCarta());
                        }
                    }
                }
                case 5: {
                    System.out.println("Las cartas que salieron son: ");
                    for(Carta carta1 : barajaRepartida){
                        System.out.println(carta1);
                    }
                    break;
                }
                case 0: {
                    break;
                }
            }
        }while(opcion != 0);
    }
    
}
