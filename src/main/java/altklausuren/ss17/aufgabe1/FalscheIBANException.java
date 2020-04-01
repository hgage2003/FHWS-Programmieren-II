package altklausuren.ss17.aufgabe1;

public class FalscheIBANException extends Exception {
    public FalscheIBANException() {
        super("FEHLER: Datei enthaelt ungueltige IBAN");
    }

    public FalscheIBANException(String msg) {
        super(msg);
    }
}
