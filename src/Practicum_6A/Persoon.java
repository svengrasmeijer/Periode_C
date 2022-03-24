package Practicum_6A;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> games = new ArrayList<>();

    Persoon(String nm, double bud) {
        naam = nm;
        budget = bud;
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {

        return true;
    }

    public boolean verkoop(Game g, Persoon koper) {
        return true;
    }

    public String toString() {
        return "" + games;
    }
}
