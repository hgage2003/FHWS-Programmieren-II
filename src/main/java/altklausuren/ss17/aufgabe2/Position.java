package altklausuren.ss17.aufgabe2;

public final class Position implements Comparable<Position> {
    int zeilennummer, spaltennummer;

    public Position(int zeilennummer, int spaltennummer) {
        this.zeilennummer = zeilennummer;
        this.spaltennummer = spaltennummer;
    }

    @Override
    public int compareTo(Position p) {
        if(zeilennummer == p.zeilennummer && spaltennummer == p.spaltennummer) return 0;

        if(zeilennummer > p.zeilennummer) {
            return 1;
        } else if(spaltennummer > p.spaltennummer) {
            return 1;
        }
        return -1;
    }

    public String toString() {
        return "[" + zeilennummer + "," + spaltennummer + "]";
    }
}
