package main;

import clase.observer.Abonat;
import clase.observer.Observer;
import clase.observer.Vecini;
import clase.subject.Sala;
import clase.subject.Stadion;
import clase.subject.Subject;

public class Main {
    public static void main(String[] args) {
        Observer abonat1 = new Abonat("Gigel1");
        Observer abonat2 = new Abonat("Gigel2");
        Observer abonat3 = new Abonat("Gigel3");
        Observer vecin1 = new Vecini("Gigel4", 25);

        Subject sala = new Sala();
        sala.adaugaAbonat(abonat2);
        sala.adaugaAbonat(abonat1);
        sala.adaugaAbonat(abonat3);

        sala.notificaFotbal();

        sala.stergeAbonat(abonat2);
        sala.adaugaAbonat(vecin1);
        sala.notificaVolei();

        Subject stadion = new Stadion();
        stadion.adaugaAbonat(abonat3);
        stadion.adaugaAbonat(abonat2);
        ((Stadion)stadion).notificaConcert();
    }
}