/*4. Considere lo siguiente:
public class PruebaArrays{
public static void main(String[] args) {
int[] numeros = {4,2,3,8,1};
}
}
Escribir un método que imprima en pantalla: cuantos números hay en el array números, cual es el mayor
y cual es el promedio de todos los números. Devuelva los números ordenados de menor a mayor y a la
inversa.
*/

package tp2;

import java.util.Arrays;
import java.util.Collections;


public class ej4 {
	public static void main(String[] args) {
		
		//"numeros" es el nombre del array.
		Integer [] numeros =  {4, 2, 3, 8, 1};
		
		
		
		//*Muestra cuantos numeros hay en el array.
		
		System.out.println("Hay "+numeros.length+" numeros en el array.");
		
		int mayor = 0;
		int valores = 0;
		int i =0;
		
		//Determina el valor mayor y el promedio.
		for (i = 0; i < numeros.length; i++) {
		
			if (numeros[i]>mayor) {
				mayor = numeros[i];
			}
			valores += numeros[i]; 
			
		}
		
		
		int promedio = valores/numeros.length;
		
		System.out.println("El numero mayor es: "+mayor);
		System.out.println("El promedio de todos los numeros es: "+promedio);
		
		
		//Ordena el array de forma ascendente.
		Arrays.sort(numeros);
		
		int k =0;
		
		System.out.println("Valores ordenados de menor a mayor: ");
		while (k<numeros.length) {
			System.out.println(numeros[k]);
			k++;
		}
		
		//Ordena el array de forma descendente.
		Arrays.sort(numeros, Collections.reverseOrder());
		
		 k =0;
		
		System.out.println("Valores ordenados de mayor a menor: ");
		while (k<numeros.length) {
			System.out.println(numeros[k]);
			k++;
		}
		
			
		
	}

}