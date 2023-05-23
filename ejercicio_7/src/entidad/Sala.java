package entidad;

public class Sala {
    private int precio;
    private Pelicula pelicula = new Pelicula();
    Espectador[][] butacas = new Espectador[8][6];
    
    public Sala(){
        this.precio = 100;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public boolean tieneDinero(Espectador espectador){
        return espectador.getDinero() > this.precio;
    }
    public boolean esMayor(Espectador espectador){
        return espectador.getEdad() >= this.pelicula.getEdad();
    }
    public int[][] buscarButacaLibre(){
        int matriz[][] = new int[8][6];
        int numero1 = 0;
        int numero2 = 0;
        for (int i = 0; i < 8; i++) {
            numero1 = (int) Math.round(Math.random() * 7);
            for (int j = 0; j < 6; j++) {
                numero2 = (int) Math.round(Math.random() * 5);
                if(this.butacas[numero1][numero2] == null){
                    matriz[i][j] = matriz[numero1][numero2];
                    System.out.println("hay lugar en " + matriz[i][j]);
                    break;
                }
                break;
            }
            break;
        }
        System.out.println(numero1);
        System.out.println(numero2);
        return matriz;
    }
    
    public void agregarEspectador() {
        int matriz[][] = buscarButacaLibre();
    }
    
    public void mostrarSala(){
        int vueltas;
        String[] letras = {"A","B","C","D","E","F"};
        for (int i = 8 - 1; i >= 0; i--) {
            vueltas = 0;
            while(vueltas < 6){
                if(this.butacas[i][vueltas] == null){
                    System.out.print((i + 1) + " " + letras[vueltas] + " " + " | ");
                }else {
                    System.out.print((i + 1) + " " + letras[vueltas] + " " + "X" + "| ");
                }
                vueltas++;
            }
            System.out.println("");
        }
    }
}
