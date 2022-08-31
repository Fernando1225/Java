package ej1;

public class Jugador {
	
	private String nombre;
	private Integer puntos, numero;
	private Mazo mazo;
	private Palo palo;

	public Jugador(String nombre, Mazo mazo){
		this.nombre = nombre;
		this.puntos = 0;
		this.mazo = mazo;
	}
	
	public Jugador(String nombre){
		this.nombre = nombre;
		this.puntos = 0;
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

	public void sumarPuntos(Integer puntos) {
		this.puntos += puntos;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public void elegirCarta(Integer numero, Palo palo) {
		this.numero = numero;
		this.palo = palo;
	}
	
	
	
}