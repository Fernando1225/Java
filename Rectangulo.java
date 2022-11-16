package tp6;

public class Rectangulo extends Figura{
	
	private Double ladoMayor;
	private Double ladoMenor;
	private Double resultado;
	private String color;
	private Double coordenadas;
	private String nombre;

	
	
	public Rectangulo() {
		
	}
	
	public Rectangulo(Double ladoMayor, Double ladoMenor) {
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.color = "White";
		this.coordenadas = 0.0;
		this.nombre = "Rectangulo";

	}
	
	
	public Double calcularArea() {
		return ladoMenor * ladoMayor;
	}
	
	public Double calcularPerimetro() {
		return (2*ladoMenor+2*ladoMayor);
	}
	
	
	public void cambiarTamanio(Double factorEscala) {
		this.ladoMayor *= factorEscala;
		this.ladoMenor *= factorEscala;
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
		return ladoMenor * ladoMayor;
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
