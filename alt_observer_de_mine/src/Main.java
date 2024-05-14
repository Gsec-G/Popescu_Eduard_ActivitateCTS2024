public class Main {
    public static void main(String[] args) {
        observer abonat1 = new abonat("Andrei");
        observer abonat2 = new abonat("Ion");

        subject articol_istorie = new articol_istorie();
        articol_istorie.adaugaAbonat(abonat1);
        articol_istorie.adaugaAbonat(abonat2);
        articol_istorie.notifica_istorie();
    }
}