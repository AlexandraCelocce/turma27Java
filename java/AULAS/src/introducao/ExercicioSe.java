package introducao;

import java.util.Scanner;

public class ExercicioSe {

	public ExercicioSe() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		int num = 0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("digite um numero inteiro:");
		num = leia.nextInt(); 
		if (num % 2 == 0 ) { 
		System.out.println (num + " é par \n");}
		
		else {
			System.out.println(num + " é impar \n");
		}
		System.out.println (" Fim do programa \n ");
		
	}

}
