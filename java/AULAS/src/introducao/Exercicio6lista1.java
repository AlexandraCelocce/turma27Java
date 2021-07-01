package introducao;

import java.util.Scanner;

public class Exercicio6lista1 {

	public Exercicio6lista1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d, x1, x2, y1, y2;
		Scanner leia = new Scanner (System.in);
		
		
       System.out.println("Digite o valor de x1: ");
       x1 = leia.nextDouble();
       System.out.println("Digite o valor de x2: ");
        x2 = leia.nextDouble();        
        System.out.println("Digite o valor de y1: ");
        y1 = leia.nextDouble(); 
        System.out.println("Digite o valor de y2: ");
        y2 = leia.nextDouble();
		d = (Math.sqrt(Math.pow(x2-x1,2)) + (Math.pow ((y2-y1),2)));
		System.out.println("A distancia D é igual : " + d);
		
		
		
		

	}

}
