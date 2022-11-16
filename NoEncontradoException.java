package Empleado;

public class NoEncontradoException extends EmpleadoException{

	private static String Errores[] ={"No se encontro el empleado."} ;
	
	
	public NoEncontradoException(String message, Empleado empleado) {
		super(message, empleado);
		// TODO Auto-generated constructor stub
	}
	
//	public NoEncontradoException(String message) {
//		super(message);
//		// TODO Auto-generated constructor stub
//	}
	
	
	private String error;
	public NoEncontradoException(String err){ error = err; }
	public NoEncontradoException( int numError){ error = Errores[numError];}
	
	public String toString() { return "ERROR: "+ error; }
	
}
