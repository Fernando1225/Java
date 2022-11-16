package Empleado;

public class CollectionVaciaException extends  EmpleadoException{

	private static String Errores[] ={"No hay empleados."} ;
	
	public CollectionVaciaException(String message, Empleado empleado) {
		super(message, empleado);
		// TODO Auto-generated constructor stub
	}
	
//	public CollectionVaciaException(String message) {
//		super(message);
//		// TODO Auto-generated constructor stub
//	}
	
	
	private String error;
	public CollectionVaciaException(String err){ error = err; }
	public CollectionVaciaException( int numError){ error = Errores[numError];}
	
	public String toString() { return "ERROR: "+ error; }
	
	
	
}
