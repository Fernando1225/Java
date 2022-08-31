package mapa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pais {

	private String nombre;
	private String capital;
	private Continente continente;
	private Set<Provincia> provincias;
	private Set<Pais> limitrofes;

	public Pais(String nombre, String capital, Continente continente) {
		this.nombre = nombre;
		this.capital = capital;
		this.continente = continente;
		this.provincias = new HashSet<Provincia>();
		this.limitrofes = new HashSet<Pais>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public Set<Provincia> getProvincias() {
		return provincias;
	}

	public void setProvincias(Set<Provincia> provincias) {
		this.provincias = provincias;
	}

	public Continente getContinente() {
		return continente;
	}

	public void setContinente(Continente continente) {
		this.continente = continente;
	}

	public Set<Pais> getLimitrofes() {
		return limitrofes;
	}

	public void setLimitrofes(Set<Pais> limitrofes) {
		this.limitrofes = limitrofes;
	}

	public void agregarLimitrofe(Pais pais) {
		this.limitrofes.add(pais);
	}

	public void agregarProvincia(Provincia provincia) {
		this.provincias.add(provincia);
	}

	@Override
	public String toString() {
		return this.nombre + " - " + this.capital;
	}

}