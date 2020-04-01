package altklausuren.ss17.aufgabe2;

import java.util.*;

public class WortVorkommen {
    Map<Wort, ArrayList<Position>> woerterMap;

    public WortVorkommen() {
        woerterMap = new HashMap<>();
    }

    public void einfuegen(Wort w, Position p) {
        ArrayList<Position> positionen = woerterMap.get(w);

        if(positionen == null) {
            positionen = new ArrayList<>();
            positionen.add(p);
            woerterMap.put(w, positionen);
        } else {
            positionen.add(p);
        }
    }

    public Collection<Position> holeAlle(Wort w) {
        return woerterMap.get(w);
    }

    public Position holeLetzte(Wort w) {
        ArrayList<Position> positionen = woerterMap.get(w);

        if(positionen != null) Collections.sort(positionen);
        return positionen.get(positionen.size()-1);
    }

    public int anzahlVorkommen(Wort w) {
        ArrayList<Position> positionen = woerterMap.get(w);
        return positionen.size();
    }

    public static void main(String[] args) {
        Wort und = new Wort("und");
        Wort oder = new Wort("oder");
        WortVorkommen woerter = new WortVorkommen();

        woerter.einfuegen(und, new Position(3,7));
        woerter.einfuegen(und, new Position(1,3));
        woerter.einfuegen(und, new Position(2,4));
        woerter.einfuegen(oder, new Position(13,57));

        for(Map.Entry<Wort, ArrayList<Position>> entry : woerter.woerterMap.entrySet()) {
            System.out.println(entry.getKey().toString() + " " + entry.getValue().toString());
        }

        System.out.println(woerter.holeLetzte(und).toString());
        System.out.println(woerter.anzahlVorkommen(und));
    }
}
