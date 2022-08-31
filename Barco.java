package ej2;

public class Barco {
	private Integer numero;
	private String nombre;
	
	
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


	public Barco(String nombre) {
		this.nombre = nombre;
	}
	
	public Barco(String nombre, Integer numero) {
		this.nombre = nombre;
		this.numero = numero;
	}


}
