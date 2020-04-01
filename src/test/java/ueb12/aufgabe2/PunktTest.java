package ueb12.aufgabe2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PunktTest {

    private Punkt p;
    private Throwable t;

    @BeforeEach
    public void init() {
        p = new Punkt();

    }

    @Test
    public void testInRange() {
        try {
            p.verschiebePunkt(650,650);
        } catch(RuntimeException e) {
            fail("Unexpected RuntimeException: " + e.getMessage());
        }
    }

    @Test
    public void testInRange2() {

        assertDoesNotThrow(() -> p.verschiebePunkt(650,650), "Unexpected Exception");
    }

    @Test
    public void testXNegative() {
        try {
            p.verschiebePunkt(-1, 650);
            fail("Erwarte Exception");
        } catch(RuntimeException e) {
            assertEquals("Negative Koordinate", e.getMessage());
        }
    }
    @Test
    public void testXNegative2() {
        t = assertThrows(RuntimeException.class, () -> p.verschiebePunkt(-1,1080));
        assertEquals("Negative Koordinate", t.getMessage());
    }

    @Test
    public void testYNegative() {
        try {
            p.verschiebePunkt(650, -1);
            fail("Erwarte Exception");
        } catch(RuntimeException e) {
            assertEquals("Negative Koordinate", e.getMessage());
        }
    }

    @Test
    public void testYNegative2() {
        t = assertThrows(RuntimeException.class, () -> p.verschiebePunkt(650, -1));
        assertEquals("Negative Koordinate", t.getMessage());
    }

    @Test
    public void testXOutOfRange() {
        try {
            p.verschiebePunkt(1921, 1080);
            fail("Erwarte Exception");
        } catch(RuntimeException e) {
            assertEquals("Ungültige Koordinate", e.getMessage());
        }
    }

    @Test
    public void testXOutOfRange2() {
        t = assertThrows(RuntimeException.class, () -> p.verschiebePunkt(1921, 1080));
        assertEquals("Ungültige Koordinate", t.getMessage());
    }

    @Test
    public void testYOutOfRange() {
        try {
            p.verschiebePunkt(1920, 1081);
            fail("Erwarte Exception");
        } catch(RuntimeException e) {
            assertEquals("Ungültige Koordinate", e.getMessage());
        }
    }

    @Test
    public void testYOutOfRange2() {
        t = assertThrows(RuntimeException.class, () -> p.verschiebePunkt(1920, 1081));
        assertEquals("Ungültige Koordinate", t.getMessage());
    }

}
