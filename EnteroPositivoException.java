package Empleado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EnteroPositivoException extends EmpleadoException {
	
	private static String Errores[] ={"Sueldo no puede ser nulo.", "El sueldo del empleado debe ser mayor a 0.", "El legajo no puede ser nulo.", "El numero del legajo tiene que ser mayor a 0." } ;

	public EnteroPositivoException(String message, Empleado empleado) {
		super(message, empleado);
		// TODO Auto-generated constructor stub
//		System.out.println("Ingrese nuevo numero de legajo:");
//		Scanner num = new Scanner(System.in);
//		
//		Integer num_legajo = num.nextInt();
//		try {
//		empleado.setLegajo(num_legajo);
//		} catch (EmpleadoException e) {
//			System.out.printf("Error -> ", e);
//		}
	}
	
//	public EnteroPositivoException(String message) {
//		super(message);
//		// TODO Auto-generated constructor stub
//	}
	
	
	private String error;
	private Empleado empleado;

	public EnteroPositivoException(String err){ error = err; }
	public EnteroPositivoException( int numError){ error = Errores[numError];}
	public EnteroPositivoException( int numError, Empleado empleado){ error = Errores[numError];  this.empleado = empleado;  }
	
	public String toString() { return "ERROR: "+ error +" "+empleado; }

	
	
	
	
//	public EnteroPositivoException( int numError, Empleado empleado,Integer num2){ 
//		error = Errores[numError];  
//		this.empleado = empleado; 
//		
//		System.out.println(error);
//		
//		Scanner num = new Scanner(System.in);
//    	System.out.println("Ingrese un numero de legajo:");
//    	Integer num_legajo = num.nextInt();
//		
//		try {
//			empleado.setLegajo(num_legajo);
////			empleado.setLegajo2();
//		} catch (EnteroPositivoException e) {
//			System.out.println(e);			
//		}
//			// TODO Auto-generated catch block
//		}
//		
		
//		Scanner num2 = new Scanner(System.in);
//		Integer num_legajo = num2.nextInt();
//		try {
//			empleado.setLegajo(num_legajo);
//		} catch (EnteroPositivoException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e);
//		}
//		
//		toString();
		
		
		
		
	
//	}
	

		
		// TODO Auto-generated constructor stub
	
//	public void EnteroPositivoException(String message, Empleado empleado) throws EmpleadoException {
//		System.out.println(message);
//		
//		
//		System.out.println("Ingrese nuevo numero de legajo:");
//		Scanner num = new Scanner(System.in);
//		
//		Integer num_legajo = num.nextInt();
//		
//		 empleado.setLegajo(num_legajo);
//		// TODO Auto-generated constructor stub
//	}

}
