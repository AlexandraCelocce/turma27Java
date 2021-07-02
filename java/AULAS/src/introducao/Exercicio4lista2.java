package introducao;

import java.util.Scanner;

public class Exercicio4lista2 {

	public Exercicio4lista2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     int num;
         int posi, neg;
         Scanner leia = new Scanner (System.in);
	     
         System.out.println( "Digite um numero: ");
		num = leia.nextInt();
		System.out.println ("\n");

      if ( num % 2 == 0 )  {
	    	 System.out.println(num + " é par." );
}
	     else {
	    	 System.out.println (num + " é impar.");
	  	} 
	  if (num > 0){
	
		  System.out.println (" Um numero positivo");
	  }
	  else {

	  System.out.println(" Um numero negativo");
      }	
	  
	  System.out.println("\n \n Fim do programa");
	}

}
