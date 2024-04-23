package Main;

import Decorator.Decorator;
import Spital.Diagnostic;
import Spital.DiagnosticAbstract;
import Decorator.WebSite;
import Decorator.AplicatieMobila;

public class Main {
    public static void main(String[] args) {
        DiagnosticAbstract tuberculoza = new Diagnostic("tuberculoza", true, "tuse cronica");
        //tuberculoza.printeazaDiagnostic();
        DiagnosticAbstract raceala = new Diagnostic("raceala comuna", false, "rosu in gat");
        //raceala.printeazaDiagnostic();

        Decorator aplicatieMobila = new AplicatieMobila(tuberculoza);
        aplicatieMobila.afisareOnline();
        Decorator website = new WebSite(raceala);
        website.afisareOnline();

    }
}