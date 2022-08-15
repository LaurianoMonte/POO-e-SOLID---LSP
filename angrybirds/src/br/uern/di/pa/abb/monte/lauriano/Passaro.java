package br.uern.di.pa.abb.monte.lauriano;

import br.uern.di.pa.abb.monte.lauriano.Ave;

public abstract class Passaro implements Ave {

    public int voar() {
        return 0;
    }

    public void cantar() {
    }

    private int distanciaVoo;
    public Passaro(int distanciaVoo) {
        this.distanciaVoo = distanciaVoo;
    }

    public int getDistanciaVoo() {
        return distanciaVoo;
    }

    public void setDistanciaVoo(int distanciaVoo) {
        this.distanciaVoo = distanciaVoo;
    }
}