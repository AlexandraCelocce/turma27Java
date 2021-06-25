programa
{
	
	funcao inicio()
	{
		real indicep
		escreva ("Indice de poluição: ")
		leia (indicep)

		se (indicep < 0.3){
		escreva ("Sua empresa está dentro dos conformes")

					
			} 
			senao se (indicep >= 0.3 e indicep <= 0.4){
				escreva ("As empersas do grupo 1, precisam suspender suas atividades!")
				
				
				}
				senao se (indicep > 0.4 e indicep <= 0.5){
				escreva ("As empersas do grupo 1 e 2, precisam suspender suas atividades!")
				
				
				}senao{
				escreva ("Todos os grupos precisam suspender suas atividades!")
				
				
				}
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 370; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */