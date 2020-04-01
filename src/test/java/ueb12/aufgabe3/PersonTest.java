package ueb12.aufgabe3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

    private Person p;
    private Adresse a;

    @Test
    public void testValidPerson() {
        assertDoesNotThrow(() -> a = new Adresse("Musterstr", "1", 97241, "Musterort"));
        assertDoesNotThrow(() -> p = new Person("Max", "Mustermann", a));
    }

    @Test
    public void testInvalidVorname() {
        Throwable t = assertThrows(RuntimeException.class, () -> p = new Person("max", "Mustermann", a));
        assertEquals("Ungueltiger Vorname", t.getMessage());
    }

    @Test
    public void testInvalidStrasse() {
        Throwable t = assertThrows(RuntimeException.class, () -> a = new Adresse("musterstr", "1", 97241, "Musterort"));
        assertEquals("Ungueltige Strasse", t.getMessage());
    }

    @Test
    public void testInvalidOrt() {
        Throwable t = assertThrows(RuntimeException.class, () -> a = new Adresse("Musterstr", "1", 97241, "musterort"));
        assertEquals("Ungueltiger Ort", t.getMessage());
    }

    @Test
    public void testInvalidHausnr() {
        Throwable t = assertThrows(RuntimeException.class, () -> a = new Adresse("Musterstr", "a1", 97241, "Musterort"));
        assertEquals("Ungueltige Hausnr", t.getMessage());
    }
}
