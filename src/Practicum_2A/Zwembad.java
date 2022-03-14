package Practicum_2A;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    Zwembad() {}

    Zwembad(double newbreedte, double newlengte, double newdiepte) {
        breedte = newbreedte;
        lengte = newlengte;
        diepte = newdiepte;
    }

    public double getBreedte() {
        return breedte;
    }
    public double getLengte() {
        return lengte;
    }
    public double getDiepte() {
        return diepte;
    }
    public String toString() {
        return "Dit zwembad is " + breedte + " meter hoog, "  + lengte + " meter lang, en " + diepte + " meter diep";
    }
    public double inhoud() {
        return (diepte * lengte * breedte);
    }

    public void setBreedte(double newbreedte) {
        breedte = newbreedte;
    }

    public void setLengte(double newlengte) {
        lengte = newlengte;
    }

    public void setDiepte(double newdiepte) {
        diepte = newdiepte;
    }
}

