package clase;

public class ProxyGen implements Vanzare {
    private Vanzare vanzareBilet;
    private String genAcceptat;

    public ProxyGen(Vanzare vanzareBilet, String genAcceptat) {
        this.vanzareBilet = vanzareBilet;
        this.genAcceptat = genAcceptat;
    }

    @Override
    public void vanzare(Persoana persoana) {
        if(persoana.getGen().equals(this.genAcceptat)) {
            vanzareBilet.vanzare(persoana);
        }
        else {
            System.out.println("Persoana " + persoana.getNume() + " are genul " + persoana.getGen() + " si nu poate achizitiona biletul.");
        }
    }
}
