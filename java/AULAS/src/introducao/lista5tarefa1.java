package introducao;

import java.util.Scanner;

public class lista5tarefa1 {

	public lista5tarefa1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a, b, c, maior, local1, local2, menor;

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		//Passo 1: Entre com os 3 números
		System.out.println("Programa mostra qual MAIOR e MENOR dos 3 números ");

		System.out.print("Entre com o valor de 'a' primeiro número: ");
		a = entrada.nextFloat();

		System.out.print("Entre com o valor de 'b' segundo número: ");
		b = entrada.nextFloat();

		System.out.print("Entre com o valor de 'c' terceiro número: ");
		c = entrada.nextFloat();


		if((a > b) && (a> c) ){

		maior = a;
		local1= b;
		local2= c;

		}if((b > c) && (b > a) ){

		maior = b;
		local1 = c;
		local2 = a;

		}else{

		maior = c;
		local1 = a;
		local2 = b;

		}



		if (local1 < local2){

		menor = local1;
		}else{

		menor = local2;
		}
		System.out.println("O MAIOR número dos 3 digitados é " +maior);
		System.out.println("o MENOR dos 3 digitados é " +menor);
		}

		

	}


