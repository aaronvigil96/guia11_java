package servicio;

import entidad.Espectador;
import entidad.Sala;

public class ServicioSala {
    public Sala crearSala(){
        Sala sala = new Sala();
        sala.setPrecio((int) Math.round(Math.random() * 2000));
        return sala;
    }
    
    public void mostrarSala(Sala sala){
        String []letras = {"A","B","C","D","E","F"};
        for (int i = 8 - 1; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                if(sala.getButacas()[i][j] == null){
                    System.out.print((i+1) + " " + letras[j] + " " + "| ");
                }else {
                    System.out.print((i+1) + " " + letras[j] + " " + "X" + "| ");
                }
            }
            System.out.println("");
        }
    }
    
    public boolean tieneDinero(Sala sala, Espectador espectador){
        return espectador.getDinero() >= sala.getPrecio();
    }
    
    public boolean esMayor(Sala sala, Espectador espectador){
        return espectador.getEdad() >= sala.getPelicula().getEdad();
    }
    
    public boolean puedeVerPelicula(Sala sala, Espectador espectador){
        return esMayor(sala, espectador) && tieneDinero(sala, espectador);
    }
    
    public void ubicarEnSala(Sala sala, Espectador espectador){
        if(puedeVerPelicula(sala, espectador)){
        }
    }
}
