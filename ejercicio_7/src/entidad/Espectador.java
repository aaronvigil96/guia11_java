package entidad;

public class Espectador {
    //Atributos
    private String nombre;
    private String apellido;
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
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if(edad > 0 && edad < 100){
            this.edad = edad;
        }
    }
    public double getDinero() {
        return dinero;
    }
    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dinero=" + dinero + '}';
    }
}
