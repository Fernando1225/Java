//5. Leer el nombre y sueldo de 5 empleados y mostrar el nombre y sueldo del empleado que más gana y
//        el sueldo promedio.

package Empleado;

import java.util.Scanner;

public class PruebaCargarEmpleados {
//    static final int N = 5;

    public static void main(String[] args) throws EmpleadoException {
    	EmpleadoService empleados = new EmpleadoService();
    	empleados.generar_EmpleadoService();
    	
    	try {
    		Empleado empleado1 = new Empleado("Juan", 255);
    		empleados.agregar(empleado1);
    		Empleado empleado2 = new Empleado("Crys", 22);
    		empleados.agregar(empleado2);
    		Empleado empleado3 = new Empleado("Martin", 55);
    		empleados.agregar(empleado3);
    		Empleado empleado4 = new Empleado("Lucia", 88);
    		empleados.agregar(empleado4);
    		Empleado empleado5 = new Empleado("Marcos", 150);
    		empleados.agregar(empleado5);
    	} catch (StringException e) {
    		System.out.println(e);
    	} catch (EnteroPositivoException e) {
    		System.out.println(e);
    	} catch (EmpleadoException e) {
    		System.out.println(e);
    	}
    	
    	System.out.println("Lista de empleados: "+empleados.getEmpleados());

    	
    	Scanner num = new Scanner(System.in);
    	System.out.println("Ingrese el numero del legajo del empleado que quiere eliminar:");
    	Integer eliminar = num.nextInt();
    	
    	
    	System.out.println("Empleado eliminado: "+empleados.eliminarEmpleado(eliminar).getNombre());
    	
    	System.out.println("Sueldo promedio: "+empleados.sueldoPromedio());
    	
    	System.out.println("Mayor sueldo: "+empleados.mayorSueldo().getNombre());
    	
    	System.out.println("Lista de empleados: "+empleados.getEmpleados());
   
    	
    	
    }
//        int sueldo_promedio =0;
//        Scanner in = new Scanner(System.in);
//        Empleado empleado[] = new Empleado[N];
//        double mayor_salario = 0, pos=0;
//        for (int i=0; i<N; i++){
//            Empleado em = new Empleado();
//            System.out.println("Ingrese el nombre del empleado "+(i+1)+":");
//            em.setNombre(in.nextLine());
//            System.out.println("Ingrese el sueldo del empleado "+em.getNombre()+":");
//            em.setSueldo(Double.valueOf(in.nextLine()));
//            sueldo_promedio += em.getSueldo("pesos");
//
//
//            if (em.getSueldo("pesos")>mayor_salario){
//                    mayor_salario = em.getSueldo("pesos");
//                    pos = i;
//
//            }
//            empleado[i]=em;
//        }
//        System.out.println("El empleado que mas gana es: "+ empleado[(int) pos].getNombre()+" ($"+empleado[(int) pos].getSueldo(null)+")");
//        System.out.println("El sueldo promedio es: "+ (sueldo_promedio/N));
//        in.close();
//    }
}