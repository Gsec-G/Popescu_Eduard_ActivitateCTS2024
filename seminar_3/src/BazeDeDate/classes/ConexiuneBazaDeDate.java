package BazeDeDate.classes;

public class ConexiuneBazaDeDate {
    private String numeBaza;
    private int nrTabele;
    private String linkConexiune;
    private static ConexiuneBazaDeDate instanta = null;
    //TINE MINTE SA PUI CONSTRUCTORU PRIVATE!!!!!!!!!!!!!!!!!!!
    private ConexiuneBazaDeDate(String numeBaza, int nrTabele, String linkConexiune) {
        this.numeBaza = numeBaza;
        this.nrTabele = nrTabele;
        this.linkConexiune = linkConexiune;
    }

    @Override
    public String toString() {
        return "ConexiuneBazaDeDate{" +
                "numeBaza='" + numeBaza + '\'' +
                ", nrTabele=" + nrTabele +
                ", linkConexiune='" + linkConexiune + '\'' +
                '}';
    }
//    public String toString1() {
//        return "ConexiuneBazaDeDate{" +
//                "numeBaza='" + instanta.numeBaza + '\'' +
//                ", nrTabele=" + instanta.nrTabele +
//                ", linkConexiune='" + instanta.linkConexiune + '\'' +
//                '}';
//    } nu ebine , ia oricum proprietatile singletonului
    public static synchronized ConexiuneBazaDeDate getInstance(String numeBaza,
                                                               int nrTabele,
                                                               String linkConexiune) {
        if(instanta == null) {
            instanta = new ConexiuneBazaDeDate(numeBaza,nrTabele,linkConexiune);
    }
        return instanta;
    }

    public String getNumeBaza() {
        return numeBaza;
    }

    public void setNumeBaza(String numeBaza) {
        this.numeBaza = numeBaza;
    }

    public int getNrTabele() {
        return nrTabele;
    }

    public void setNrTabele(int nrTabele) {
        this.nrTabele = nrTabele;
    }

    public String getLinkConexiune() {
        return linkConexiune;
    }

    public void setLinkConexiune(String linkConexiune) {
        this.linkConexiune = linkConexiune;
    }
}

