package exception;

public class SellerNoFoundException extends Exception{


	private static final long serialVersionUID = 1L;
	public SellerNoFoundException(int cedula) {
		super("El vendedor "+ cedula +" no fue hallado, por favor intente de nuevo.");
	}
}
