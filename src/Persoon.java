public class Persoon {
    private String naam;
    private int leeftijd;

    Persoon(String nm, int lft) {
        naam = nm;
        leeftijd = lft;
    }

    public String toString() {
        return naam + "; leeftijd " + leeftijd + " jaar";
    }
}
