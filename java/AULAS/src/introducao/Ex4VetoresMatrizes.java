package introducao;


import java.util.Scanner;

public class Ex4VetoresMatrizes {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int valores[][] = new int [3][3];
		int soma = 0, diagonal=0;
		
		for(int linha=0;linha<3;linha++){
			for(int coluna=0;coluna<3;coluna++){
				System.out.printf("Digite um n�mero para primeira matriz linha"+linha+" e coluna "+coluna+": ");
				valores[linha][coluna] = leia.nextInt();
				
				if(linha==coluna) {
					diagonal = diagonal+valores[linha][coluna];
				}
			}
		}
		
		System.out.println("A soma da diagonal principal �: "+diagonal);
	}

}