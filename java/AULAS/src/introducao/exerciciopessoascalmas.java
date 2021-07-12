package introducao;

import java.util.Scanner;

public class exerciciopessoascalmas {

	public exerciciopessoascalmas() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int pessoasCalmas = 0 ;
int mulheresNervosas = 0;
int homensAgressivos = 0;
int outrosCalmos = 0;
int pessoasNervosasMaisde40anos = 0;
int pessoasCalmasMenosde18anos = 0; 
int idade;
char sexo = 0;
char fem = 'F';
char mas = 'M';
char op ='S';
char opcao = 0;
final int LIMITE = 150;
int contador = 1;
String nome;

Scanner leia = new Scanner (System.in); 

while (op == 'S'&& contador <= LIMITE) {
	
	System.out.println("Participante: "+contador);
	System.out.println("Digite a idade: ");
	idade = leia.nextInt();
	System.out.println("Digite: ");
	System.out.println("\n1 - Feminino \n2 - Masculino \n3 - Outros");
	sexo = leia.next().charAt(0);
	System.out.println("Selecione: ");
	System.out.println("1 - Pessoa calma \n2 - Pessoa nervosa \n3 - Pessoa agressiva");
	opcao = leia.next().charAt(0);
	
}
 System.out.println("Pessoas calmas: "+pessoasCalmas);
 if (opcao == 1){
	 
	 pessoasCalmas ++;
 }

if (sexo == 1 && opcao == 2) {
	
	mulheresNervosas++;
}
if (sexo == 2 && opcao == 3) {
	homensAgressivos++;
}
if (sexo == 3 && opcao == 1 ) {
	outrosCalmos++;
	
}

System.out.println("Continuar S/N: ");
op = leia.next().toUpperCase().charAt(0);
contador ++;
	

System.out.println("Pessoas calmas: "+pessoasCalmas);
System.out.println("Mulheres nervosas: "+mulheresNervosas);
System.out.println("Homens agressivos: "+homensAgressivos);
System.out.println("Outros calmos: "+pessoasCalmas);
System.out.println("Pessoas nervosas mais de 40 anos: "+pessoasNervosasMaisde40anos);
System.out.println("Pessoas calmas menos de 18 anos: "+pessoasCalmasMenosde18anos);


}
}

