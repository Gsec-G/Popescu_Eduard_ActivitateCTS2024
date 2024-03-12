package Classes.factory;

import Classes.Abstract.PersonalSpital;
import Classes.Asistent;

public class FabricaAsistent implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Asistent(nume,salariu);
    }
}
