package altklausuren.ss15.aufgabe2;

public abstract class Konto {
    private String inhaber;
    private double saldo = 0.0;
    private double zinssatz = 0.0;

    public Konto(String inhaber, double saldo, double zins) {
        this.inhaber = inhaber;
        this.saldo = saldo;
        this.zinssatz = zins;
    }

    protected abstract boolean istBuchungZulaessig(double betrag);

    public String toString() {
        return "Inhaber=" + inhaber +
                ", Saldo=" + saldo +
                ", Zinssatz=" + zinssatz;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getZinssatz() {
        return zinssatz;
    }
}
