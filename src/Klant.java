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
        return naam + " (korting: " + kortingsPercentage + "%)";
    }
}
