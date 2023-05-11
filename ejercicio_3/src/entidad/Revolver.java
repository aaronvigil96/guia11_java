package entidad;

public class Revolver {
    //Atributos
    private int posicionActual;
    private int posicionAgua;
    
    //Constructores
    public Revolver(){
    }
    
    //Métodos
    public int getPosicionActual() {
        return posicionActual;
    }
    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }
    public int getPosicionAgua() {
        return posicionAgua;
    }
    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    public void llenarRevolver() {
        this.posicionActual = (int) Math.round(Math.random() * 6);
        this.posicionAgua = (int) Math.round(Math.random() * 6);
    }
    public boolean mojar(){
        return this.posicionActual == this.posicionAgua;
    }
    public void siguienteChorro(){
        if(this.posicionActual < 6){
            this.posicionActual++;
        }else {
            this.posicionActual = 1;
        }
    }
    
    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
}
