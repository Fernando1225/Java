package tp6;

public class Circulo extends Elipse{
	
	private Double radio;
	private String color;
	private Double coordenadas;
	private String nombre;

	
	
	final double PI = 3.14;
	
	
	public Circulo() {
		
	}
	
	public Circulo(Double radio) {
		this.radio = radio;
		this.color = "White";
		this.coordenadas = 0.0;
		this.nombre = "Circulo";

	}
	
	public double area() {
		return PI*(radio*radio);
	}
	
	public void cambiarColor(String color) {
		this.color = color;
		// TODO Auto-generated method stub
		
	}
	
	public String obtenerColor() {
		return color;
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void cambiarCoordenadas(Double coordenadas) {
		this.coordenadas = coordenadas;
		// TODO Auto-generated method stub
		
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
