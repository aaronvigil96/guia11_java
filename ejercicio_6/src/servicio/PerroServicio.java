package servicio;

import entidad.Perro;
import enumeracion.RazaEnumeracion;
import enumeracion.TamanioEnumeracion;
import java.util.Scanner;

public class PerroServicio {
    
    Scanner entrada = new Scanner(System.in);
    
    public Perro crearPerro(){
        int opcion;
        int vueltas = 0;
        Perro perro = new Perro();
        System.out.println("Ingresá el nombre del perro");
        perro.setNombre(entrada.next());
        entrada.nextLine();
        do {
            if(vueltas > 0){
                System.out.println("Ingresá una edad válida");
            }else {
                System.out.println("Ingresá la edad del perro");
            }
            opcion = entrada.nextInt();
            entrada.nextLine();
            vueltas++;
        }while(opcion <= 0 || opcion > 20);
        perro.setEdad(opcion);
        vueltas = 0;
        do{
            if(vueltas > 0){
                System.out.println("Ingresá un tamaño válido");
            } else {
                System.out.println("Ingresá el tamaño del perro");
            }
            System.out.println("1)- Chiquito");
            System.out.println("2)- Mediano");
            System.out.println("3)- Grande");
            opcion = entrada.nextInt();
            entrada.nextLine();
            vueltas++;
        }while(opcion != 1 && opcion != 2 && opcion != 3);
        perro.setTamanio(TamanioEnumeracion.values()[opcion - 1]);
        vueltas = 0;
        do{
            if(vueltas > 0){
                System.out.println("Ingresá una raza válida");
            }else {
                System.out.println("Ingresá el tamaño del perro");
            }
            System.out.println("1)- Callejero");
            System.out.println("2)- Pitbull");
            System.out.println("3)- Border Collie");
            System.out.println("4)- Cocker");
            opcion = entrada.nextInt();
            entrada.nextLine();
        }while(opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4);
        perro.setRaza(RazaEnumeracion.values()[opcion -1]);
        return perro;
    }
}
