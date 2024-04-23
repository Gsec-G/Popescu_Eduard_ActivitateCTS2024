package clase;

public class Caracteristici {
    private int pozitieX;
    private int pozitieY;
    private String culoareTricou;

    public Caracteristici(int pozitieX, int pozitieY, String culoareTricou) {
        this.pozitieX = pozitieX;
        this.pozitieY = pozitieY;
        this.culoareTricou = culoareTricou;
    }

    public int getPozitieX() {
        return pozitieX;
    }

    public void setPozitieX(int pozitieX) {
        this.pozitieX = pozitieX;
    }

    public int getPozitieY() {
        return pozitieY;
    }

    public void setPozitieY(int pozitieY) {
        this.pozitieY = pozitieY;
    }

    public String getCuloareTricou() {
        return culoareTricou;
    }

    public void setCuloareTricou(String culoareTricou) {
        this.culoareTricou = culoareTricou;
    }

    @Override
    public String toString() {
        return "Caracteristici{" +
                "pozitieX=" + pozitieX +
                ", pozitieY=" + pozitieY +
                ", culoareTricou='" + culoareTricou + '\'' +
                '}';
    }
}
