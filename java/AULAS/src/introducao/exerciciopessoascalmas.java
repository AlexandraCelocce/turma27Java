import java.util.Scanner;

package introducao;

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
char sexo;
char fem = 'F';
char mas = 'M';
char op ='S';
char opcao ;
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
	
	System.out.println("Continuar S/N: ");
	op = leia.next().toUpperCase().charAt(0);
	contador ++;
}





	}

}
