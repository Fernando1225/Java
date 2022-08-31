package ej1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public enum Palo {
	
	ORO("Oro", "O"),
	ESPADA("Espada", "E"),
	COPA("Copa", "C"),
	BASTO("Basto", "B");
	
	private String nombre;
	private String simbolo;
	
	private Palo(String nombre, String simbolo){
		this.nombre = nombre;
		this.simbolo = simbolo;
	}
	
	private static final List<Palo> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	
	public static Palo randomPalo() {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}
}
