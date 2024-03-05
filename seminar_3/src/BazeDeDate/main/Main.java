package BazeDeDate.main;

import BazeDeDate.classes.ConexiuneBazaDeDate;

public class Main {
    public static void main(String[] args) {
        ConexiuneBazaDeDate conexiune1 = ConexiuneBazaDeDate.getInstance("Baza1", 20,"Link");
        ConexiuneBazaDeDate conexiune2 = ConexiuneBazaDeDate.getInstance("Baza1", 20,"Link");

        System.out.println(conexiune1);
        System.out.println(conexiune2);

        conexiune2.setNrTabele(15);
        System.out.println(conexiune1);
    }
}