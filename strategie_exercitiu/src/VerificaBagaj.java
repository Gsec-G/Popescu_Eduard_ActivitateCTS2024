public class VerificaBagaj implements Verificator{
    @Override
    public void verifica(String nume) {
        System.out.println("A fost verificat bagajul lui " + nume);
    }
}
