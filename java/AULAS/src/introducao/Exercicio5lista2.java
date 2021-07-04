package introducao;

import java.util.Scanner;

public class Exercicio5lista2 {

	public Exercicio5lista2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double indicep = 0;
		System.out.println ("Indice de poluição: ");
		
		Scanner leia = new Scanner (System.in);
		indicep = leia.nextDouble();

		if (indicep<0.3){
			System.out.println ("Sua empresa está dentro dos conformes");

					
			} 
		else if (indicep >= 0.3 && indicep <= 0.4){
				System.out.println ("As empersas do grupo 1, precisam suspender suas atividades!");
				
				}
			else if (indicep > 0.4 && indicep <= 0.5){
					System.out.println ("As empresas do grupo 1 e 2, precisam suspender suas atividades!");
				
				
				}else{
				System.out.println("Todos os grupos precisam suspender suas atividades!");
				
				}
		}
	}


