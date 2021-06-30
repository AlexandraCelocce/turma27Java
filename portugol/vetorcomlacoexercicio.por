programa
{
	
	funcao inicio()
	{
		cadeia nomeAlunos[4]
		inteiro notaAlunos [4]
		
		escreva ("BOLETIM \n\n")

	 para (inteiro i=0; i<4 ; i++) {

            escreva ("Digite o nome do aluno: ")
            leia (nomeAlunos[i])
            
            escreva ("Digite a nota do aluno: ")
            leia (notaAlunos[i])
            escreva ("\n\n")
	 }

	 para (inteiro i=0; i<4 ; i++) {

             se (notaAlunos[i] <= 5) {
  	       escreva ("Oi " + nomeAlunos[i] + " sua nota é: " + notaAlunos[i] + ". Ainda não, estude mais. \n")
  	
  	}
             senao {
             	  escreva ("Oi " + nomeAlunos[i] + " sua nota é: " + notaAlunos[i] + ". Parabéns você foi aprovado!!. \n")
             	
             	
             	}
             }
	 	
	 	}
	 }

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 361; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */