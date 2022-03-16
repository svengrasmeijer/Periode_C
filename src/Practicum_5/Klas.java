package Practicum_5;
import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private Leerling leerling;
    private String naam;
    private double cijfer;

    Klas(String kC) {
        klasCode = kC;
    }

    public void voegLeerlingToe(Leerling l) {
        leerling = l;
    }

    public void wijzigCijfer(String nm, double nweCijfer) {
        naam = nm;
        cijfer = nweCijfer;

    }

    public ArrayList<Leerling> getLeerlingen() {
        getLeerlingen().add(leerling);
        return getLeerlingen();

    }

    public int aantalLeerlingen() {
        return 0;
    }

    public String toString() {
        return null;
    }
}
