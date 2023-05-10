/*
    Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
    objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
    acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
*/

package ejercicio_1;

import entidad.Dni;
import entidad.Persona;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Persona persona = new Persona("Aaron", "Vigil", new Dni("A",12345678));
        Persona persona2 = new Persona("Alan", "Vergil", new Dni("B",123123));
        
        System.out.println(persona.toString());
        System.out.println(persona2.toString());
    }
    
}
