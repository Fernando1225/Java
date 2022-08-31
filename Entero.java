package PareImpar;

public class Entero {

	private int numero;
	   //constructor de la clase Enteros
	    public Entero(int numero) {
	        super();
	        this.numero = numero;
	    }
	    public int getNumero() {
	        return numero;
	    }
	    public void setNumero(int numero) {
	        this.numero = numero;
	    }
	    //calcula el cuadrado de n
	    public long cuadrado(){
	        return numero*numero;
	    }

	    public  int ParImpar(){
	        int par = 0;
	        if ((getNumero() % 2) == 0){
	            return par+=1;
	        }
	        else {
	            return par;
	        }
	    }

	    public long factorial(){
	        int fact2=numero-1, fact=numero;
	        while (fact2>0){
	            fact*=fact2;
	            fact2-=1;
	        }
	        return fact;
	    }

	    public boolean primo(){
	        boolean num_primo = true;
	        int divisor = 2;
	        while ((num_primo) && (numero!=divisor)){
	            if ((numero % divisor)==0){
	                num_primo = false;
	            }

	            divisor+=1;
	        }
	        return num_primo;
	    }
	
}