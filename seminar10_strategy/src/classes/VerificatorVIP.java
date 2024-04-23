package classes;

public class VerificatorVIP implements Verificator{
    @Override
    public void verifica(String nume) {
        System.out.println("Este verificat biltul lui " + nume);
    }
}
