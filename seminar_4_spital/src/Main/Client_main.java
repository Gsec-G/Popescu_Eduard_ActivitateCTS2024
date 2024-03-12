package Main;

import Classes.Abstract.PersonalSpital;
import Classes.Fabrica.FabricaPersonal;
import Classes.Fabrica.TipPersonal;

public class Client_main {
    public static void main(String[] args) {
        FabricaPersonal fabricaPersonal = new FabricaPersonal();
        try {
            PersonalSpital medic = fabricaPersonal.createPersonal(TipPersonal.MEDIC, "Popescu Ion", 2555);
            PersonalSpital asistent = fabricaPersonal.createPersonal(TipPersonal.ASISTENT,"Ionescu Ionut", 1995);
            PersonalSpital brancardier = fabricaPersonal.createPersonal(TipPersonal.BRANCARDIER,"Vasilescu Mihai", 1500);
            PersonalSpital infirmier = fabricaPersonal.createPersonal(TipPersonal.INFIRMIER,"Mihaescu Ion", 3000);

            medic.afisareDetalii();
            asistent.afisareDetalii();
            brancardier.afisareDetalii();
            infirmier.afisareDetalii();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}