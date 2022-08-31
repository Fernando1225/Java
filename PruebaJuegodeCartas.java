package ej1;

public class PruebaJuegodeCartas {

	public static void main(String[] args) {
		
		Mazo mazo = new Mazo();
		
		Jugador j1 = new Jugador("Fernando");
		Jugador j2 = new Jugador("Cris");
		
		JuegoCartas juego = new JuegoCartas(j1,j2);
		
		j1.elegirCarta(6, Palo.ORO);
		j2.elegirCarta(8, Palo.BASTO);
		
		
		juego.jugar(5, 6);
		
	}
}
