package ueb13.aufgabe4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleChangeCalculatorEnhancedTest {

    @Test
    void testChangeCoins() {
        int[] arrayExpected = {1,0,1,0,1,0,0,1};
        SimpleChangeCalculatorEnhanced s = new SimpleChangeCalculatorEnhanced();
        int[] arrayActual = s.getChange(2,26);

        assertArrayEquals(arrayExpected, arrayActual);
    }
}