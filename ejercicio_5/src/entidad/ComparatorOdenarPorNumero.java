package entidad;

import java.util.Comparator;

public class ComparatorOdenarPorNumero implements Comparator<Carta> {
    @Override
    public int compare(Carta cUno, Carta cDos) {
        return cUno.getNumero() - cDos.getNumero();
    }
}
