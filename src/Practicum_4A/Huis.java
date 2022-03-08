package Practicum_4A;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;


    Huis(String adr, int bwjr) {
        adres = adr;
        bouwjaar = bwjr;
    }

    public void setHuisbaas(Persoon hb) {
         huisbaas = hb;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }

    public String toString() {
        if (huisbaas == null) {
            return "Practicum_4A.Huis " + adres + " is gebouwd in " + bouwjaar + "\nen heeft huisbaas geen huisbaas";
        }
        else {
            return "Practicum_4A.Huis " + adres + " is gebouwd in " + bouwjaar + "\nen heeft huisbaas: " + huisbaas;
        }
    }
}
