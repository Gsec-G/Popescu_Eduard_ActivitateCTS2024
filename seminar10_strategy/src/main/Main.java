package main;

import classes.*;

public class Main {
    public static void main(String[] args) {
        Verificator verificatorVIP = new VerificatorVIP();
        Portar portar = new Portar();
        String suporter1 = "Gigel de la tribuna";
        String suporter2 = "Ion de la VIP";
        String suporter3 = "Alin de la peluza";

        portar.setStrategie(verificatorVIP);
        portar.verificaSuporter(suporter1);

        portar.setStrategie(new VerificatorPeluza());
        portar.verificaSuporter(suporter3);

        portar.setStrategie(new VerificatorTribuna());
        portar.verificaSuporter(suporter2);
    }
}