programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real n1, n2, n3, n4, rN1, rN2, rN3, rN4

		escreva("Digite o primeiro numero: ")
		leia(n1)
          escreva("\n Digite o segundo numero: ")
		leia(n2)
		escreva("\n Digite o terceiro numero: ")
		leia(n3)
		escreva("\n Digite o quarto numero: ")
		leia(n4)
		limpa()

         rN1 = mat.potencia(n1,2)   
         rN2 = mat.potencia(n2,2)   
         rN3 = mat.potencia(n3,2)   
         rN4 = mat.potencia(n4,2)   

         se(rN3 >= 1000){
          escreva ("O valor de ", n3 , "ao quadrado é igual a: ", rN3)        	
         	
         	}senao{
         		escreva( 
         	     " O valor de ", n1, " ao quadrado é igual a: ", rN1, "\n" ,         		
         	     " O valor de " , n2, " ao quadrado é igual a : ", rN2, "\n" ,
         		" O valor de ", n3, " ao quadrado é igual a: ", rN3, "\n", 
         		"O valor de ", n4, " ao quadrado é igual a: ", rN4, "\n")
         		
         		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 495; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */