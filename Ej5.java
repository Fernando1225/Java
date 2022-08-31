//5. Leer el nombre y sueldo de 5 empleados y mostrar el nombre y sueldo del empleado que más gana y
//        el sueldo promedio.

package Empleado;

import java.util.Scanner;

public class Ej5 {
    static final int N = 5;

    public static void main(String[] args) {
        int sueldo_promedio =0;
        Scanner in = new Scanner(System.in);
        Empleado empleado[] = new Empleado[N];
        double mayor_salario = 0, pos=0;
        for (int i=0; i<N; i++){
            Empleado em = new Empleado();
            System.out.println("Ingrese el nombre del empleado "+(i+1)+":");
            em.setNombre(in.nextLine());
            System.out.println("Ingrese el sueldo del empleado "+em.getNombre()+":");
            em.setSueldo(Double.valueOf(in.nextLine()));
            sueldo_promedio += em.getSueldo("pesos");


            if (em.getSueldo("pesos")>mayor_salario){
                    mayor_salario = em.getSueldo("pesos");
                    pos = i;

            }
            empleado[i]=em;
        }
        System.out.println("El empleado que mas gana es: "+ empleado[(int) pos]);
        System.out.println("El sueldo promedio es: "+ (sueldo_promedio/N));
        in.close();
    }
}