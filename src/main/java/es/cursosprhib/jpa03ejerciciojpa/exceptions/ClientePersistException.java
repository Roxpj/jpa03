package es.cursosprhib.jpa03ejerciciojpa.exceptions;

public class ClientePersistException extends RuntimeException {

	public ClientePersistException() {
		super();
	}

	public ClientePersistException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ClientePersistException(String message, Throwable cause) {
		super(message, cause);
	}

	public ClientePersistException(String message) {
		super(message);
	}

	public ClientePersistException(Throwable cause) {
		super(cause);
	}
	
}
