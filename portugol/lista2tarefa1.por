programa
{
	
	funcao inicio()
	{
		 
		  inteiro ptomate = 0
	       inteiro excessos = 0
	 const inteiro VALORMULTA = 4
	 const inteiro LIMITEPESO = 50
	       inteiro total

	 
escreva("Digite o peso dos tomates: ")
          leia (ptomate)

		se (ptomate <= LIMITEPESO){ 
          escreva("Peso dos tomates: ",+ptomate,"\n") 
          escreva("Peso extra: ",+excessos,"\n") 
          escreva("valor multa: ",+excessos,"\n") 
		  
	}senao {

		excessos = (ptomate - LIMITEPESO)

     escreva ("excesso de peso: ",+excessos, "\n")		
		

		total = (excessos * VALORMULTA)
		escreva ("Valor multa: "+total)
		
		
		
		}
	



	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 433; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */