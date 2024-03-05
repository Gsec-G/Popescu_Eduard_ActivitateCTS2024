package SustinereExamen.main;

import SustinereExamen.classes.Student;
import SustinereExamen.classes.SustinereExamen;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(123,"Popescu Ion","blabla1@gmail.com",3);
        Student student2 = new Student(143,"Popescu John","blabla2@gmail.com",3);
        Student student3 = new Student(153,"Popescu Vasile","blabla3@gmail.com",3);
        Student student4 = new Student(127,"Popescu Lol","blabla4@gmail.com",3);

        SustinereExamen poo = new SustinereExamen("Programare Orientata Obiect");
        SustinereExamen cts = new SustinereExamen("Calitate si Testare Software");

        poo.inregistrareStudent(student1);
        poo.inregistrareStudent(student2);
        poo.inregistrareStudent(student1);
        poo.inregistrareStudent(student3);
        poo.inregistrareStudent(student4);
        poo.inregistrareStudent(student2);
    }
}
