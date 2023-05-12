package servicio;

import entidad.Perro;
import java.util.Scanner;

public class PerroServicio {
    
    Scanner entrada = new Scanner(System.in);
    
    public Perro crearPerro(){
        Perro perro = new Perro();
        System.out.println("Creando perro...");
        System.out.println("Nombre: ");
        perro.setNombre(entrada.next());
        System.out.println("Edad: ");
        perro.setEdad(entrada.nextInt());
        entrada.nextLine();
        System.out.println("Raza: ");
        perro.setRaza(entrada.next());
        System.out.println("Tamaño: ");
        perro.setTamanio(entrada.next());
        return perro;
    }
}
