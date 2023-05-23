package entidad;

public class Sala {
    //Atributos
    private double precio;
    private Espectador[][] butacas = new Espectador[8][6];
    private Pelicula pelicula = new Pelicula();
    
    //Constructor
    public Sala(){
        
    }
    
    //Métodos
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Espectador[][] getButacas() {
        return butacas;
    }
    public void setButacas(Espectador[][] butacas) {
        this.butacas = butacas;
    }
    public Pelicula getPelicula() {
        return pelicula;
    }
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
}
