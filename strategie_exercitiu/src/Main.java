public class Main {
    public static void main(String[] args) {
        Verificator verificator = new VerificaBagaj();
        Portar portar = new Portar(verificator);
        portar.verificaBilet("Andrei");
    }
}