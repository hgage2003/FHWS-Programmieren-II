package ueb14.aufgabe4;

public class Cyborg extends Decide {
    Human human = new Human();
    Robot robot = new Robot();

    @Override
    public Decision entscheide(Threat threat) {
        if(human.entscheide(threat) == robot.entscheide(threat)) {
            return super.entscheide(threat);
        } else {
            if((int) (Math.random() * 2) == 0) {
                return human.entscheide(threat);
            }
            return robot.entscheide(threat);
        }
    }
}
