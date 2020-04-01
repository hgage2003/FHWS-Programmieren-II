package altklausuren.ss17.aufgabe3;

import java.util.ArrayList;
import java.util.List;

public class Warenkorb {
    Kunde kunde;
    List<Position> positionen;

    private Warenkorb(Kunde kunde, List<Position> positionen) {
        this.kunde = kunde;
        this.positionen = positionen;
    }

    public static class WarenkorbBuilder {
        Kunde kunde;
        List<Position> positionen;

        public WarenkorbBuilder(Kunde kunde) {
            this.kunde = kunde;
            positionen = new ArrayList<>();
        }

        public WarenkorbBuilder positionHinzufuegen(Position position) {
            this.positionen.add(position);
            return this;
        }

        public Warenkorb build() {
            return new Warenkorb(kunde, positionen);
        }
    }

    public Bestellung bestellen() {
        return new Bestellung(this);
    }
}
