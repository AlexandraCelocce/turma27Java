package introducao;

import java.util.Scanner;

	public class Ex1VetoresMatrizes {

		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			int valores[] = new int[5];
			int maior=0;
			
			for(int x=0;x<5;x++) {
				System.out.println("Digite um n�mero inteiro:");
				valores[x]=leia.nextInt();
			}
			
			for(int x=0;x<5;x++) {
				System.out.printf("N�mero: %d\n",valores[x]);
				
				if(valores[x]>maior) {
					maior=valores[x];
				}
			}

			System.out.println("O maior n�mero digitado foi: "+maior);

			

		}

	}

