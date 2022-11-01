package ej2;

import java.util.ArrayList; 
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;
import java.util.Random;



public class Tablero {
	
	private List<Barco> barcos;
	private List<Tablero> tableros;
	
	private Integer fila;
	private Columna columna;
	private Barco barco;
	private String nombre_barco;
	private Boolean variable;

	
	public Tablero(Integer fila, Columna columna, Barco barco) {
		this.fila = fila;
		this.columna = columna;
		this.barco = barco;
	}
	
	public Tablero(Integer fila, Columna columna, Barco barco, Boolean variable) {
		this.fila = fila;
		this.columna = columna;
		this.barco = barco;
		this.variable = variable;
	}
	
	public Tablero() {
	}
	
	public Tablero(Boolean variable) {
		this.variable = variable;
	}
	
	public void GenerarTablero() {
		this.tableros = new ArrayList<Tablero>();
		inicializar_tablero();
	}
	
	public Barco getBarco() {
		return barco;
	}

	private void setBarco(Barco barco) {
		this.barco = barco;
	}

	public Barco getPosicion(Columna columna, Integer fila) {
		Iterator<Tablero> iterator = tableros.iterator();
		while(iterator.hasNext()) {
			Tablero tablero = iterator.next();
			if (tablero.getColumna() == columna && tablero.getFila() == fila) {
				return tablero.getBarco();
			}
			
		}
		return barco;
		
	}
	
	public boolean setPosicion(Columna columna, Integer fila, Barco barco) {
		Iterator<Tablero> iterator = tableros.iterator();
		while(iterator.hasNext()) {
			Tablero tablero = iterator.next();
			
			if (tablero.getColumna() == columna && tablero.getFila() == fila) {
				iterator.remove();
				tableros.add(new Tablero(fila, columna, barco));
				return Boolean.TRUE;
			}
			
		}
		return Boolean.FALSE;
		
	}
	
	
	
	public Integer getFila() {
		return fila;
	}
	
	public Boolean getTipo() {
		return variable;
	}

	public void setFila(Integer fila) {
		this.fila = fila;
	}

	public Columna getColumna() {
		return columna;
	}

	public void setColumna(Columna columna) {
		this.columna = columna;
	}

	private void inicializar_tablero() {
		for (int i = 1; i <= 8; i++) {
			tableros.add(new Tablero(i, Columna.A, null));
			tableros.add(new Tablero(i, Columna.B, null));
			tableros.add(new Tablero(i, Columna.C, null));
			tableros.add(new Tablero(i, Columna.D, null));
			tableros.add(new Tablero(i, Columna.E, null));
			tableros.add(new Tablero(i, Columna.F, null));
			tableros.add(new Tablero(i, Columna.G, null));
			tableros.add(new Tablero(i, Columna.H, null));
		}

	}
	
	
//	public void setFlotaBarcos(String nombre_barco) {
//		this.nombre_barco = nombre_barco;
//		List<Barco> barcos = new ArrayList<Barco>();
//		
//		for (int i = 1; i <= 8; i++) {
//			barcos.add(new Barco(nombre_barco));	
//			
//		}
//		
//		agregarBarcos(barcos);
//
//	}

//	public void setFlotaBarcos2(String nombre_barco) {
//		this.nombre_barco = nombre_barco;
//		List<Barco> barcos = new ArrayList<Barco>();
//		Integer numero = 1;
//		for (int i = 1; i <= 8; i++) {
//			
//			barcos.add(new Barco(nombre_barco, numero));	
//
//			numero += 1;
//					
//		}
//		
//		agregarBarcos2(barcos);

//	}
	
	public void setFlotaBarcos3(String nombre_barco) {
		this.nombre_barco = nombre_barco;
		List<Barco> barcos = new ArrayList<Barco>();
		
		if (variable == false) {
		
			for (int i = 1; i <= 8; i++) {
				barcos.add(new Barco(nombre_barco));	
				
			}
			
			agregarBarcos3(barcos);
		
		} else {
			
			Integer numero = 1;
			for (int i = 1; i <= 8; i++) {
				
				barcos.add(new Barco(nombre_barco, numero));	

				numero += 1;
						
			}
			
			agregarBarcos3(barcos);
		}

	}
	
	
	
//	private void agregarBarcos(List<Barco> barcos) {
//		Random rand = new Random(System.nanoTime());
//		Iterator<Barco> iterator = barcos.iterator();
//		while(iterator.hasNext()) {
//			Barco barco = iterator.next();
//			Columna columna = Columna.RandomColumna();
//			Integer fila = rand.nextInt(8)+1;
//			Barco x = getPosicion(columna, fila);
//				
//			if(x == null) {				
//				setPosicion(columna , fila, barco);
//				barco.setPosiciones(columna, fila);
//			}
//			
//			while (x != null) {
//				columna = Columna.RandomColumna();
//				fila = rand.nextInt(8)+1;
//				x = getPosicion(columna, fila);
//				if(x == null) {				
//					setPosicion(columna , fila, barco);
//					barco.setPosiciones(columna, fila);
//				}
//			}
//			
//		}
//		
//	}
	
	
//	private void agregarBarcos2(List<Barco> barcos) {
//		Random rand = new Random(System.nanoTime());
//		Iterator<Barco> iterator = barcos.iterator();
//		while(iterator.hasNext()) {
//			Integer num = 0;
//			Barco barco = iterator.next();
//			while (num<=2) {
//				
//				Columna columna = Columna.RandomColumna();
//				Integer fila = rand.nextInt(8)+1;
//				Barco x = getPosicion(columna, fila);
//					
//				if(x == null) {		
//					
//					setPosicion(columna , fila, barco);
//					barco.setPosiciones(columna, fila);
//				}
//				
//				while (x != null) {
//					
//					columna = Columna.RandomColumna();
//					fila = rand.nextInt(8)+1;
//					x = getPosicion(columna, fila);
//					if(x == null) {				
//						setPosicion(columna , fila, barco);
//						barco.setPosiciones(columna, fila);
//					}
//				}
//				num+=1;
//				
//			}
//		}
//		
//	}
	
	
	private void agregarBarcos3(List<Barco> barcos) {
		Random rand = new Random(System.nanoTime());
		Iterator<Barco> iterator = barcos.iterator();
		while(iterator.hasNext()) {
			Integer num = 0;
			Barco barco = iterator.next();
			if (variable == false) {

				Columna columna = Columna.RandomColumna();
				Integer fila = rand.nextInt(8)+1;
				Barco x = getPosicion(columna, fila);
					
				if(x == null) {				
					setPosicion(columna , fila, barco);
					barco.setPosiciones(columna, fila);
				}
				
				while (x != null) {
					columna = Columna.RandomColumna();
					fila = rand.nextInt(8)+1;
					x = getPosicion(columna, fila);
					if(x == null) {				
						setPosicion(columna , fila, barco);
						barco.setPosiciones(columna, fila);
					}
				}
			} else {
				
				while (num<=2) {
					
					Columna columna = Columna.RandomColumna();
					Integer fila = rand.nextInt(8)+1;
					Barco x = getPosicion(columna, fila);
						
					if(x == null) {		
						
						setPosicion(columna , fila, barco);
						barco.setPosiciones(columna, fila);
					}
					
					while (x != null) {
						
						columna = Columna.RandomColumna();
						fila = rand.nextInt(8)+1;
						x = getPosicion(columna, fila);
						if(x == null) {				
							setPosicion(columna , fila, barco);
							barco.setPosiciones(columna, fila);
						}
					}
					num+=1;
					
				}
			}
		}
		
	}
	
	
}
	
