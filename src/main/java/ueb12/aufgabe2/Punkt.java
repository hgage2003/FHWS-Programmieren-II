package ueb12.aufgabe2;

public class Punkt {
    int x;
    int y;

    public void verschiebePunkt(int zielX, int zielY) {
        if (zielX < 0 || zielY < 0) {
            throw new RuntimeException("Negative Koordinate");
        }
        if (zielX > 1920 || zielY > 1080) {
            throw new RuntimeException("Ungültige Koordinate");
        }
        x = zielX;
        y = zielY;
    }
}

