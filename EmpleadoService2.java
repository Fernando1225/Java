package Empleado;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmpleadoService2 {
	
	private static final int MAXIMO = 10;
	private static List<Empleado> empleados;
	private static int cantidad = 1;
	
	
	public EmpleadoService2() {
		
	}

	
	public static List<Empleado> getEmpleados() {
		return empleados;
	}
	
	
	public static void generar_EmpleadoService() {
		
		empleados = new ArrayList<Empleado>();
	}
	
	
	
//	public static Boolean agregar(Empleado empleado, Integer num_legajo) throws EmpleadoException{
//		if (cantidad==0) {
//			generar_EmpleadoService();
//		}
//			
////		try {
////			Scanner num = new Scanner(System.in);
////			Integer num_legajo = num.nextInt();
////			empleado.setLegajo(num_legajo);
////		} catch (EnteroPositivoException e){
////			throw new EnteroPositivoException("No puede ser nulo.",empleado);
////		}
//		
////		Scanner num = new Scanner(System.in);
////		Integer num_legajo = num.nextInt();
////			
////		empleado.setLegajo(num_legajo);
////		} catch (EnteroPositivoException e) {
////			e.getMessage();
////			
////		}
//		
//		if (num_legajo == null) {
//			throw new EnteroPositivoException("Legajo no puede ser nulo.", empleado);
//		}
//		
//		if (num_legajo <= 0) {
////			System.out.println("Hola");
////			Scanner num = Scanner(System.in);
////			int num_legajo1 = num.nextInt();
////			empleado.setLegajo(num_legajo1);
//			throw new EnteroPositivoException("El legajo del empleado debe ser mayor a 0.", empleado);
//		}
//		
//		empleado.setLegajo(num_legajo);
//		
//		
//		empleados.add(empleado);
//		
//		cantidad+=1;
//		
//		return Boolean.TRUE;
//	}
//	
	
	
//	public static Empleado agregar(Empleado empleado) throws StringException, EnteroPositivoException{
//		if (empleado.getLegajo() <= 0) {
//			throw new EnteroPositivoException(4, empleado);
//		}
//		if (empleado.getLegajo() == null) {
//			throw new EnteroPositivoException(3, empleado);
//		}
//		
//		cantidad+=1;
//		empleados.add(empleado);
//		return empleado;
//	}
	
	public Boolean agregar(Empleado empleado) throws EnteroPositivoException{
			if (empleado.getLegajo() == null || empleado.getLegajo() <=0) {
				empleado.setLegajo(cantidad);
			}
				
			
			cantidad+=1;
			empleados.add(empleado);
			return Boolean.TRUE;

	}
	
	
	
	
//	private static Scanner Scanner(InputStream in) {
//		// TODO Auto-generated method stub
//		return null;
//	}


	public static Empleado mayorSueldo() throws EmpleadoException{
		Empleado mayor = new Empleado();
		mayor.setSueldo(0.1);
		Iterator<Empleado> iterator = empleados.iterator();
		while(iterator.hasNext()) {
			Empleado empleado = iterator.next();
			if (mayor.getSueldo() <= empleado.getSueldo()) {
				mayor = empleado;
			}
			
		}
		return mayor;
	}
	
	
	public static Empleado eliminarEmpleado(Integer num_legajo) throws CollectionVaciaException, NoEncontradoException {
		
		boolean variable = Boolean.TRUE;
		
		if (empleados.size()==0) {
			throw new CollectionVaciaException("No hay empleados.");
		}
		Iterator<Empleado> iterator = empleados.iterator();
		while(iterator.hasNext()) {
			Empleado empleado = iterator.next();
			if (empleado.getLegajo()==num_legajo) {
				empleados.remove(empleado);
				variable = Boolean.FALSE;
				return empleado;
			}
		}
		if (variable) {
			throw new NoEncontradoException(0);
		}
		
		return null;
	}
	
	
	public static Double sueldoPromedio() throws CollectionVaciaException{
		Double total = 0.0;
		
		if (empleados.size()==0) {
			throw new CollectionVaciaException("No hay empleados.");
		}
		
		Iterator<Empleado> iterator = empleados.iterator();
		while(iterator.hasNext()) {
			Empleado empleado = iterator.next();
			total += empleado.getSueldo();
		}
		return total/cantidad;
	}
	
//	private static List<Empleado> empleados;
//	
//	public void Generar_EmpleadoService() {
//		
//		this.empleados = new ArrayList<Empleado>();
//	}
//	
//	public static Boolean agregar(Empleado empleado) {
//		try {
//			empleados.add(empleado);
//			empleado.setLegajo(null);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//		
//		
//		
//		
//		
//	//	Debe retornar la EnteroPositivoException que puede retornar el método setLegajo(Integer
//	//	legajo) de la clase Empleado que se llama en esté método.
//	
//	}
//	
//	
//	public static Empleado mayorSueldo() {
		
//	
//		
//		
//	//	Debe devolver una CollectionVaciaException si no hay empleados en el List.
//	//	Mensaje: No hay empleados.
//
//	}
//		
//		
//	public static Double sueldoPromedio() {
//		
//		
//		
//		
//	//	Debe devolver una CollectionVaciaException si no hay empleados en el List.
//	//	Mensaje: No hay empleados.
//		
//	}
//	
//	
//	public static void eliminar(String nombre) {
//		
//	
//		
//		
////	Debe devolver una CollectionVaciaException si no hay empleados en el List.
////	Mensaje: No hay empleados.
////	Debe devolver una NoEncontradoException si no encuentra el empleado.
////	Mensaje: No se encontro el empleado.
//	
//	}
}
