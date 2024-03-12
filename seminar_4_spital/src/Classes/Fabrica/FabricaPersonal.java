package Classes.Fabrica;

import Classes.Abstract.PersonalSpital;
import Classes.Asistent;
import Classes.Brancardier;
import Classes.Infirmier;
import Classes.Medic;

public class FabricaPersonal {
    public static PersonalSpital createPersonal(TipPersonal tipPersonal, String nume,int salariu) {
        return switch (tipPersonal) {
            case MEDIC -> {
                yield new Medic(nume, salariu);
            }
            case ASISTENT -> {
                yield new Asistent(nume, salariu);
            }
            case BRANCARDIER -> {
                yield new Brancardier(nume, salariu);
            }
            case INFIRMIER -> {
                yield new Infirmier(nume, salariu);
            }
        };
    }
}
