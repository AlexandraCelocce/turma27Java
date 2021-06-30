programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		/*encontram no conjunto dos números de 1 até 500.

ENQUANTO

1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.  */

         inteiro valorusuario=10

         escreva ("Insira o valor: ")
         leia (valorusuario)

         enquanto (valorusuario>0)
         { limpa ()
         	 escreva ("CONTAGEM REGRESSIVA...",valorusuario)
         	 valorusuario = valorusuario -1 
         	 Util.aguarde(1000)
         	
         	}
         	limpa ()
         	escreva ("Booom!!!!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 759; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */