package clase.observer;

public class Abonat implements Observer {
    private String nume;
    public Abonat(String nume) {
        this.nume = nume;
    }
    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Abonatul " + this.nume + " primeste mesajul: " + mesaj);
    }
}
