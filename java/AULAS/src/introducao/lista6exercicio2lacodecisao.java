package introducao;

import java.util.Scanner;

public class lista6exercicio2lacodecisao {

	public lista6exercicio2lacodecisao() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		   float x, y, z;

		   System.out.printf("Digite um numero:\n ");
		    ("%f", & x) = scanf.nextFloat();
		    System.out.printf("Digite um numero:\n ");
		    ("%f", & y) = scanf.nextFloat();
		    System.out.printf("Digite um numero:\n ");
		    ("%f", & z) = scanf.nextFloat();

		    if (x<y&&y<z)
		    {
		    	System.out.printf("A ordem crescente é: %2.f %2.f %2.f ", x, y, z);
		    }
		    else if (x<z&&z<y)
		    {
		    	System.out.printf("A ordem crescente é: %2.f %2.f %2.f ", x, z, y);
		    }
		    else if (y<x&&x<z)
		    {
		    	System.out.printf("A ordem crescente é: %2.f %2.f %2.f ", y, x, z);
		    }
		    else if (y<z&&z<x)
		    {
		    	System.out.printf("A ordem crescente é: %2.f %2.f %2.f ", y, z, x);
		    }
		    else if (z<x&&x<y)
		    {
		    	System.out.printf("A ordem crescente é: %2.f %2.f %2.f ", z, x, y);
		    }
		    else
		    {
		        System.out.printf("A ordem crescente é: %2.f %2.f %2.f ", z, y, x);
		    }
		return 0;

		}
}
