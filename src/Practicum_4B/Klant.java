package Practicum_4B;

public class Klant {
    private final String naam;
    private double kortingsPercentage;

    Klant(String nm) {
        naam = nm;
    }

    public void setKorting(double kP) {
        kortingsPercentage = kP;
    }

    public double getKorting() {
        return ((100 - kortingsPercentage) / 100);
    }

    public String toString() {
        if (naam == null) {
            return "onbekend (korting: " + kortingsPercentage + "%)";
        }
        if (naam.equals("")) {
            return "onbekend (korting: " + kortingsPercentage + "%)";
        }
        else {
            return naam + " (korting: " + kortingsPercentage + "%)";
        }
    }
}
