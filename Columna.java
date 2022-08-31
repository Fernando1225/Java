package ej2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Columna {
	
	
	A("A"),
	B("B"),
	C("C"),
	D("D"),
	E("E"),
	F("F"),
	G("G"),
	H("H");
	
	private static final List<Columna> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();
	
	public static Columna RandomColumna() {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}
	
	
	private String columna;
	
	private Columna(String columna) {
		this.columna = columna;
	}
	
	

}
