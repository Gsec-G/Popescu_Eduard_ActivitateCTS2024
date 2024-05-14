public class abonat implements observer{
    String nume;

    public abonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void notificare(String mesaj) {
        System.out.println(nume + " a primit mesajul " + mesaj);
    }
}
