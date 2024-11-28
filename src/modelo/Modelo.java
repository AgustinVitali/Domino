package modelo;

import java.util.ArrayList;

public class Modelo {

    public Modelo() { 
         baraja = new ArrayList<>();
    }
    
    ArrayList<Ficha> baraja;

    public ArrayList<Ficha> getBaraja() {
        return baraja;
    }
    public void setBaraja(ArrayList<Ficha> baraja) {
        this.baraja = baraja;
    }
    public void generarFichas() {
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= i; j++) {
                baraja.add(new Ficha(i, j));
            }
        }
    }
    public void mezclar() {
        Ficha ficha = null;
        for (int i = 0; i < baraja.size(); i++) {
            int random = (int) (Math.random() * baraja.size());
            ficha = baraja.get(i);
            baraja.set(i, baraja.get(random));
            baraja.set(random, ficha);
        }

    }

}
