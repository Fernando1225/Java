package tp6;

public abstract class Figura {
    
    /** Name of the figure */
    private String name;
    private String color;
    private Double coordenadas;
    
    /** Constructor of the figure with a name */
    public Figura() {
 
    	
    }
    
    public Figura(String name, String color, Double coordenadas) {
    	this.name = name;
    	this.color = color;
    	this.coordenadas = coordenadas;
    	

    }
    
    
    
  
    
    abstract public String obtenerColor();
    
    abstract public Figura imprimir();
    abstract public String getNombre();
    abstract public void cambiarColor(String color);
    abstract public void cambiarCoordenadas(Double coordenadas);
    abstract public Double obtenerCoordenadas();
    
    /** Calculates the area of a figure */
    abstract public double area();
    
    /** Indicates if the figure is regular or not */
    abstract public boolean isRegular();
    
}
