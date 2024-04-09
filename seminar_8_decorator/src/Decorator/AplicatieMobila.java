package Decorator;

import Spital.DiagnosticAbstract;

public class AplicatieMobila extends Decorator {
    public AplicatieMobila(DiagnosticAbstract diagnosticAbstract) {
        super(diagnosticAbstract);
    }

    @Override
    public void afisareOnline() {
        System.out.println("In cadrul aplicatiei mobile ati primit diagnosticul" + super.getNumeDiagnostic() +
                " si simptomele: " + super.getSimptome() + "si necesita spitalizare: " + super.isNecesitaSpitalizare());
    }
}
