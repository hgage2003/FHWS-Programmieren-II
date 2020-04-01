package klausurvorbereitung.aufgabe4;

public class FalscheIBANException extends Exception {

    private static final long serialVersionUID = 1L;
    
    public FalscheIBANException() {
	super("FEHLER: Datei enthält ungültige IBAN");
    }

    public FalscheIBANException(String arg01) {
	super(arg01);
    }
}
