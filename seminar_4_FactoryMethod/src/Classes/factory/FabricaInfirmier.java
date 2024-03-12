package Classes.factory;

import Classes.Abstract.PersonalSpital;
import Classes.Infirmier;

public class FabricaInfirmier implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Infirmier(nume, salariu);
    }
}
