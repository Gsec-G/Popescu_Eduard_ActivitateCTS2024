package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Vanzare biletSteauaRapid = new VanzareBilet("Steaua - Rapid", 25);
        Persoana persoana1 = new Persoana("Ion Vasilescu", 20, "M");
        Persoana persoana2 = new Persoana("Vasile Popescu", 35, "M");
        Persoana persoana3 = new Persoana("Gheorghita Ionescu", 12, "F");
        Persoana persoana4 = new Persoana("Maria Ionescu", 19, "F");

        biletSteauaRapid.vanzare(persoana1);
        biletSteauaRapid.vanzare(persoana2);

        Vanzare proxyVarsta = new ProxyVarsta(biletSteauaRapid, 14);
        proxyVarsta.vanzare(persoana3);

        Vanzare proxyGen = new ProxyGen(proxyVarsta,"M");
        proxyGen.vanzare(persoana1);
        proxyGen.vanzare(persoana3);
        proxyGen.vanzare(persoana4);
    }
}