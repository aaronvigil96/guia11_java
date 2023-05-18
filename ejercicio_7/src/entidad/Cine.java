package entidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Cine {
    
    Scanner entrada = new Scanner(System.in);
    
    //Atributos
    private ArrayList<Sala> salas = new ArrayList<>();
    
    //Constructor
    public Cine(){
        System.out.println("¿Cuantas salas quiere agregar?");
        int opcion = entrada.nextInt();
        while(opcion > 0){
            this.salas.add(new Sala());
            opcion--;
        }
    }
    
    //Métodos
    public ArrayList<Sala> getSalas() {
        return salas;
    }
    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }
    public int cantidadDeSalas(){
        return this.salas.size();
    }
    public void agregarSala(Sala sala){
        this.salas.add(sala);
    }
}
