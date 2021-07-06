programa
{
	
	funcao inicio()
	{
/*2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação. */


   inteiro i,soma=0 , soma6=0 , jogadas[10]

   real media = 0.0 

   para(i=0;i<10;++i){

       inteiro n

       escreva("Informe o valor: ")

       leia(n)

       media+=n

       jogadas[i]=n

       se(n==6)

           ++soma6

   }

   media/=10

   para(i=0;i<10;++i){

       se(jogadas[i]>media)

           ++soma

   }

   escreva( soma," números são maiores que média aritmética dos 10 lançamentos ", (soma6*100)/10, " porcento das jogadas foram", media)

}
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 800; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */