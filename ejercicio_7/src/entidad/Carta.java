package entidad;

import Enumeracion.PaloEnumeracion;

public class Carta {
    //Atributos
    private int numero;
    private PaloEnumeracion palo;
    
    //Constructor
    public Carta(){
        
    }
    
    //Métodos
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        if(numero > 0 && numero <= 12 && numero != 8 && numero != 9){
            this.numero = numero;
        }
    }
    public PaloEnumeracion getPalo() {
        return palo;
    }
    public void setPalo(PaloEnumeracion palo) {
        this.palo = palo;
    }
    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
    }
}
