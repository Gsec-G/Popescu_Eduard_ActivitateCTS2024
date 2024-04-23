package clase;

public class VanzareBilet implements Vanzare {
    private String meci;
    private int pret;

    public VanzareBilet(String meci, int pret) {
        this.meci = meci;
        this.pret = pret;
    }

    @Override
    public void vanzare(Persoana persoana) {
        System.out.println("Persoana " + persoana.getNume() + " a cumparat un bilet la meciul " + "\"" + this.meci+ "\"" + " platind un pret de " + this.pret + " RON.");
    }
}
