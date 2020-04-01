package klausurvorbereitung.aufgabe4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IBANTest {
    IBAN iban = new IBAN();

    @Test
    void testIbanCheckValidIBAN() {
        try {
            assertTrue(iban.ibanCheck("DE23356597651235456987"));
        } catch (FalscheIBANException e) {
            fail("Unerwartete Exception " + e.getMessage());
        }
    }

    @Test
    void testIbanCheckThrowsException() {
        assertThrows(FalscheIBANException.class, () -> iban.ibanCheck("DE343242"));
        assertThrows(FalscheIBANException.class, () -> iban.ibanCheck("FR23356597651235456987"));
    }
}