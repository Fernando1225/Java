package mapa;

public class App {

	public static void main(String[] args) {

		/*
		 * Continente america = new Continente("America");
		 * 
		 * Pais argentina = new Pais("Argentina", "Buenos Aires", america); Pais uruguay
		 * = new Pais("Uruguay", "Montevideo", america); Pais argentina2 = new
		 * Pais("Argentina2", "Buenos Aires", america);
		 * 
		 * Provincia entreRios = new Provincia("Entre Rios", argentina);
		 * 
		 * america.agregarPais(argentina); america.agregarPais(uruguay);
		 * america.agregarPais(argentina2);
		 * 
		 * argentina.agregarProvincia(entreRios); argentina.agregarLimitrofe(uruguay);
		 * 
		 * System.out.println(america.getPaises());
		 * System.out.println(argentina.getContinente());
		 * System.out.println(entreRios.getPais());
		 * System.out.println(argentina.getProvincias());
		 * System.out.println(argentina.getLimitrofes());
		 */
		
		MapaMundial mapa = new MapaMundial();
		
		System.out.println(mapa.getPaises("fjfdjdf"));
		
		
		
		
	}
}

