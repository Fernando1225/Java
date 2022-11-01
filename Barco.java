package ej2;

import java.util.ArrayList;
import java.util.List;

public class Barco {
	private Integer numero;
	private String nombre;
	private List<Columna> columnas; 
	private List<Integer> filas;
	
	
	public Barco() {
		
	}
	
	public Barco(Integer numero) {
		this.numero = numero;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPosiciones(Columna columna, Integer fila) {
		this.columnas.add(columna);
		this.filas.add(fila);
	}
	
	public List<Columna> getPosicionColumnas() {
		return columnas;
	}
	
	public List<Integer> getPosicionFilas() {
		return filas;
	}
	
	public void setEliminarPosiciones() {
		columnas.clear();
		filas.clear();
	}
	
	
//	public void getPosicion(Columna columna, Integer fila) {
//		Boolean variable = Boolean.FALSE;
//		if (columnas.contains(columna) && filas.contains(fila)) {
//			variable = Boolean.TRUE;
//		}
//		
//		return ;
//	}


	public Barco(String nombre) {
		this.columnas = new ArrayList<Columna>();
		this.filas = new ArrayList<Integer>();
		this.nombre = nombre;
	}
	
	public Barco(String nombre, Integer numero) {
		this.columnas = new ArrayList<Columna>();
		this.filas = new ArrayList<Integer>();
		this.nombre = nombre;
		this.numero = numero;
	}


}
