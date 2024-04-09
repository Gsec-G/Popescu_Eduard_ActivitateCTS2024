package Decorator;

import Spital.DiagnosticAbstract;

public class WebSite extends Decorator {
    public WebSite(DiagnosticAbstract diagnosticAbstract) {
        super(diagnosticAbstract);
    }
    @Override
    public void afisareOnline() {
        System.out.println("In cadrul website-ului ati primit diagnosticul" + super.getNumeDiagnostic() +
                " si simptomele: " + super.getSimptome() + "si necesita spitalizare: " + super.isNecesitaSpitalizare());

    }
}
