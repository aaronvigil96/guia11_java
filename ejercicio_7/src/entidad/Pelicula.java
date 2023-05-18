package entidad;

public class Pelicula {
    //Atributos
    private String titulo;
    private int duracion;
    private int edad;
    private String director;
    
    //Constructor
    public Pelicula(){
        
    }
    
    //Métodos
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
}
