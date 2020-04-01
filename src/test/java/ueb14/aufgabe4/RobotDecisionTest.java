package ueb14.aufgabe4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RobotDecisionTest {
    @Test
    public void testRobotDecision() {
        Robot r = new Robot();
        assertEquals(Decision.LINKS, r.entscheide(Threat.GEFAHR_RECHTS));
        assertEquals(Decision.RECHTS, r.entscheide(Threat.GEFAHR_LINKS));
        assertEquals(Decision.BREMSEN, r.entscheide(Threat.GEFAHR_VORNE));
    }
}
