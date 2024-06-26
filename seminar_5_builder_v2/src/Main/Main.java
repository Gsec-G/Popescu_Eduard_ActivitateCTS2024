package Main;

import Classes.Pacient;
import Classes.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        Pacient.PacientBuilder pacientBuilder1 = new Pacient.PacientBuilder();
        Pacient pacient1 = pacientBuilder1.setHalatPentruInterior(true).
                setPatRabatabil(true).setMicDejunInclus(true).setPapuciDeCamera(true).build();

        Pacient.PacientBuilder pacientBuilder2 = new Pacient.PacientBuilder();
        Pacient pacient2 = pacientBuilder1.build();

        System.out.println(pacient1.toString());
        System.out.println(pacient2.toString());
    }
}