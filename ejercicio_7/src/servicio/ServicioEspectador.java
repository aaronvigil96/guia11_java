package servicio;

import entidad.Espectador;

public class ServicioEspectador {
    
    private final String[] nombres = {"Cloe","Milagros","Maria","Sofia","Carlos","Aaron","German","Kevin","Bernabe","Malcom","Ladis"};
    private final String[] apellidos = {"Mollo", "Perez", "Longaniza", "Herrero", "Prodan", "Fernandez", "Molina"};
    
    public Espectador crearEspectador(){
        Espectador espectador = new Espectador();
        espectador.setApellido(nombres[(int) Math.round(Math.random() * (this.nombres.length - 1))]);
        espectador.setNombre(apellidos[(int) Math.round(Math.random() * (this.apellidos.length - 1))]);
        espectador.setEdad((int) Math.round(Math.random() * 99));
        espectador.setDinero((int) Math.round(Math.random() * 5000));
        return espectador;
    }
}
