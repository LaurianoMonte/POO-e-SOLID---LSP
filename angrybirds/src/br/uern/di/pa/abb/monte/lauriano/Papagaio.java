package br.uern.di.pa.abb.monte.lauriano;

public class Papagaio extends Passaro {

    @Override
    public void cantar() {
        System.out.println("Papagaio Legal");
    }

    @Override
    public int voar(int distancia) {
        if (distancia > this.getDistanciaVoo()){
            return this.getDistanciaVoo();
        }else{
            return distancia;
        }
    }

    public Papagaio(int distanciaVoo) {
        super(distanciaVoo);
    }
}