/*
    Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
    y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
    contener un método toString() que retorne el número de carta y el palo. La baraja estará
    compuesta por un conjunto de cartas, 40 exactamente.
    Las operaciones que podrá realizar la baraja son:
    • barajar(): cambia de posición todas las cartas aleatoriamente.
    • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
    se haya llegado al final, se indica al usuario que no hay más cartas.
    • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
    cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
    debemos indicárselo al usuario.
    • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
    indicárselo al usuario
    • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
    luego se llama al método, este no mostrara esa primera carta.
*/
package ejercicio_5;

import entidad.Baraja;
import entidad.Carta;
import enums.Palo;
import java.util.ArrayList;
import servicio.CartaServicio;

public class Ejercicio_5 {
    public static void main(String[] args) {
        CartaServicio cs = new CartaServicio();
        Baraja baraja = new Baraja();
        
        Carta carta;
        
        int aux = 0;
        for (int i = 0; i < 12; i++) {
            if(i == 8 || i == 9){        
            }else {
                while(aux < 4){
                carta = new Carta();
                carta.setNumero(i + 1);
                carta.setPalo(Palo.values()[aux]);
                baraja.agregarCarta(carta);
                aux++;
            }}
            aux = 0;
        }

        ArrayList<Carta> cartas = baraja.darCartas(15);
        for (Carta carta1 : cartas) {
            System.out.println(carta1);
        }
    }
}
