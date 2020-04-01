package myExceptions;

public class IllegalPhoneNumberException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7102568052991084206L;

	public IllegalPhoneNumberException() {
		super("Ungueltige Telefonnummer!");
	}

	public IllegalPhoneNumberException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public IllegalPhoneNumberException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public IllegalPhoneNumberException(String arg0) {
		super(arg0);
	}

	public IllegalPhoneNumberException(Throwable arg0) {
		super(arg0);
	}

}