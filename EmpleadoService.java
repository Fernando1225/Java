package Empleado;

import java.util.ArrayList;
import java.util.List;


public class EmpleadoService {
	
	private static final int MAXIMO = 10;
	private static Empleado[] empleados = new Empleado[MAXIMO];
	private static int cantidad = 0;
	
	
	public static Empleado[] getEmpleados() {
		return empleados;
	}
	
	
	public static Empleado agregar(Empleado empleado) throws EmpleadoException{
		if (empleado.getSueldo() <= 0) {
			throw new EnteroPositivoException("El sueldo del empleado debe ser mayor a 0.", empleado);
		}
		if (empleado.getSueldo() == null) {
			throw new EnteroPositivoException("Sueldo no puede ser nulo.", empleado);
		}
		if (empleado.getNombre() == null) {
			throw new StringException("Nombre no puede ser nulo.", empleado);
		}
		if (empleado.getNombre().length() < 3) {
			throw new StringException("El nombre del empleado debe tener 3 o mas caracteres.", empleado);
		}
		
		empleados[cantidad++] = empleado;
		return empleado;
	}
	
	
	public static Empleado mayorSueldo() {
		Empleado mayor = new Empleado();
		for (int i=0; i < cantidad; i++) {
			if (mayor.getSueldo()<=empleados[i].getSueldo()) {
				mayor = empleados[i];
			}
		}
		return mayor;
	}
	
	
	public static Empleado eliminarEmpleado(Integer num_legajo) {
		Empleado empleado = new Empleado();
		for (int i=0; i < cantidad; i++) {
			if (empleados[i].getLegajo()==num_legajo) {
				empleado = empleados[i];
				return empleado;
			}
		}
		return null;
	}
	
	
	public static Double sueldoPromedio() {
		Double total = 0.0;
		for (int i = 0; i < cantidad; i++) {
			total += empleados[i].getSueldo();
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
