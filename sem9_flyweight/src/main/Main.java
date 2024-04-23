package main;

import clase.Caracteristici;
import clase.Fabrica;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        Caracteristici caracteristici1 = new Caracteristici(10,15,"rosu");
        Caracteristici caracteristici2 = new Caracteristici(30,25,"verde");

        fabrica.getSpectator(10,10).deseneaza(caracteristici1);
        fabrica.getSpectator(20,10).deseneaza(caracteristici2);
    }
}