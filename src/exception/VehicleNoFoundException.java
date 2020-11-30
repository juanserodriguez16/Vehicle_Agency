package exception;

public class VehicleNoFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public VehicleNoFoundException(String placa) {
		super("El vehiculo "+ placa +" no fue hallado, por favor intente de nuevo.");
	}

}
