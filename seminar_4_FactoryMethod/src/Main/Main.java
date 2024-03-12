package Main;

import Classes.Abstract.PersonalSpital;
import Classes.Medic;
import Classes.factory.*;

public class Main {
    public static void prelucrarePersonal(FabricaPersonal fabricaPersonal, String nume, int salariu) {
        PersonalSpital personalSpital = fabricaPersonal.createPersonal(nume, salariu);
        personalSpital.afisareDetalii();
    }
    public static void main(String[] args) {
        FabricaPersonal fabricaMedic = new FabricaMedic();
        FabricaPersonal fabricaAsistent = new FabricaAsistent();
        FabricaPersonal fabricaBrancardier = new FabricaBrancardier();

        PersonalSpital medic = fabricaMedic.createPersonal("Popescu Ion", 5000);
        PersonalSpital asistent = fabricaAsistent.createPersonal("Mihai Ion", 3500);
        PersonalSpital brancardier = fabricaBrancardier.createPersonal("Popa Mihaela", 3000);

        medic.afisareDetalii();
        asistent.afisareDetalii();
        brancardier.afisareDetalii();

        prelucrarePersonal(new FabricaMedic(), "Vasilescu Radu", 8000);
        prelucrarePersonal(new FabricaInfirmier(),"Petcu Ioana", 4500);
    }
}