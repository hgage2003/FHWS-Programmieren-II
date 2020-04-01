package ueb14.aufgabe4;

public class Human extends Decide {
    @Override
    public Decision entscheide(Threat threat) {
        if((int) (Math.random() * 4) == 0) {
            return Decision.UNENTSCHIEDEN;
        }
        return super.entscheide(threat);
    }
}
