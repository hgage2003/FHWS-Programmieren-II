package altklausuren.ss15.aufgabe2;

public class Hypothekenkonto extends Konto {
    public Hypothekenkonto(String inhaber, double saldo, double zins) {
        super(inhaber, saldo, zins);
    }

    public String toString() {
        return "Hypothek " + super.toString();
    }

    protected boolean istBuchungZulaessig(double betrag) {
        return getSaldo() - betrag < 0.0;
    }

    void sondertilgung(double betrag) throws IllegalArgumentException {
        if (istBuchungZulaessig(betrag)) {
            setSaldo(getSaldo() + betrag);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
