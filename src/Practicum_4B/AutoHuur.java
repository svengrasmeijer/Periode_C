package Practicum_4B;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    AutoHuur() {

    }

    public void setAantalDagen(int aD) {
        aantalDagen = aD;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA) {
        gehuurdeAuto = gA;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k) {
        huurder = k;
    }

    public double totaalPrijs() {
        if (gehuurdeAuto == null) {
            return 0;
        }
        else if (huurder == null) {
            return 0;
        }
        else if (aantalDagen == 0) {
            return 0;
        }
        else {
            double prijs = getAantalDagen() * gehuurdeAuto.getPrijsPerDag();
            return prijs * huurder.getKorting();
        }
    }

    public String toString() {
        if (gehuurdeAuto == null && huurder == null) {
            return "Autotype: er is geen auto bekend" + "\ngeen huurder bekend " + "\naantal dagen: " + aantalDagen + " en dat kost 0.0";
        }
        if (huurder == null) {
            return "Autotype: " + gehuurdeAuto + "\ngeen huurder bekend " +  "\naantal dagen: " + aantalDagen + " en dat kost 0.0";
        }
        if (gehuurdeAuto == null) {
            return "Autotype: er is geen auto bekend" + "\nop naam van " + huurder + "\naantal dagen: " + aantalDagen + " en dat kost 0.0";
        }
        else {
            return "Autotype: " + gehuurdeAuto.toString() + "\nop naam van " + huurder + "\naantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
        }
    }
}
