package ueb14.aufgabe4;

public class Main {
    public static void main(String[] args) {
        Human h = new Human();
        Robot r = new Robot();
        Cyborg c = new Cyborg();

        System.out.println("Mensch: " + h.entscheide(Threat.GEFAHR_RECHTS));
        System.out.println("Roboter: " + r.entscheide(Threat.GEFAHR_RECHTS));
        System.out.println("Cyborg: " + c.entscheide(Threat.GEFAHR_RECHTS));
    }
}
