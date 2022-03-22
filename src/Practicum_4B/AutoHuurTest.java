package Practicum_4B;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AutoHuurTest {

    @Test
    void testAantalDagenVijf() {
        AutoHuur ah = new AutoHuur();
        ah.setAantalDagen(5);
        assertEquals(5, ah.getAantalDagen());
    }

    @Test
    void testGehuurdeAutoFerrari() {
        AutoHuur ah = new AutoHuur();
        Auto a = new Auto("Ferrari", 100);
        ah.setGehuurdeAuto(a);
        assertEquals("Ferrari met prijs per dag: 100.0", ah.getGehuurdeAuto().toString());
    }

    @Test
    void testGehuurdeAutoLeeg() {
        AutoHuur ah = new AutoHuur();
        Auto a = new Auto("", 100);
        ah.setGehuurdeAuto(a);
        assertEquals("onbekend met prijs per dag: 100.0", ah.getGehuurdeAuto().toString());
    }

    @Test
    void testGehuurdeAutoNull() {
        AutoHuur ah = new AutoHuur();
        Auto a = new Auto(null, 100);
        ah.setGehuurdeAuto(a);
        assertEquals("onbekend met prijs per dag: 100.0", ah.getGehuurdeAuto().toString());
    }

    @Test
    void testTotaalPrijsAantalDagenNul() {
        AutoHuur ah = new AutoHuur();
        Auto a = new Auto("Ferrari", 100);
        Klant k = new Klant("Meneer de Vries");
        ah.setGehuurdeAuto(a);
        ah.setAantalDagen(0);
        ah.setHuurder(k);
        assertEquals(0, ah.totaalPrijs());
    }

    @Test
    void testTotaalPrijsHuurderNull() {
        AutoHuur ah = new AutoHuur();
        Auto a = new Auto("Ferrari", 100);
        ah.setHuurder(null);
        ah.setGehuurdeAuto(a);
        ah.setAantalDagen(5);
        assertEquals(0, ah.totaalPrijs());
    }

    @Test
    void testTotaalPrijsAutoNietIngevuld() {
        AutoHuur ah = new AutoHuur();
        ah.setHuurder(null);
        ah.setAantalDagen(5);
        assertEquals(0, ah.totaalPrijs());
    }

    @Test
    void testTotaalPrijsHonderdEuroVoorVijfDagen() {
        AutoHuur ah = new AutoHuur();
        Auto a = new Auto("Ferrari", 100);
        Klant k = new Klant("Meneer de Vries");
        ah.setHuurder(k);
        ah.setGehuurdeAuto(a);
        ah.setAantalDagen(5);
        assertEquals(500, ah.totaalPrijs());
    }

    @Test
    void testToStringAllesIngevuld() {
        AutoHuur ah = new AutoHuur();
        Auto a = new Auto("Ferrari", 100);
        Klant k = new Klant("Meneer de Vries");
        ah.setHuurder(k);
        k.setKorting(10.0);
        ah.setGehuurdeAuto(a);
        ah.setAantalDagen(5);
        assertEquals("Autotype: Ferrari met prijs per dag: 100.0\n" +
                "op naam van Meneer de Vries (korting: 10.0%)\n" +
                "aantal dagen: 5 en dat kost 450.0", ah.toString());
    }

    @Test
    void testToStringHuurderNull() {
        AutoHuur ah = new AutoHuur();
        Auto a = new Auto("Ferrari", 100);
        ah.setHuurder(null);
        ah.setGehuurdeAuto(a);
        ah.setAantalDagen(5);
        assertEquals("Autotype: Ferrari met prijs per dag: 100.0\n" +
                "geen huurder bekend\n" +
                "aantal dagen: 5 en dat kost 0.0", ah.toString());
    }
    @Test
    void testToStringGehuurdeAutoNullEnHuurderNull() {
        AutoHuur ah = new AutoHuur();
        ah.setHuurder(null);
        ah.setGehuurdeAuto(null);
        ah.setAantalDagen(5);
        assertEquals("Autotype: er is geen auto bekend\n" +
                "geen huurder bekend\n" +
                "aantal dagen: 5 en dat kost 0.0", ah.toString());
    }
    @Test
    void testToStringGehuurdeAutoNull() {
        AutoHuur ah = new AutoHuur();
        Klant k = new Klant("Meneer de Vries");
        ah.setHuurder(k);
        k.setKorting(10.0);
        ah.setGehuurdeAuto(null);
        ah.setAantalDagen(5);
        assertEquals("Autotype: er is geen auto bekend\n" +
                "op naam van Meneer de Vries (korting: 10.0%)\n" +
                "aantal dagen: 5 en dat kost 0.0", ah.toString());
    }
}

