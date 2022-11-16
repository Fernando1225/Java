package tp6;

public class Elipse extends Figura{
	
	private Double radioMayor;
	private Double radioMenor;
	private String color;
	final double PI = 3.14;
	private Double coordenadas;
	private String nombre;


	
	
	
	public Elipse() {
		
	}
	
	public Elipse(Double radioMayor, Double radioMenor) {
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
		this.color = "White";
		this.coordenadas = 0.0;
		this.nombre = "Elipse";


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
		return PI*(radioMayor*radioMenor);
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
