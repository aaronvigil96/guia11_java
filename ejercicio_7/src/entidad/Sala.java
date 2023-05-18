package entidad;

import java.util.ArrayList;

public class Sala {
    //Atributos
    private ArrayList<Espectador> espectadores;
    private Pelicula pelicula;
    private int precio;
    
    //Constructor
    public Sala(){
        
    }
    
    //Métodos
    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }
    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }
    public Pelicula getPelicula() {
        return pelicula;
    }
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void mostrarSala(){
        String[][] matriz = new String[8][6];
        String[] letras = {"A","B","C","D","E","F"};
        int vueltas;
        for (int i = 8; i > 0; i--) {
            vueltas = 0;
            while(vueltas < 6){
                System.out.print(i + letras[vueltas] + " ");
                vueltas++;
            }
            System.out.println("");
        }
    }
}
