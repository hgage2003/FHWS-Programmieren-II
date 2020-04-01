package altklausuren.ss17.aufgabe3;

public class Main {

    public static void main(String[] args) {
        Kunde k1 = new Kunde("Hans");
        Position p1 = new Position("Kamera");
        Warenkorb warenkorb = new Warenkorb
                .WarenkorbBuilder(k1)
                .positionHinzufuegen(p1)
                .build();
        //Bestellung soll nicht Teil des Builder sein
        Bestellung bestellung = warenkorb.bestellen();
    }
}
