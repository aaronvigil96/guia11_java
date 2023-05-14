package servicio;

import entidad.Perro;
import enumeracion.TamanioEnumeracion;
import java.util.Scanner;

public class PerroServicio {
    
    Scanner entrada = new Scanner(System.in);
    
    public Perro crearPerro(){
        int edad, opcion;
        Perro perro = new Perro();
        System.out.println("Ingresá el nombre del perro");
        perro.setNombre(entrada.next());
        entrada.nextLine();
        do{
            System.out.println("Ingresá el tamaño del perro");
            System.out.println("1)- Chiquito");
            System.out.println("2)- Mediano");
            System.out.println("3)- Grande");
            opcion = entrada.nextInt();
            entrada.nextLine();
        }while(opcion != 1 && opcion != 2 && opcion != 3);
        return perro;
    }
}
