programa
{
	
	funcao inicio()
	{

		  cadeia codigoFuncionario
		  inteiro numeroHorasTrabalhadas = 0
		  real excesso = 0.0
      const real VALOR_HORA_TRABALHADA = 10.00 
      const real VALOR_HORA_EXCEDENTE = 20.00
      const inteiro LIMITE_HORAS = 50
		  real salarioTotal = 0.00, salarioExcedente = 0.00


          escreva("Digite o codigo do funcionario: ")
          leia (codigoFuncionario)

          escreva("Digite o numero de horas trabalhadas: ")
          leia (numeroHorasTrabalhadas)

		se (numeroHorasTrabalhadas <= LIMITE_HORAS){ 
          salarioTotal =numeroHorasTrabalhadas * VALOR_HORA_TRABALHADA
          
		  
	}senao  {

		excesso = (numeroHorasTrabalhadas - LIMITE_HORAS)*VALOR_HORA_EXCEDENTE 
		salarioTotal = LIMITE_HORAS*VALOR_HORA_TRABALHADA + excesso
		
		
		}
	
	
	escreva("Salario total:  ",salarioTotal)


	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 805; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */