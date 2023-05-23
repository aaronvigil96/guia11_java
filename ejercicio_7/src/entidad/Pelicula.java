package entidad;

public class Pelicula {
    private String titulo;
    private String director;
    private int edad;
    private int duracion;
    
    public Pelicula(){
        this.titulo = "titanic";
        this.director = "ni idea";
        this.edad = 27;
        this.duracion = 50;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
