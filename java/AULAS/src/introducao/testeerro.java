package introducao;

import java.util.Scanner;

public class testeerro {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int valor;
		String nome [] = new String [3];
		
		try {
		System.out.println("Digite a posi��o do vetor de 0 a 2 para cadastro do nome: ");
		valor = leia.nextInt();
		System.out.println("Digite o nome da pessoa em quest�o: ");
		nome [valor] = leia.next();
		
		System.out.println("Posi��o escolhida" +valor + " nome resgistrado: "+nome[valor]);
		
		} catch (java.lang.ArrayIndexOutOfBoundsException erro) {
			System.out.println("Valor ou posi��o incorreta");
			
			
		}catch (java.util.InputMismatchException erro) {
			System.out.println("Por favor, digite um numero valido");
			
			
		}
	}

}
