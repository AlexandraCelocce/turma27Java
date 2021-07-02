package introducao;

import java.util.Scanner;

public class Exercicio3lista2 {

	public Exercicio3lista2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double n1, n2, n3, n4, rN1, rN2, rN3, rN4;

		Scanner leia = new Scanner (System.in);
		
		 System.out.println("Digite o primeiro numero: ");
		n1 = leia.nextDouble();
		 System.out.println("\n Digite o segundo numero: ");
		n2 = leia.nextDouble();
		 System.out.println("\n Digite o terceiro numero: ");
		n3 = leia.nextDouble();
		 System.out.println("\n Digite o quarto numero: ");
		n4 = leia.nextDouble();
	

         rN1 = Math.pow(n1,2);   
         rN2 = Math.pow(n2,2);   
         rN3 = Math.pow(n3,2);  
         rN4 = Math.pow(n4,2); 

         if(rN3 >= 1000){
          System.out.printf("O valor de ", +n3, "ao quadrado é igual a: ", rN3);     	
         	
         	}else{
         		 System.out.printf(" O valor de "+ n1 + " ao quadrado é igual a: " + rN1  + "\n");        		
         		 System.out.printf (" O valor de "  + n2 + " ao quadrado é igual a : " + rN2 + "\n");
         		System.out.printf(" O valor de "+ n3 + " ao quadrado é igual a: " + rN3 + "\n");  
         		System.out.printf("O valor de " + n4 + " ao quadrado é igual a: " + rN4 + "\n");
         		
         		}
		
		
	}

}
