public class Main {
    public static void main(String[] args) {
        factura_interfata facturaInterfata = new factura("24","Andrei");
        Decorator factura = new sarbatori(facturaInterfata);
        factura.felicitare();
        factura.discount(0.3);
    }
}