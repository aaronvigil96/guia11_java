package ejercicio_4;

import entidad.Perro;
import entidad.Persona;
import servicio.PerroServicio;
import servicio.PersonaServicio;

public class Ejercicio_4 {
    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        PerroServicio perroServicio = new PerroServicio();
        Persona personaUno = ps.crearPersona();
        Persona personaDos = ps.crearPersona();
        Perro perroUno = perroServicio.crearPerro();
        Perro perroDos = perroServicio.crearPerro();
        ps.ingresarMascota(personaUno, perroUno);
        ps.ingresarMascota(personaDos, perroDos);
        System.out.println(personaUno.toString());
        System.out.println(personaDos.toString());
    }
    
}
