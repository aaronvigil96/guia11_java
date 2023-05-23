package ejercicio_7;

import entidad.Espectador;
import entidad.Sala;
import servicio.ServicioEspectador;
import servicio.ServicioSala;

public class Ejercicio_7 {
    public static void main(String[] args) {
        ServicioEspectador se = new ServicioEspectador();
        ServicioSala sa = new ServicioSala();
        Espectador espectador = se.crearEspectador();
        System.out.println(espectador);
        Sala sala = sa.crearSala();
        sa.mostrarSala(sala);
    }
    
}
