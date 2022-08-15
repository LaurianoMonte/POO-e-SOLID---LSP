package br.uern.di.pa.abb.monte.lauriano;

public class Currupio extends Passaro {

    @Override
    public void cantar() {
        System.out.println("Pio frio fru fri Pió");
    }

    public Currupio(int distanciaVoo) {
        super(distanciaVoo);
    }

    @Override
    public int voar(int distancia) {
        if (distancia > this.getDistanciaVoo()){
            return this.getDistanciaVoo();
        }
        else
        {
            return distancia;
        }
    }
}