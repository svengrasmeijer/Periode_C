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

    public Double getBreedte() {
        return breedte;
    }
    public Double getLengte() {
        return lengte;
    }
    public Double getDiepte() {
        return diepte;
    }
    public String toString() {
        return "Dit zwembad is " + breedte + " meter hoog, "  + lengte + " meter lang, en " + diepte + " meter diep";
    }
    public Double inhoud() {
        return (diepte * lengte * breedte);
    }

    public void setBreedte(Double newbreedte) {
        breedte = newbreedte;
    }

    public void setLengte(Double newlengte) {
        lengte = newlengte;
    }

    public void setDiepte(Double newdiepte) {
        diepte = newdiepte;
    }
}

