package Practicum_6A;

public class Game {
    private String naam;
    private int releasejaar;
    private double nieuwprijs;

    Game(String nm, int rJ, double nwpr) {
        naam = nm;
        releasejaar = rJ;
        nieuwprijs = nwpr;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde() {
        return 0;
    }

    public boolean equals(Object andereObject) {
        return true;
    }

    public String  toString() {
        return null;
    }
}
