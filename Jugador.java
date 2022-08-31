package ej2;

import java.util.Iterator;
import java.util.List;

import ej2.Barco;
import ej2.Columna;
import ej2.Tablero;

public class Jugador {

	private String nombre;
	private Columna columna;
	private Integer fila, puntos;
	private Tablero tablero;
	private List<Tablero> tableros;
	
	public Jugador(String nombre, Tablero tablero){
		this.nombre = nombre;
		this.puntos = 0;
		this.tablero = tablero;
	}
	
	public String dispararBarco(Integer fila, Columna columna, Jugador jugador) {
		Barco x = tablero.getPosicion(columna, fila);
		
		if (x == null) {
			return "Fallaste tu tiro "+nombre+"!";	
		
		} else {
			
			this.puntos += 1;
			tablero.setPosicion(columna, fila, null);
			return "¡Has hundido un barco de "+jugador.getNombre()+"!";
		}
	
	}
	
	public String dispararBarco3(Integer fila, Columna columna, Jugador jugador) {
		return "";
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPuntos() {
		return puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}
	
}
