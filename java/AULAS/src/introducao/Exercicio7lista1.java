package introducao;

import java.util.Scanner;

public class Exercicio7lista1 {

	public Exercicio7lista1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double a,b,c,d,t,f,x,y;
		Scanner leia = new Scanner (System.in);  
		
		  System.out.println("Qual o valor de x e y \n \n");
	     
		  System.out.println("Informe o valor de a: ");
		  a = leia.nextDouble() ;
	     System.out.println("Informe o valor de b: ");
	     b =  leia.nextDouble();
	     System.out.println("Informe o valor de c: ");
	     c =  leia.nextDouble();
	     System.out.println("Informe o valor de d: ");
	     d = leia.nextDouble();
	     System.out.println("Informe o valor de e: ");
	     t =  leia.nextDouble();
	     System.out.println("Informe o valor de f: ");
	     f =  leia.nextDouble();
	    
	     
	     x = ((c*t)-(b*f)/(a*t)-(b*d));
	     y = ((a*f)-(c*d)/(a*t)-(b*d));
	     
	     
	     System.out.println(" \n X equivale a:  "+x);
	     System.out.println(" \n Y equivale a: "+y);
		
		
		
	}

}
