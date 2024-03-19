package Main;

import Classes.Reteta;
import Classes.RetetaAbstracta;
import Classes.RetetaCrema;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> solutii = new HashMap<>();
        solutii.put("solutie1", 21.0);
        solutii.put("solutie2", 34.67);
        Reteta prototip = new Reteta(solutii,"Medicament1");

        RetetaAbstracta reteta1 = prototip.clone();
        System.out.println(reteta1.toString());

        RetetaCrema retetaCremaPrototip = new RetetaCrema(35,"Galbenele");
        RetetaAbstracta retetaCrema = retetaCremaPrototip.clone();
        System.out.println(retetaCrema);
    }
}