package ej1; 

import java.util.Random;


public class JuegoCartas {
	Random rand = new Random(System.nanoTime());

	
	private Integer cant_manos, cant_puntos;
	private Jugador jugador, jugador2;
	private Mazo mazo;
	
	public JuegoCartas(Jugador jugador, Jugador jugador2) {
		//Establecer cantidad de manos y jugadores
		this.jugador = jugador;
		this.jugador2 = jugador2;
	}
		
	
	public void jugar(Integer cant_manos, Integer cant_puntos) {
		this.cant_manos = cant_manos;
		this.cant_puntos = cant_puntos;
		
		for(int i = 0; i < cant_manos; i++) {
			jugador.setNumero(rand.nextInt(12)+1);
			jugador.setPalo(Palo.randomPalo());
			jugador.setPuntos(0);
			
			jugador2.setNumero(rand.nextInt(12)+1);
			jugador2.setPalo(Palo.randomPalo());
			jugador2.setPuntos(0);
			
			Mazo mazo = new Mazo();
			mazo.barajar();
			Boolean ganador = Boolean.FALSE;
			while (!ganador) {
				
				if (mazo.cantidad()>20) {
					
					Naipe carta = mazo.getNaipeArriba();	
					
					if (carta.getNumero().equals(jugador.getNumero())) {
						if (carta.getPalo().equals(jugador.getPalo())) {
							jugador.sumarPuntos(1);
							if (jugador.getPuntos() == cant_puntos) {
								ganador = !ganador;
							}
							jugador.setNumero(rand.nextInt(12)+1);
							jugador.setPalo(Palo.randomPalo());
						}
					}
					
					else if (carta.getNumero().equals(jugador2.getNumero())) {
						if (carta.getPalo().equals(jugador2.getPalo())) {
							jugador2.sumarPuntos(1);
							if (jugador2.getPuntos() == cant_puntos) {
								ganador = !ganador;
							}
							jugador2.setNumero(rand.nextInt(12)+1);
							jugador2.setPalo(Palo.randomPalo());
						}
					}	
					
				} else {
					
					ganador = !ganador;
					
					if (jugador.getPuntos() > jugador2.getPuntos()) {
						System.out.println("El ganador con mas puntos es "+jugador.getNombre()+" ("+jugador.getPuntos()+" puntos)");
					}  
					else if (jugador2.getPuntos() > jugador.getPuntos()){
						System.out.println("El ganador con mas puntos es "+jugador2.getNombre()+" ("+jugador2.getPuntos()+" puntos)");
					} else {
						System.out.println("Hay empate entre "+jugador.getNombre()+ " y "+jugador2.getNombre());
					}
		
					
				}
				
				
			}
			
			
			
		}
		
	}
	
	
	
}
