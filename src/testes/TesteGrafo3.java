package testes;

import Avaliacao2.AlgoritmoGenetico.AlgoritmoGenetico;

public class TesteGrafo3 {
    public static void main(String[] args) {

        AlgoritmoGenetico algoritmoGenetico = new AlgoritmoGenetico(100, 5, 1, 25, 17);
        algoritmoGenetico.start(5, 24, 10, 15, 10);/*
        algoritmoGenetico.start(24, 4, 10, 15, 10);
        algoritmoGenetico.start(5, 24, 10, 15, 10);
        algoritmoGenetico.start(5, 10, 10, 15, 10);*/


    }

}

