package ueb14.aufgabe1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SchachTest {
    //Test Tum, Läufer fehlt weil diese als Grundlage von Dame gelten
    //assertArrayEquals, boolean[][] neubrett = new boolean {true, false, f,f,ftrue}, 8x
    @Test
    public void testDameHorizontalVertikalPosition() {
        Dame dame = new Dame(4, 5);
        Brett kombiniertesBrett = dame.gibErlaubteFelder();

        //Maximale Horizontale-Position
        assertTrue(kombiniertesBrett.gibFeld(1, 4));
        assertTrue(kombiniertesBrett.gibFeld(8, 4));

        //Maximale Vertikale-Position
        assertTrue(kombiniertesBrett.gibFeld(4, 1));
        assertTrue(kombiniertesBrett.gibFeld(4, 8));
    }

    @Test
    public void testDameDiagonalPosition() {
        Dame dame = new Dame(4, 5);
        Brett kombiniertesBrett = dame.gibErlaubteFelder();

        //Maximale Diagonal-Position
        assertTrue(kombiniertesBrett.gibFeld(8, 1));
        assertTrue(kombiniertesBrett.gibFeld(1, 8));
        assertTrue(kombiniertesBrett.gibFeld(1, 2));
        assertTrue(kombiniertesBrett.gibFeld(7, 8));
    }

    @Test
    public void testDameInvalidPosition() {
        Dame dame = new Dame(4, 5);
        Brett kombiniertesBrett = dame.gibErlaubteFelder();

        assertFalse(kombiniertesBrett.gibFeld(1, 1));
        assertFalse(kombiniertesBrett.gibFeld(8, 8));
    }
}
