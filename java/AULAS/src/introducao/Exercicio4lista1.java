package introducao;

import java.util.Scanner;

public class Exercicio4lista1 {

	public Exercicio4lista1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		 double a, b, c, r, s, d;
		 
		 Scanner leia = new Scanner (System.in);
		 
		 
		 System.out.println("Digite o valor de A: ");
		         a =  leia.nextInt();           
		         System.out.println("Digite o valor de B: ");
		          b = leia.nextInt();           
		         System.out.println("Digite o valor de C: ");
		          c = leia.nextInt();         
		          r = Math.pow(a+b, 2); 
		          s = Math.pow(b+c, 2); 
		          d = (r + s)/2; 
		        		
		          System.out.println("O valor é: "+d);
                  
		
		
		
		
		
	}

}
