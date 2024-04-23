package classes;

public class VerificatorPeluza implements Verificator{
    @Override
    public void verifica(String nume) {
        System.out.println("Este verificat bagajul si hainele lui " + nume);
    }
}
