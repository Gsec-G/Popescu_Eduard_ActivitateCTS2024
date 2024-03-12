package Classes.factory;

import Classes.Abstract.PersonalSpital;

public interface FabricaPersonal {
    public PersonalSpital createPersonal(String nume, int salariu);
}
