 /*Implemente un programa que indique si una palabra es un palíndromo. Una palabra es palidromo si se 
lee igual de izquierda a derecha que de derecha a izquierda.*/

package tp2;

import java.util.Scanner;
public class ej3 {
	public static void main(String[] args) {
		
		System.out.println("Ingrese palabra");
		Scanner cargar = new Scanner(System.in);
		
		String palabra;
		char [] character;
		int l=0,r;          //left, right

		
		palabra = cargar.nextLine();
		character = palabra.toCharArray();      //Separa todos los caracteres de la palabra y los guarda en un array
		
		r=palabra.length()-1; 
		
		while (l < r) {
			if (character[l] == character[r]) {
				r --;
				l ++;
			}
			else {
				break;
			}
			
		}
		if (l==r) {
			System.out.println("La palabra '"+palabra+"' es un palindromo.");
		}
		else {
			System.out.println("La palabra '"+palabra+"' NO es un palindromo."); 
		}
	}

}
