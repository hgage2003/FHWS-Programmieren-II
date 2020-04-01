package ueb14.aufgabe4;

public abstract class Decide {
    public Decision entscheide(Threat threat) {
        if(threat == Threat.GEFAHR_LINKS) {
            return Decision.RECHTS;
        } else if(threat == Threat.GEFAHR_RECHTS) {
            return Decision.LINKS;
        } else {
            return Decision.BREMSEN;
        }
    }
}
