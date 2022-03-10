package Practicum_3A;

import org.junit.jupiter.api.Test;

public class VoetbalclubTest {
    @Test
    void Test() {
        Voetbalclub A = new Voetbalclub("Ajax      ");
        Voetbalclub B = new Voetbalclub("Feijenoord");
        Voetbalclub C = new Voetbalclub("");
        Voetbalclub D = new Voetbalclub("PSV       ");
        Voetbalclub E = new Voetbalclub(null);

        A.verwerkResultaat('w');
        A.verwerkResultaat('w');
        A.verwerkResultaat('w');
        B.verwerkResultaat('g');
        B.verwerkResultaat('w');
        B.verwerkResultaat('v');
        B.verwerkResultaat('g');
        C.verwerkResultaat('g');
        C.verwerkResultaat('g');
        C.verwerkResultaat('w');
        D.verwerkResultaat('v');
        D.verwerkResultaat('w');
        D.verwerkResultaat('w');
        E.verwerkResultaat('g');
        E.verwerkResultaat('v');

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
    }
}
