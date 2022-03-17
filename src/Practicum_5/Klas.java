package Practicum_5;
import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> leerlingen = new ArrayList<>();
    private Leerling leerling;

    Klas(String kC) {
        klasCode = kC;
    }

    public void voegLeerlingToe(Leerling l) {
        leerling = l;
        leerlingen.add(leerling);
    }

    public void wijzigCijfer(String nm, double nweCijfer) {
        leerling.setCijfer(nweCijfer);
    }

    public ArrayList<Leerling> getLeerlingen() {
        return leerlingen;
    }

    public int aantalLeerlingen() {
        int size = getLeerlingen().size();
        return size;
    }

    public String toString() {
        return "In klas " + klasCode + " zitten de volgende leerlingen: " + leerlingen + "\n";
    }
}
