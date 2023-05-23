package entidad;

public class Espectador {
    private String nombre;
    private String apellido;
    private int dinero;
    private int edad;
    
    public Espectador(){
        this.nombre = "Aaron";
        this.apellido = "Vigil";
        this.dinero = 250;
        this.edad = 27;
    }

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
    public int getDinero() {
        return dinero;
    }
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
