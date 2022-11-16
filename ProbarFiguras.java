package tp6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProbarFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Figura> figuras = new ArrayList<>();
		
		
		Figura a = new Rectangulo(20.0, 10.0);
		figuras.add(a);
		Figura b = new Cuadrado(21.0, 21.0);
		figuras.add(b);
		Figura c = new Elipse(18.0, 14.0);
		figuras.add(c);
		Figura d = new Triangulo(17.0, 24.0, 32.0);
		figuras.add(d);
		Figura e = new Circulo(20.0);
		figuras.add(e);
		
		
		Iterator<Figura> iterator = figuras.iterator();
		while(iterator.hasNext()) {
			Figura figura = iterator.next();
			System.out.println("Figura: "+figura.getNombre()+", Area: "+figura.area());
			figura.cambiarColor("Azul");
		}
		
		System.out.println();
		
		iterator = figuras.iterator();
		while(iterator.hasNext()) {
			Figura figura = iterator.next();
			System.out.println("Figura: "+figura.getNombre()+", Color: "+figura.obtenerColor());
			figura.cambiarCoordenadas(8.3);
		}
		
		System.out.println();
		
		iterator = figuras.iterator();
		while(iterator.hasNext()) {
			Figura figura = iterator.next();
			System.out.println("Figura: "+figura.getNombre()+", Coordenadas: "+figura.obtenerCoordenadas());
		}
		
		
		
		
		
		
		
//		System.out.println(a.area());
//		System.out.println(b.area());
//		System.out.println(c.area());
//		System.out.println(d.area());
//		System.out.println(e.area());
//		System.out.println(e.obtenerColor());
//		e.cambiarColor("Blue");
//		System.out.println(e.obtenerColor());
		

	}

}
