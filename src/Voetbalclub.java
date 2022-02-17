public class Voetbalclub {
    public int aantalGewonnen;
    public int aantalGelijk;
    public int aantalVerloren;
    public String naam;

    public Voetbalclub(String clubnaam) {
        naam = clubnaam;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }
    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }
    public int aantalPunten() {
        int gewonnenpunten = aantalGewonnen * 3;
        int gelijkpunten = aantalGelijk;
        return gewonnenpunten + gelijkpunten;
    }
}