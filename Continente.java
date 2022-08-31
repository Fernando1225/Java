package mapa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Continente {
	
	private String nombre;
	private Set<Pais> paises;

	public Continente(String nombre) {
		this.nombre = nombre;
		this.paises = new HashSet<Pais>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Pais> getPaises() {
		return paises;
	}

	public void setPaises(Set<Pais> paises) {
		this.paises = paises;
	}

	public void agregarPais(Pais pais) {
		
		Iterator<Pais> iterator = paises.iterator();
		while(iterator.hasNext()) {
			Pais p = iterator.next();
			if(p.getNombre().equalsIgnoreCase(pais.getNombre())) {
				return;
			}		
		}
		this.paises.add(pais);
		
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}