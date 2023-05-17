package servicio;

import entidad.Perro;
import entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {
    
    Scanner entrada = new Scanner(System.in);
    
    public Persona crearPersona(){
        int vueltas = 0;
        Long documento;
        String documentoString;
        int opcion;
        Persona persona = new Persona();
        System.out.println("Ingresá el nombre de la persona");
        persona.setNombre(entrada.next().toLowerCase());
        System.out.println("Ingresá el apellido de la persona");
        persona.setApellido(entrada.next().toLowerCase());
        do{
            if(vueltas > 0){
                System.out.println("Ingresá una edad válida");
            }else {
                System.out.println("Ingresá la edad de la persona");
            }
            opcion = entrada.nextInt();
            entrada.nextLine();
            vueltas++;
        }while(opcion <= 0 || opcion > 100);
        vueltas = 0;
        persona.setEdad(opcion);
        do{
            if(vueltas > 0){
                System.out.println("Ingresá un número de documento válido");
            }else {
                System.out.println("Ingresá el número de documento");
            }
            documento = entrada.nextLong();
            documentoString = documento.toString();
            entrada.nextLine();
            vueltas++;
        }while(documentoString.length() < 7 || documentoString.length() > 8);
        documento = Long.valueOf(documentoString);
        persona.setDocumento(documento);
        persona.setPerro(new Perro());
        return persona;
    }
}
