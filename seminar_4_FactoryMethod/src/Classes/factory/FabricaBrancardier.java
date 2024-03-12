package Classes.factory;

import Classes.Abstract.PersonalSpital;
import Classes.Brancardier;

public class FabricaBrancardier implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Brancardier(nume,salariu);
    }
}
