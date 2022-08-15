package br.uern.di.pa.abb.monte.lauriano;

import br.uern.di.pa.abb.monte.lauriano.Ave;
import br.uern.di.pa.abb.monte.lauriano.Passaro;
import br.uern.di.pa.abb.monte.lauriano.Papagaio;
import br.uern.di.pa.abb.monte.lauriano.Currupio;

public class Main {
    public static void main(String[] args) {

        Passaro papagaio = new Papagaio(10);
        System.out.println("Papagaio voa: " + papagaio.voar(20));
        papagaio.cantar();

        Passaro currupio = new Currupio(10);
        System.out.println("Currupio voa: " + currupio.voar(20));
        currupio.cantar();
    }
}