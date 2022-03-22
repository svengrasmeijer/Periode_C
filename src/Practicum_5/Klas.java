package Practicum_5;
import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> leerlingen = new ArrayList<>();

    Klas(String kC) {
        klasCode = kC;
    }

    public void voegLeerlingToe(Leerling l) {
        leerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer) {
        for (Leerling l : leerlingen) {
            if (l.getNaam().equals(nm)) {
                l.setCijfer(nweCijfer);
            }

        }
    }

    public ArrayList<Leerling> getLeerlingen() {
        return leerlingen;
    }

    public int aantalLeerlingen() {
        int size = getLeerlingen().size();
        return size;
    }

    public String toString() {
        String result = "In klas " + klasCode + " zitten de volgende leerlingen: " + "\n";
        for (Leerling l : leerlingen) {
            result = result + l.toString();
        }
        return result;
    }
}
