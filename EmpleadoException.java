package Empleado;

public class EmpleadoException extends Exception {
	
	private Empleado empleado;
	
	public EmpleadoException(String message, Empleado empleado) {
		super(message);
		this.empleado = empleado;
	}
	
	public EmpleadoException(String message) {
		// TODO Auto-generated constructor stub
	}
	
	public EmpleadoException() {
		// TODO Auto-generated constructor stub
	}

	public Empleado getEmpleado() {
		return empleado;
	}
	
	
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
	
	
//class CollectionVaciaException extends  EmpleadoException{
//	
//	public CollectionVaciaException() {
//		
//	}
//	
//	public CollectionVaciaException(String message) {
//		super(message);
//	}
//}
	
	
	
	
	
	
	
//	private static String Errores[] ={"Excede las columnas", "Excede las filas" } ;
//	private String name;
//	public EmpleadoException(String nom){ name = nom; }
//	public EmpleadoException( int numError){ name = Errores[numError] ; }
//	public String toString() { return "ERROR MATRIZ :"+name; }
	
}
