package entidad;

import java.util.ArrayList;

public class Cine {
    private String nombre;
    private ArrayList<Sala> salas = new ArrayList<>();
    
    public Cine(){
        
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void agregarSala(Sala sala){
        this.salas.add(sala);
    }
    public int cantidadSalas(){
        return this.salas.size();
    }
}
