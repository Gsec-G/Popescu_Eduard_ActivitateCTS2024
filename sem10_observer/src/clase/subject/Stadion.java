package clase.subject;

public class Stadion extends Subject {
    @Override
    public void notificaFotbal() {
        super.notificaAbonati("Meci fotbal");
    }

    @Override
    public void notificaVolei() {
        super.notificaAbonati("Meci volei");
    }

    @Override
    public void notificaHandbal() {
        super.notificaAbonati("Meci handbal");
    }
    public void notificaConcert() {
        super.notificaAbonati("Concert");
    }
}
