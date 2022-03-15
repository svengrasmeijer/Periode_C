package Practicum_3A;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VoetbalclubTest {

    @Test
    void naamisAjaxTest() {
        Voetbalclub test1 = new Voetbalclub("Ajax");
        assertEquals("Ajax", test1.getNaam());
    }
    @Test
    void naamisleegTest() {
        Voetbalclub test2 = new Voetbalclub("");
        assertEquals("FC", test2.getNaam());
    }
    @Test
    void naamisnullTest() {
        Voetbalclub test3 = new Voetbalclub(null);
        assertEquals("FC", test3.getNaam());
    }
    @Test
    void winstpuntenTest() {
        Voetbalclub test4 = new Voetbalclub(null);
        test4.verwerkResultaat('w');
        assertEquals(3, test4.aantalPunten());
    }
    @Test
    void verliespuntenTest() {
        Voetbalclub test5 = new Voetbalclub(null);
        test5.verwerkResultaat('v');
        assertEquals(0, test5.aantalPunten());
    }
    @Test
    void gelijkpuntenTest() {
        Voetbalclub test6 = new Voetbalclub(null);
        test6.verwerkResultaat('g');
        assertEquals(1, test6.aantalPunten());
    }
    @Test
    void wedstrijdengespeeldTest() {
        Voetbalclub test7 = new Voetbalclub(null);
        test7.verwerkResultaat('w');
        assertEquals(1, test7.aantalGespeeld());
    }
    @Test
    void punten3xWinstTest() {
        Voetbalclub test8 = new Voetbalclub(null);
        test8.verwerkResultaat('w');
        test8.verwerkResultaat('w');
        test8.verwerkResultaat('w');
        assertEquals(9,test8.aantalPunten());
    }
    @Test
    void punten5xVerliesTest() {
        Voetbalclub test9 = new Voetbalclub(null);
        test9.verwerkResultaat('v');
        test9.verwerkResultaat('v');
        test9.verwerkResultaat('v');
        test9.verwerkResultaat('v');
        test9.verwerkResultaat('v');
        assertEquals(0,test9.aantalPunten());
    }
    @Test
    void punten3xGelijkTest() {
        Voetbalclub test10 = new Voetbalclub(null);
        test10.verwerkResultaat('g');
        test10.verwerkResultaat('g');
        test10.verwerkResultaat('g');
        assertEquals(3,test10.aantalPunten());
    }
    @Test
    void toStringTest() {
        Voetbalclub test11 = new Voetbalclub(null);
        test11.verwerkResultaat('w');
        assertEquals("FC Gespeeld: 1 Gewonnen: 1 Gelijk: 0 Verloren: 0 Punten: 3", test11.toString());

    }
}
