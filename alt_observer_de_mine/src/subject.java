import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public abstract class subject {
    private List<observer> observerList;
    public subject() { this.observerList = new ArrayList<>();}
    public void adaugaAbonat(observer observer) {
        this.observerList.add(observer);
    }
    public void stergeAbonat(observer observer) {
        if(!observerList.isEmpty()) {
            this.observerList.remove(observer);
        }
    }
    public void notificaAbonati(String mesaj) {
       for(observer abonat: observerList) {
           abonat.notificare(mesaj);
        }
    }
    public abstract void notifica_istorie();
}
