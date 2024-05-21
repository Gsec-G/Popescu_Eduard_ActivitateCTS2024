package clase;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersoanaTest {
    @org.junit.Test
    public void getSexReturnF() {
        Persoana pers1 = new Persoana("Simona", "6151412414124");
        assertEquals(pers1.getSex(), "F");
    }
    @org.junit.Test
    public void getSexReturnM() {
        Persoana pers2 = new Persoana("Andrei", "5151412414124");
        assertEquals(pers2.getSex(), "M");
    }
    @org.junit.Test
    public void getSexReturnIntervalInferior() {
        Persoana pers2 = new Persoana("Andrei", "1151412414126");
        assertEquals(pers2.getSex(), "M");
    }
    @org.junit.Test
    public void getSexReturnIntervalSuperior() {
        Persoana pers1 = new Persoana("Simona", "6151412414124");
        assertEquals(pers1.getSex(), "F");
    }
    @org.junit.Test
    public void getSexParitate() {
        String cnp = "1151412414126";
        Persoana pers2 = new Persoana("Andrei", cnp);
        String sex = "M";
        if(Integer.parseInt(String.valueOf(cnp.charAt(0))) % 2 == 0) {
            sex = "F";
        }
        assertEquals(pers2.getSex(), sex);
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexErrorCNPStartWithNumberOutsideCases() {
        Persoana pers1 = new Persoana("Simona", "9151412414124");
        pers1.getSex();
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexErrorCNPStartWithInvalidCharacter() {
        Persoana pers1 = new Persoana("Simona", "-0151412414124");
        pers1.getSex();
    }
    @org.junit.Test(expected = NullPointerException.class)
    public void getSexErrorCNPisNull() {
        Persoana pers1 = new Persoana("Simona", "");
        pers1.getSex();
    }
    @org.junit.Test(timeout = 200)
    public void getSexPerformance() {
        Persoana pers1 = new Persoana("Simona", "5151412414124");
        pers1.getSex();
    }
    @org.junit.Test
    public void getSexCorrect() {
        Persoana pers1 = new Persoana("Simona", "5151412414124");
        assertEquals(1,pers1.getSex().length());
    }
    @org.junit.Test
    public void getSexCorrectByLetter() {
        Persoana pers1 = new Persoana("Simona", "5151412414124");
        boolean isCorrect = pers1.getSex().toLowerCase().equals("m");
        assertTrue(isCorrect);
    }
    @org.junit.Test
    public void getSexOrder() {
        Persoana persoana1 = new Persoana("Simona", "6020123145123");
        Persoana persoana2 = new Persoana("Simon", "5020123145123");

        assertTrue(persoana2.getSex().compareTo(persoana1.getSex()) > 0);
    }
    @org.junit.Test
    public void getSexRange() {
        Persoana persoana1 = new Persoana("Simona", "8020123145123");
        assertEquals(persoana1.getSex(), "F");
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexCardinality() {
        Persoana persoana1 = new Persoana("Simona", "0020123145123");
        persoana1.getSex();
    }

}