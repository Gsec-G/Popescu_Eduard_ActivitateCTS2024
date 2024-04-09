package Main;

import classes.Departament;
import classes.Sectie;
import classes.StructuraAbstracta;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta cardiologie = new Departament("Cardiologie", "Gigel");
        StructuraAbstracta oftalmologie = new Departament("Oftalmologie", "Vasile");

        StructuraAbstracta terapieIntensiva = new Sectie("Terapie intensiva", 15 , "Ion");
        StructuraAbstracta donare = new Sectie("Donare de sange", 5, "Gogu");
        StructuraAbstracta chirurgieOftalmologie = new Sectie("Chirurgie oftalmologica", 2 , "Ionut");

        StructuraAbstracta spital = new Departament("Spitalul Universitar" , "Banu");

        cardiologie.adaugaStructura(terapieIntensiva);
        cardiologie.adaugaStructura(donare);
        oftalmologie.adaugaStructura(chirurgieOftalmologie);
        spital.adaugaStructura(oftalmologie);
        spital.adaugaStructura(cardiologie);

        spital.afiseazaDescriere("  ");
    }
}