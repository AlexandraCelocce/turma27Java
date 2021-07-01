package introducao;

import java.util.Scanner;

public class Exercicio5lista1 {

	public Exercicio5lista1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		{
			double nota1, nota2, nota3;
			double media;
			
			Scanner leia = new Scanner (System.in); 
			
			System.out.println("Media anual \n" );
			System.out.println("Nota do primeiro bimenstre: \n" );
			nota1 = leia.nextDouble();

					System.out.println("Notas do segundo bimestre: \n");
					nota2= leia.nextDouble();

					System.out.println("Notas do terceiro bimestre: \n");
					nota3= leia.nextDouble();

	          media = (2*nota1 + 3*nota2 + 5*nota3)/10;
	          System.out.println("A media equivale a: "+ media);
	         
		}}}

