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
        boolean gelijkeObjecten = false;

        if (andereObject instanceof Game) {
            Game andereGame = (Game) andereObject;

            if (this.naam.equals(andereGame.naam) &&
                    this.releasejaar == andereGame.releasejaar &&
                    this.nieuwprijs == andereGame.nieuwprijs) {

                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    public String  toString() {
        return null;
    }
}
