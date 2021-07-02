package introducao;

import java.util.Scanner;

public class Exercicio1lista2 {

	
	public static void main(String[] args) {
		           int ptomate = 0;
			       int excessos = 0;
			 final int VALORMULTA = 4;
			 final int LIMITEPESO = 50;
			       int total;
			       Scanner leia = new Scanner (System.in);

		System.out.println("Digite o peso dos tomates: ");
		ptomate =  leia.nextInt();

				if (ptomate <= LIMITEPESO){ 
					System.out.println("Peso dos tomates: "+ptomate);
					System.out.println("Peso extra: "+excessos); 
					System.out.println("valor multa: "+excessos); 
				  
			}else {

				excessos = (ptomate - LIMITEPESO);

				System.out.printf("excesso de peso: ",excessos, "\n");	
				

				total = (excessos * VALORMULTA);
				System.out.printf("Valor multa: ",total);
				}
				
	
	}
	}

