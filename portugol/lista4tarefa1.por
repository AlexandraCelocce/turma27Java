programa
{
	
	funcao inicio()
	{

 /*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/
	
		inteiro valor[5], i = 0 , maior = 0 , menor = 0 , maiorPosicao = 0 , menorPosicao = 0 

escreva ("Informe 5 valores abaixo: \n")
		
  para(i=0; i<5; i++){
    escreva(" Entre com um numero: ")
    leia (valor[i])
    
    se(i == 0){
      maior = valor [i]
      menor = valor [i] 
      maiorPosicao = i
      menorPosicao = i
    }
    se(valor [i]> maior){ 
      maior = valor [i] 
      maiorPosicao = i 
    }
    se(valor [i]< menor){
      menor = valor [i]
      menorPosicao = i
    }
  }
   escreva("\n O maior valor é: ", maior, " e está na ", maiorPosicao, "º posição.")
   
   escreva("\n O menor valor: ", menor , " e está na " , menorPosicao , "º posição.")
  
   
   	} 

   
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 676; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */