package clase;

public class ProxyVarsta implements Vanzare{
    private Vanzare vanzareBilet;
    private static int varstaMinima;
    public ProxyVarsta(Vanzare vanzareBilet, int varstaMinima) {
        this.vanzareBilet = vanzareBilet;
        ProxyVarsta.varstaMinima = varstaMinima;
    }
    @Override
    public void vanzare(Persoana persoana) {
        if(persoana.getVarsta() >= ProxyVarsta.varstaMinima) {
            vanzareBilet.vanzare(persoana);
        }
        else {
            System.out.println("Persoana " + persoana.getNume() + " are varsta de " + persoana.getVarsta() + " si nu poate achizitiona biletul.");
        }
    }
}
