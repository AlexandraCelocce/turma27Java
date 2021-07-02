package introducao;

import java.util.Scanner;

public class Exercicio2lista2 {

	public Exercicio2lista2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int codigoFuncionario;
		    int numeroHorasTrabalhadas = 0;
		    double excesso = 0.0;
      final double VALOR_HORA_TRABALHADA = 10.00; 
      final double VALOR_HORA_EXCEDENTE = 20.00;
      final int LIMITE_HORAS = 50;
		    double salarioTotal = 0.00, salarioExcedente = 0.00;
            Scanner leia = new Scanner (System.in);

          System.out.println("Digite o codigo do funcionario: ");
          codigoFuncionario = leia.nextInt();

          System.out.println("Digite o numero de horas trabalhadas: ");
          numeroHorasTrabalhadas = leia.nextInt();

		if (numeroHorasTrabalhadas <= LIMITE_HORAS){ 
          salarioTotal =numeroHorasTrabalhadas * VALOR_HORA_TRABALHADA;
          
		  
	}else  {

		excesso = (numeroHorasTrabalhadas - LIMITE_HORAS)*VALOR_HORA_EXCEDENTE;
		salarioTotal = LIMITE_HORAS*VALOR_HORA_TRABALHADA + excesso;
		
		
		}
	
	
	System.out.println("Salario total:  "+salarioTotal);


	}

}
