public class factura implements factura_interfata {
    String id;
    String nume;

    public factura(String id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    @Override
    public void printeaza() {
        System.out.println("Factura cu id "+ this.id + " si numele " + this.nume);
    }
}
