package introducao;

import java.util.Scanner;

public class testeerro {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int valor;
		String nome [] = new String [3];
		
		try {
		System.out.println("Digite a posição do vetor de 0 a 2 para cadastro do nome: ");
		valor = leia.nextInt();
		System.out.println("Digite o nome da pessoa em questão: ");
		nome [valor] = leia.next();
		
		System.out.println("Posição escolhida" +valor + " nome resgistrado: "+nome[valor]);
		
		} catch (java.lang.ArrayIndexOutOfBoundsException erro) {
			System.out.println("Valor ou posição incorreta");
			
			
		}catch (java.util.InputMismatchException erro) {
			System.out.println("Por favor, digite um numero valido");
			
			
		}
	}

}
