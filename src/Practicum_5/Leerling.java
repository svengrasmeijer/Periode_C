package Practicum_5;

public class Leerling {
    private final String naam;
    private double cijfer;

    Leerling(String nm) {
        naam = nm;
    }

    public String getNaam() {
        return naam;
    }

    public void setCijfer(double c) {
        cijfer = c;
    }

    public double getCijfer() {
        return cijfer;
    }

    public String toString() {
        return "\n" + getNaam() + " heeft cijfer: " + getCijfer();
    }
}
