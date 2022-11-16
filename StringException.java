package Empleado;

public class StringException extends EmpleadoException {
	
	private static String Errores[] ={"Nombre no puede ser nulo.", "El nombre del empleado debe tener 3 o mas caracteres." } ;

	public StringException(String message, Empleado empleado) {
		super(message, empleado);
		// TODO Auto-generated constructor stub
	}
	
	
//	public StringException(String message) {
//		super(message);
//		// TODO Auto-generated constructor stub
//	}
//	
//	public StringException(int num) {
//		name = Errores[num];
//	}
	
//	private String name;
//	public StringException(String nom){ name = nom; }
//	public StringException( int numError){ name = Errores[numError] ; }
//	public StringException(Integer numError) {
		
//	}
	
	
	
	
	private String error;
	private Empleado empleado;
	public StringException(String err){ error = err; }
	public StringException( int numError, Empleado empleado){ error = Errores[numError]; this.empleado = empleado; }
	
	public String toString() { return "ERROR: "+ error +" "+empleado; }
	
	
		
}

