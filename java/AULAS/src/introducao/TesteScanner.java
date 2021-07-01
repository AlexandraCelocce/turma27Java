package introducao;

import java.util.Scanner;

public class TesteScanner {

	public TesteScanner() {
	
	}

	public static void main(String[] args) {
	
		
		Scanner leia = new Scanner (System.in); 
		int a, b, soma;
		System.out.println("Digite valor de a: ");
	   a = leia.nextInt();
	   System.out.println("Digite valor de b: ");
	   b = leia.nextInt();
	   soma = a + b;
	   System.out.println("O resultado é: ");
	   System.out.println(soma);
	 

	}

}
