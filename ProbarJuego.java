package ej2;

import java.util.Random;
import java.util.Scanner;

public class ProbarJuego {

	public static void main(String[] args) {
		
		Random rand = new Random(System.nanoTime());
		
		Columna columna;
		Integer fila;
		
		Tablero tablero = new Tablero(false);
		
		Jugador j1 = new Jugador("Fernando", tablero);
		Jugador j2 = new Jugador("Cris", tablero);
		
		tablero.GenerarTablero();
		
		tablero.setFlotaBarcos3("Holanda");
		
		while (j1.getPuntos() < 4 && j2.getPuntos() < 4) {
			
			columna = Columna.RandomColumna();
			fila = rand.nextInt(8)+1;

			System.out.println(j1.dispararBarco3(fila, columna, j2));
			
			
			columna = Columna.RandomColumna();
			fila = rand.nextInt(8)+1;
			
			if (j1.getPuntos()!=4) {
				System.out.println(j2.dispararBarco3(fila, columna, j1));
			}

			
		}		
		
		if (j1.getPuntos() == 4) {
			System.out.println(j1.getNombre()+" es ganador/a de la batalla!");
		} else {
			System.out.println(j2.getNombre()+" es ganador/a de la batalla!");
		}
		
//		System.out.println();
//		Scanner a = new Scanner(System.in);
//		System.out.println("Ha finalizado la primera batalla de barcos.");
//		String hola = a.nextLine();
//		System.out.println();
//		
//		
		// BARCOS CON 3 POSICIONES
//		
//		tablero = new Tablero();
//		
//		j1 = new Jugador("Fernando", tablero);
//		j2 = new Jugador("Cris", tablero);
//		
//		tablero.GenerarTablero();
//		
//		tablero.setFlotaBarcos2("Holanda");
//		
//		while (j1.getPuntos() < 4 && j2.getPuntos() < 4) {
//			
//			columna = Columna.RandomColumna();
//			fila = rand.nextInt(8)+1;
//
//			System.out.println(j1.dispararBarco2(fila, columna, j2));
//			
//			
//			columna = Columna.RandomColumna();
//			fila = rand.nextInt(8)+1;
//			
//			if (j1.getPuntos()!=4) {
//				System.out.println(j2.dispararBarco2(fila, columna, j1));
//			}
//
//			
//		}		
//		
//		if (j1.getPuntos() == 4) {
//			System.out.println(j1.getNombre()+" es ganador/a de la batalla!");
//		} else {
//			System.out.println(j2.getNombre()+" es ganador/a de la batalla!");
//		}
		
		
		// PRUEBA 3
		
//		System.out.println();
//		a = new Scanner(System.in);
//		System.out.println("Ha finalizado la segunda batalla de barcos.");
//		hola = a.nextLine();
//		System.out.println();
//		
//		tablero = new Tablero();
//		
//		j1 = new Jugador("Fernando", tablero);
//		j2 = new Jugador("Cris", tablero);
//		
//		tablero.GenerarTablero();
//		
//		tablero.setFlotaBarcos("Holanda");
//		
//		while (j1.getPuntos() < 4 && j2.getPuntos() < 4) {
//			
//			columna = Columna.RandomColumna();
//			fila = rand.nextInt(8)+1;
//
//			System.out.println(j1.dispararBarco(fila, columna, j2));
//			
//			
//			columna = Columna.RandomColumna();
//			fila = rand.nextInt(8)+1;
//			
//			if (j1.getPuntos()!=4) {
//				System.out.println(j2.dispararBarco(fila, columna, j1));
//			}
//
//			
//		}		
//		
//		if (j1.getPuntos() == 4) {
//			System.out.println(j1.getNombre()+" es ganador/a de la batalla!");
//		} else {
//			System.out.println(j2.getNombre()+" es ganador/a de la batalla!");
//		}
		
		
		
		
		
		
		
		
//		Scanner a = new Scanner(System.in);
//		System.out.println("holaa antes");
//		String hola = a.nextLine();
	
	}
	

}
