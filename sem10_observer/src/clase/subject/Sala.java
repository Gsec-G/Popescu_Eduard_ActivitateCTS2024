package clase.subject;

public class Sala extends Subject{

    @Override
    public void notificaFotbal() {
        String mesaj = "Va avea loc un meci de fotbal pe 23";
        super.notificaAbonati(mesaj);
    }

    @Override
    public void notificaVolei() {
        String mesaj = "Va avea loc un meci de volei pe 27";
        super.notificaAbonati(mesaj);
    }

    @Override
    public void notificaHandbal() {
        String mesaj = "Va avea loc un meci de fotbal pe 23";
        super.notificaAbonati(mesaj);
    }
}
