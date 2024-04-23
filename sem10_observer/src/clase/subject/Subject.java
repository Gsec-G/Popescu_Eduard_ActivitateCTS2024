package clase.subject;

import clase.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    public List<Observer> observerList;
    public Subject() {
        this.observerList  = new ArrayList<>();
    }
    public void adaugaAbonat(Observer observer) {
        observerList.add(observer);
    }
    public void stergeAbonat(Observer observer) {
        if(!observerList.isEmpty()) {
            observerList.remove(observer);
        }
    }
    public void notificaAbonati(String mesaj) {
        for (Observer abonat : observerList) {
            abonat.primesteNotificare(mesaj);
        }
    }
    public abstract void notificaFotbal();
    public abstract void notificaVolei();
    public abstract void notificaHandbal();
}
