package dev.alexandre.webservice.exceptions;

public class DAOException extends RuntimeException {

	private static final long serialVersionUID = -2344242170547313516L;
	
	private int code;

    public DAOException(String message, int code) {
         super(message);
         this.code = code;
    }

    public int getCode() {
         return code;
    }
    
}
