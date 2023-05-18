package entidad;

public class Espectador {
    //Atributos
    private String nombre;
    private int edad;
    private double dinero;
    
    //Constructor
    public Espectador(){
        
    }
    
    //Métodos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getDinero() {
        return dinero;
    }
    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
}
