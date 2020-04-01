package ueb17;

import static org.junit.jupiter.api.Assertions.*;
import java.net.URL;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import ueb17.aufgabe3.Browser;

class BrowserTest {
    
    //Bei jedem Test würde eine neue URL von der back-Methode erstellt, deswegen nur ein Test möglich!?
    @Test
    public void testIfValueIsPresent_ThenCorrect() {
        Browser browser = new Browser();
        Optional<URL> url = browser.back();
        assertTrue(url.isPresent());
    }
     
}
