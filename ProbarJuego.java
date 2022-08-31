package ej2;

import java.util.Random;

public class ProbarJuego {

	public static void main(String[] args) {
		
		Random rand = new Random(System.nanoTime());
		
		Columna columna;
		Integer fila;
		
		Tablero tablero = new Tablero();
		
		Jugador j1 = new Jugador("Fernando", tablero);
		Jugador j2 = new Jugador("Cris", tablero);
		
		tablero.GenerarTablero();
		
		tablero.setFlotaBarcos("Holanda");
		
		while (j1.getPuntos() < 4 && j2.getPuntos() < 4) {
			
			columna = Columna.RandomColumna();
			fila = rand.nextInt(8)+1;

			System.out.println(j1.dispararBarco(fila, columna, j2));
			
			
			columna = Columna.RandomColumna();
			fila = rand.nextInt(8)+1;
			
			if (j1.getPuntos()!=4) {
				System.out.println(j2.dispararBarco(fila, columna, j1));
			}

			
		}		
		
		if (j1.getPuntos() == 4) {
			System.out.println(j1.getNombre()+" es ganador/a de la batalla!");
		} else {
			System.out.println(j2.getNombre()+" es ganador/a de la batalla!");
		}
		
	columna = Columna.RandomColumna();
	fila = rand.nextInt(8)+1;
	tablero.setFlotaBarcos3("ESS");
	System.out.println(j1.dispararBarco3(fila, columna, j2));
	
	}

}
