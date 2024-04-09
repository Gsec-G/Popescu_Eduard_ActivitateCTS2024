package Spital;

public class Diagnostic implements DiagnosticAbstract {
    private String numeDiagnostic;
    private boolean necesitaSpitalizare;
    private String simptome;

    public Diagnostic(String numeDiagnostic, boolean necesitaSpitalizare, String simptome) {
        this.numeDiagnostic = numeDiagnostic;
        this.necesitaSpitalizare = necesitaSpitalizare;
        this.simptome = simptome;
    }

    @Override
    public void printeazaDiagnostic() {
        System.out.println("Numele diagnosticului: " + this.numeDiagnostic +
                ", are simptomele: " + this.simptome + " si" +
                (this.necesitaSpitalizare ? "" : " nu") + " necesita spitalizare." );
    }

    @Override
    public String getSimptome() {
        return this.simptome;
    }

    @Override
    public boolean isNecesitaSpitalizare() {
        return this.necesitaSpitalizare;
    }

    @Override
    public String getNumeDiagnostic() {
        return this.numeDiagnostic;
    }
}
