package Practicum_4B;

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
        if (type == null) {
            return  "onbekend met prijs per dag: " + prijsPerDag;
        }
        if (type.equals("")) {
            return  "onbekend met prijs per dag: " + prijsPerDag;
        }
        else {
            return type + " met prijs per dag: " + prijsPerDag;
        }
    }
}
