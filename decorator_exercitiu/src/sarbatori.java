public class sarbatori extends Decorator{
    public sarbatori(factura_interfata facturaInterfata) {
        super(facturaInterfata);
    }

    @Override
    public void felicitare() {
        super.printeaza();
        System.out.println("La multi ani!");
    }

    @Override
    public void discount(double discount) {
        System.out.println("a primit un discount de " + discount);
    }
}
