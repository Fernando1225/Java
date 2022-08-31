package PareImpar;

import java.util.Scanner;

public class PruebaEntero {

	 public static void main(String[] args) {
		 
         System.out.println("Ingrese un numero:");
         
	     Scanner in = new Scanner(System.in);
	     

	     Entero e = new Entero(in.nextInt());

	        
	     System.out.println("El numero ingresado es: "+e.getNumero());
	     System.out.println("El cuadrado de " + e.getNumero() + " es: " + e.cuadrado());
	     
	     //e.ParImpar();
	     
	     if (e.ParImpar()>0){
	    	 System.out.println("El numero "+e.getNumero()+" es par");
	        }	
	        else {
	            System.out.println("El numero "+e.getNumero()+" es impar");
	        }
	     System.out.println("El factorial de " + e.getNumero() + " es: " + e.factorial());
	        	     
	        
	     if (!e.primo()){
	    	 System.out.println("El numero "+e.getNumero()+" no es primo");
	        }
	     	else {
	            System.out.println("El numero "+e.getNumero()+" es primo");
	        }
         in.close();
	    }
}