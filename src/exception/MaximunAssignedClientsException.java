package exception;

public class MaximunAssignedClientsException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MaximunAssignedClientsException(int max) {
		super("El asesor de venta ya tiene " + max + " clientes a su cargo, elige un vendedor diferente");
	}

}
