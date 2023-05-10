/*
    Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
    objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
    acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
*/
package entidad;
public class Dni {
    //Atributos
    private String serie;
    private long numero;
    
    //Constructor
    public Dni() {
        
    }

    public Dni(String serie, long numero) {
        this.serie = serie;
        this.numero = numero;
    }
    
    //Métodos
    public String getSerie() {
        return serie;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }
    public long getNumero() {
        return numero;
    }
    public void setNumero(long numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Dni{" + "serie=" + serie + ", numero=" + numero + '}';
    }
    
}
