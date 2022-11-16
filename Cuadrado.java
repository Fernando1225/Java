package tp6;

public class Cuadrado extends Rectangulo {

    /** Square vertexes */
    private Double ladoMayor;
    private Double ladoMenor;
    private String color;
	private Double coordenadas;
	private String nombre;



    
    
    public Cuadrado() {
    	
    }
      
    /** Constructor with name and vertexes */
    public Cuadrado(Double ladoMayor, Double ladoMenor) {
    	this.ladoMayor = ladoMayor;
    	this.ladoMenor = ladoMenor;
    	this.color = "White";
		this.coordenadas = 0.0;
		this.nombre = "Cuadrado";


    }

    /** Private method to calculate the vertexes for the other diagonal*/
    @Override
	public void cambiarCoordenadas(Double coordenadas) {
		this.coordenadas = coordenadas;
		// TODO Auto-generated method stub
		
	}
    
    /** Method implementation to calculate the area */  
    public double area() {
    	return ladoMenor * ladoMayor;
    }
    
    
    public void cambiarColor(String color) {
		this.color = color;
		// TODO Auto-generated method stub
		
	}
  
    /** Implementation of the abstract method to calculate if the figure is regular. */
    public boolean isRegular() {
      return false;
    }
  
    /** Returns a representative string of the square. */
    public String toString() {
      return null;
    }
    
    public String obtenerColor() {
		return color;
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
