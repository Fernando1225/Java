
/**
 * Triangle.java
 * 
 * (c) DIT-UC3M 2008
 * 
 */

package tp6;

public class Triangulo extends Figura {
	
	private Double lado1;
	private Double lado2;
	private Double lado3;
	private Double coordenadas;
	private String nombre;

	
	private String color;
	
	
	public Triangulo() {
		
	}
	
	public Triangulo(Double lado1, Double lado2, Double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.color = "White";
		this.coordenadas = 0.0;
		this.nombre = "Triangulo";

	}
	
	
	

	@Override
	public Figura imprimir() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cambiarColor(String color) {
		this.color = color;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cambiarCoordenadas(Double coordenadas) {
		this.coordenadas = coordenadas;
		// TODO Auto-generated method stub
		
	}

	@Override
	public double area() {
		
		Double calculo1 = (lado1+lado2+lado3)/2;
		Double calculo2 = (lado1+lado2+lado3)/2-lado1;
		Double calculo3 = (lado1+lado2+lado3)/2-lado2;
		Double calculo4 = (lado1+lado2+lado3)/2-lado3;
		Double resultado = calculo1*calculo2*calculo3*calculo4;
		resultado = Math.sqrt(resultado);
		
		// TODO Auto-generated method stub
		return resultado;
	}

	@Override
	public boolean isRegular() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String obtenerColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public Double obtenerCoordenadas() {
		// TODO Auto-generated method stub
		return coordenadas;
	}

}