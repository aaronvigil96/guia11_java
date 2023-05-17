/*
    Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
    tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
    cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
    al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
    persona.
    Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
    personas con sus respectivos perros.
*/
package ejercicio_6;

import entidad.ListaPerro;
import entidad.ListaPersona;
import java.util.Scanner;
import servicio.PerroServicio;
import servicio.PersonaServicio;

public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String nombrePersona, nombrePerro;
        PerroServicio PerroServicio = new PerroServicio();
        PersonaServicio PersonaServicio = new PersonaServicio();
        ListaPersona ListaPersona = new ListaPersona();
        ListaPerro ListaPerro = new ListaPerro();
        do {
            System.out.println("1)- Crear Persona");
            System.out.println("2)- Crear Perro");
            System.out.println("3)- Adoptar perro");
            System.out.println("4)- Mostrar personas");
            System.out.println("0)- Salir");

            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1: {
                    ListaPersona.agregarPersona(PersonaServicio.crearPersona());
                    break;
                }
                case 2: {
                    ListaPerro.agregarPerro(PerroServicio.crearPerro());
                    break;
                }
                case 3: {
                    System.out.println("Personas...");
                    ListaPersona.mostrarPersona();
                    System.out.println("-------------------");
                    System.out.println("Escribí el nombre de la persona que va adoptar el perro");
                    nombrePersona = entrada.next();
                    System.out.println("Perros...");
                    ListaPerro.mostrarPerro();
                    System.out.println("--------------------");
                    System.out.println("Ingresá el nombre del perro a adoptar");
                    nombrePerro = entrada.next();
                    if(ListaPersona.existePersona(nombrePersona) && ListaPerro.existePerro(nombrePerro)){
                        if(ListaPersona.elPerroEstaAdoptado(nombrePerro)){
                            System.out.println("Lo siento, ese perro está adoptado");
                        }else {
                            ListaPersona.traerPersona(nombrePersona).setPerro(ListaPerro.traerPerro(nombrePerro));
                        }
                    }else {
                        System.out.println("El perro o la persona no existe");
                    }
                    break;
                }
                case 4: {
                    ListaPersona.mostrarPersona();
                    break;
                }
            }
        } while (opcion != 0);
    }
}
