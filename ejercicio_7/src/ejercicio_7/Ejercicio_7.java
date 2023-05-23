package ejercicio_7;

import entidad.Cine;
import entidad.Espectador;
import entidad.Sala;
import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cine cine = new Cine();
        Sala sala = new Sala();
        Espectador espectador = new Espectador();
        sala.agregarEspectador();
        sala.mostrarSala();
    }
}
