package entidad;

public class Pelicula {
    //Atributos
    private String director;
    private String titulo;
    private int edad;
    private int duracion;
    
    //Constructor
    public Pelicula(){
        this.director = "no se";
        this.titulo = "titanic";
        this.edad = 18;
        this.duracion = 120;
    }
    
    //Métodos
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
