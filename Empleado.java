package Empleado;

import java.util.Scanner;

public class Empleado {

    //atributos
    private String nombre;
    private Double sueldo;
    private Integer num_legajo;

    //constructor
    public Empleado() {

    }

    public Empleado(String nombre, Double sueldo) throws EmpleadoException {
    		this.nombre = nombre;
    		this.sueldo = sueldo;    		
    	if (nombre == null) {
			throw new StringException("Nombre no puede ser nulo.");
		}
		if (nombre.length() < 3) {
			throw new StringException("El nombre del empleado debe tener 3 o mas caracteres.");
		}
		if (sueldo == null) {
			throw new EnteroPositivoException("Sueldo no puede ser nulo.");
		}
		if (sueldo <= 0) {
			throw new EnteroPositivoException("El sueldo del empleado debe ser mayor a 0.");
		}
        
        
//        Debe devolver una StringException si el nombre es null o tiene menos de 3 caracteres.
//        Mensaje: El nombre del empleado debe tener 3 o mas caracteres.
//        Debe devolver una EnteroPositivoException si el sueldo es null o menor o igual a 0.
//        Mensaje: El sueldo del empleado debe ser mayor a 0.
        
    }
    
    
    public Empleado(String nombre, Integer sueldo) throws EmpleadoException {
        this.nombre = nombre;
        this.sueldo = Double.valueOf(sueldo);
        
        if (nombre == null) {
			throw new StringException("Nombre no puede ser nulo.");
		}
		if (nombre.length() < 3) {
			throw new StringException("El nombre del empleado debe tener 3 o mas caracteres.");
		}
		if (sueldo == null) {
			throw new EnteroPositivoException("Sueldo no puede ser nulo.");
		}
		if (sueldo <= 0) {
			throw new EnteroPositivoException("El sueldo del empleado debe ser mayor a 0.");
		}
        
        
//        Debe devolver una StringException si el nombre es null o tiene menos de 3 caracteres.
//        Mensaje: El nombre del empleado debe tener 3 o mas caracteres.
//        Debe devolver una EnteroPositivoException si el sueldo es null o menor o igual a 0.
//        Mensaje: El sueldo del empleado debe ser mayor a 0.
        
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws EmpleadoException {
        this.nombre = nombre;
        
        if (nombre == null) {
			throw new StringException("Nombre no puede ser nulo.");
		}
		if (nombre.length() < 3) {
			throw new StringException("El nombre del empleado debe tener 3 o mas caracteres");
		}
    
//        Debe devolver una StringException si el nombre es null o tiene menos de 3 caracteres.
//        Mensaje: El nombre del empleado debe tener 3 o mas caracteres.
    
    }

    
    public Double getSueldo(String moneda) {
        return  sueldo;
    }
    
    public Double getSueldo() {
        return  sueldo;
    }

    public void setSueldo(Double sueldo) throws EmpleadoException{
        
        if (sueldo == null) {
			throw new EnteroPositivoException("Sueldo no puede ser nulo.");
		}
		if (sueldo <= 0) {
			throw new EnteroPositivoException("El sueldo del empleado debe ser mayor a 0.");
		}
        
		this.sueldo = sueldo;
    
//        Debe devolver una EnteroPositivoException si el sueldo es null, o menor o igual a 0.
//        Mensaje: El sueldo del empleado debe ser mayor a 0.
        
    }
    
    
    public void setLegajo(Integer num_legajo) throws EnteroPositivoException{
    	
    	if (num_legajo == null) {
			throw new EnteroPositivoException("Legajo no puede ser nulo.");
		}
		if (num_legajo <= 0) {
			throw new EnteroPositivoException("El legajo del empleado debe ser mayor a 0.");
		}
    
		this.num_legajo = num_legajo;
    	
//    	Debe devolver una EnteroPositivoException si el legajo es null, o menor o igual a 0.
//        Mensaje: El legajo del empleado debe ser mayor a 0.

    
    }  
    
    public Integer getLegajo() {
    	return num_legajo;
    	
    }
    
//    public void setLegajo2() throws EnteroPositivoException{
//    	
//    	Scanner num = new Scanner(System.in);
//    	System.out.println("Ingrese un numero de legajo:");
//    	Integer num_legajo = num.nextInt();
//    	this.num_legajo = num_legajo;
//    	System.out.println("La carga ha sido exitosa. "+this.num_legajo);
//
//    	if (num_legajo <= 0) {
//			throw new EnteroPositivoException(3);
//		}
//    	
//    	
//    }
    
//    public void setLegajo2() throws EnteroPositivoException{
//    	try (Scanner num = new Scanner(System.in)) {
//			int num_legajo = num.nextInt();
//
//			if (num_legajo <= 0) {
//				throw new EnteroPositivoException("El legajo del empleado debe ser mayor a 0.");
//			}
//   
//			this.num_legajo = Integer.valueOf(num_legajo);
//		}
//    	
////    	Debe devolver una EnteroPositivoException si el legajo es null, o menor o igual a 0.
////        Mensaje: El legajo del empleado debe ser mayor a 0.
//
//    
//    }
    
    
    
    
    

}