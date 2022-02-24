public class Auto {
    private final String type;
    private final double prijsPerDag;

    Auto(String tp, double prPd) {
        type = tp;
        prijsPerDag = prPd;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public String toString() {
        return type + " met prijs per dag: " + prijsPerDag;
    }
}
