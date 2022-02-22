public class Cirkel {
    int radius;
    int xPositie;
    int yPositie;

    Cirkel(int newradius, int newxPositie, int newyPositie) {
        radius = newradius;
        xPositie = newxPositie;
        yPositie = newyPositie;
    }

    public String toString() {
        if (radius == 0) {
            return null;
        } else {
            return "Radius moet groter zijn dan 0! \ncirkel (" + xPositie + ", " + yPositie + ") met radius: " + radius;
        }
    }
}





