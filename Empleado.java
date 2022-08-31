package Empleado;

public class Empleado {

    //atributos
    private String nombre;
    private Double sueldo;

    //constructor
    public Empleado() {

    }

    public Empleado(String nombre, Double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSueldo(String moneda) {
        return  sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }


}