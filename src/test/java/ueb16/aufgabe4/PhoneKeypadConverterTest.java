package ueb16.aufgabe4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import myExceptions.IllegalPhoneNumberException;
import static org.junit.jupiter.api.Assertions.*;

class PhoneKeypadConverterTest {

    PhoneKeypadConverter sms;

    @BeforeEach
    public void setUp() {
        sms = new PhoneKeypadConverter();
    }

    @Test
    void testIllegalPhoneNumberExceptionThrown() {
        Throwable t = assertThrows(IllegalPhoneNumberException.class, () -> sms.convert("WÜRZBURG"));
        assertEquals("Invalid Phone Number!", t.getMessage());
    }

    @Test
    void testCorrectConvertion() {
        try {
            assertEquals("325858238349", sms.convert("FAKULTAETFIW"));
        } catch (IllegalPhoneNumberException e) {
            e.printStackTrace();
        }

    }
}
