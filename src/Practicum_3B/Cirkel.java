package Practicum_3B;

public class Cirkel {
    int radius;
    int xPositie;
    int yPositie;

    Cirkel(int newradius, int newxPositie, int newyPositie) {
        radius = newradius;
        xPositie = newxPositie;
        yPositie = newyPositie;

        if (radius == 0) {
            throw new IllegalArgumentException("Radius moet groter zijn dan 0!");
        }
    }

    public String toString() {
        if (radius == 0) {
            return null;
        } else {
            return "cirkel (" + xPositie + ", " + yPositie + ") met radius: " + radius;
        }
    }
}





