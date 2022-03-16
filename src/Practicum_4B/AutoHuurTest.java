package Practicum_4B;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AutoHuurTest {

    @Test
    void testAantalDagen() {
        AutoHuur ah = new AutoHuur();
        ah.setAantalDagen(5);
        assertEquals(5, ah.getAantalDagen());
    }
}


