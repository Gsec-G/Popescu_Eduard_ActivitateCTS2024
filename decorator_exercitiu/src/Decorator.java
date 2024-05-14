public abstract class Decorator implements factura_interfata{
    private factura_interfata facturaInterfata;

    public Decorator(factura_interfata facturaInterfata) {
        this.facturaInterfata = facturaInterfata;
    }

    @Override
    public void printeaza() {
        this.facturaInterfata.printeaza();
    }
    public abstract void felicitare();
    public abstract void discount(double discount);
}
