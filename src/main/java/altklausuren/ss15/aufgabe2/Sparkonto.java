package altklausuren.ss15.aufgabe2;

public class Sparkonto extends Konto {
    public int kuendigungsfrist;

    public Sparkonto(String inhaber, double saldo, double zins, int kuendigungsfrist) {
        super(inhaber, saldo, zins);
        this.kuendigungsfrist = kuendigungsfrist;
    }

    public String toString() {
        return "Sparkonto: " + super.toString() + " " + this.kuendigungsfrist;
    }

    @Override
    protected boolean istBuchungZulaessig(double betrag) {
        return getSaldo() - betrag > 0.0;
    }

    public double abheben(double gewuenschterBetrag) {
        if (istBuchungZulaessig(gewuenschterBetrag)) {
            setSaldo(getSaldo() - gewuenschterBetrag);
            return getSaldo();
        } else {
            return 0.0;
        }
    }

}
