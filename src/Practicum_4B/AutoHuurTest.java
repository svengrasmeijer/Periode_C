package Practicum_4B;

import org.junit.jupiter.api.Test;

public class AutoHuurTest {
    @Test
    void Test() {
        AutoHuur ah1 = new AutoHuur();
        Klant k1 = new Klant("Mijnheer de Vries");
        Auto a1 = new Auto("Peugeot 207", 50);

        k1.setKorting(10.0);
        ah1.setHuurder(k1);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);

        AutoHuur ah2 = new AutoHuur();
        Klant k2 = new Klant("");
        Auto a2 = new Auto(null, 3500);

        k1.setKorting(25.0);
        ah2.setHuurder(k2);
        ah2.setGehuurdeAuto(a2);
        ah2.setAantalDagen(1);

        System.out.println("Eerste autohuur:\n" + ah1 + "\n");
        System.out.println("Tweede autohuur:\n" + ah2 + "\n");

        System.out.println("Gehuurd: " + ah1.getGehuurdeAuto());
        System.out.println("Gehuurd: " + ah2.getGehuurdeAuto());
    }
}

