package introducao;

import java.util.Scanner;

public class Exercicio1lista1 {

	public Exercicio1lista1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dias;
		int meses;
		int anos;
		int idade;
		int total;

		Scanner leia = new Scanner (System.in);  
		
          System.out.println("Informe os dados abaixo:  \n");
          System.out.println("Digte o dia: "); 
          dias = leia.nextInt();
		 System.out.println("Digite o mês: "); 
		 meses = leia.nextInt();
		 System.out.println("Digite o ano de nascimento: "); 
		 anos = leia.nextInt();
		
	idade = 2021 - anos; 
		total = idade * 365;
		 System.out.println( total + " dias na Terra.");
		
		
		
		
	}

}
