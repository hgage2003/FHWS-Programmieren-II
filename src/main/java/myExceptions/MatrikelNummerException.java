package myExceptions;

public class MatrikelNummerException extends RuntimeException {
	public MatrikelNummerException() {
		super();
	}

	public MatrikelNummerException(String msg) {
		super(msg);
	}
}
