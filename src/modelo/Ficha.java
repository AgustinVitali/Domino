package modelo;

public class Ficha {

    private int numeroArriba;
    private int numeroAbajo;

    public Ficha(int numeroArriba, int numeroAbajo) {
        this.numeroAbajo = numeroAbajo;
        this.numeroArriba = numeroArriba;

    }

    @Override
    public String toString() {
        return "[" + numeroArriba + "|" + numeroAbajo + "]";
    }

    public Ficha() {
    }

    public int getNumeroArriba() {
        return numeroArriba;
    }

    public void setNumeroArriba(int numeroArriba) {
        this.numeroArriba = numeroArriba;
    }

    public int getNumeroAbajo() {
        return numeroAbajo;
    }

    public void setNumeroAbajo(int numeroAbajo) {
        this.numeroAbajo = numeroAbajo;
    }

}
