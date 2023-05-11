package entidad;

public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado = false;

    //Constructor
    public Jugador(){
        
    }
    public Jugador(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    
    //Métodos
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isMojado() {
        return mojado;
    }
    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    public void disparo(Revolver revolver){
        this.mojado = revolver.mojar();
        revolver.siguienteChorro();
    }
}
