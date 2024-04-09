package Decorator;

import Spital.DiagnosticAbstract;

public abstract class Decorator implements DiagnosticAbstract{
    private DiagnosticAbstract diagnosticAbstract;

    public Decorator(DiagnosticAbstract diagnosticAbstract) {
        this.diagnosticAbstract = diagnosticAbstract;
    }

    @Override
    public void printeazaDiagnostic() {
        this.diagnosticAbstract.printeazaDiagnostic();
        System.out.println("Puteti vedea diagnosticul si pe platforma.");
    }

    @Override
    public String getSimptome() {
        return this.diagnosticAbstract.getSimptome();
    }

    @Override
    public boolean isNecesitaSpitalizare() {
        return this.diagnosticAbstract.isNecesitaSpitalizare();
    }

    @Override
    public String getNumeDiagnostic() {
        return this.diagnosticAbstract.getNumeDiagnostic();
    }
    public abstract void afisareOnline();
}
