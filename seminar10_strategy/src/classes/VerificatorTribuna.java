package classes;

public class VerificatorTribuna implements Verificator{
    @Override
    public void verifica(String nume) {
        System.out.println("Este verificat bagajul lui " + nume);
    }
}
