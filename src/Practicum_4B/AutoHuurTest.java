package Practicum_4B;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutoHuurTest {
    @Test
    void testKlantTienProcentKortingTienProcentMetNaam() {
        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(10.0);
        assertEquals("Mijnheer de Vries (korting: 10.0%)", k.toString());
    }

    @Test
    void testKlantTienProcentKortingTienProcentNaamNull() {
        Klant k = new Klant(null);
        k.setKorting(10.0);
        assertEquals("onbekend (korting: 10.0%)", k.toString());
    }

    @Test
    void testKlantTienProcentKortingTienProcentNaamLeeg() {
        Klant k = new Klant("");
        k.setKorting(10.0);
        assertEquals("onbekend (korting: 10.0%)", k.toString());
    }

    @Test
    void testAutoPrijsPerDagHonderdMetType() {
        Auto a = new Auto("Ferrari", 100);
        assertEquals("Ferrari met prijs per dag: 100.0", a.toString());
    }

    @Test
    void testAutoPrijsPerDagHonderdTypeNull() {
        Auto a = new Auto(null, 100);
        assertEquals("onbekend met prijs per dag: 100.0", a.toString());
    }

    @Test
    void testAutoPrijsPerDagHonderdTypeleeg() {
        Auto a = new Auto("", 100);
        assertEquals("onbekend met prijs per dag: 100.0", a.toString());
    }
}


