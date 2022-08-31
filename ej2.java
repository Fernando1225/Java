/*Escriba un programa que lea tres números y si el primero es positivo calcule el producto de los otros
dos, en otro caso calcule la suma. Pregunte al usuario si desea volver a hacerlo.
Para ingresar los números desde teclado utilice:
BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
String texto = t.readLine();
int numero = Integer.parseInt(texto); //convierte un String a int
Scanner in = new Scanner(System.in); //otra formade leer desde el teclado
String texto = in.nextLine();        // usando la clase Scanner*/

package ejercicios;

import java.util.Scanner;
public class ej2 {
public static void main(String[] args) {
char condicional ='y';
while (condicional == 'y') {
    Scanner cargar = new Scanner(System.in);
    int n1, n2, n3, resultado;
    System.out.println("Ingrese un numero");
    n1 = cargar.nextInt();
    System.out.println("Ingrese otro numero");
    n2 = cargar.nextInt();
    System.out.println("Ingrese otro numero");
    n3 = cargar.nextInt();


    if (n1 >= 0) {
        resultado = n2 * n3;
        System.out.println("El producto es: " + resultado);
    } else {
        resultado = n2 + n3;
        System.out.println("La suma es: " + resultado);
    }
    Scanner condicion = new Scanner(System.in);
    System.out.println("Desea volver a hacerlo? y/n");
    condicional = condicion.next().charAt(0);
    System.out.println(condicional);
}
}
}