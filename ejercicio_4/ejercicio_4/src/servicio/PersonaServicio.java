package servicio;

import entidad.Perro;
import entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {
    
    Scanner entrada = new Scanner(System.in);
    
    public Persona crearPersona(){
        Persona persona = new Persona();
        System.out.println("Creando persona...");
        System.out.println("Nombre: ");
        persona.setNombre(entrada.next());
        System.out.println("Apellido: ");
        persona.setApellido(entrada.next());
        System.out.println("Edad: ");
        persona.setEdad(entrada.nextInt());
        entrada.nextLine();
        System.out.println("Documento: ");
        persona.setDocumento(entrada.nextLong());
        entrada.nextLine();
        return persona;
    }
    
    public void ingresarMascota(Persona persona, Perro perro){
        persona.setPerro(perro);
    }
}
