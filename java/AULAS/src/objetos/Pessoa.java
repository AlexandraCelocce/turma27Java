package objetos;

public class Pessoa {

		//atributos
		String nome ;
	    public char sexo;
		public int  anoNascimento;
		
		
		public int  calcularIdade () {
			return (2021 - anoNascimento);
		}
		
		int  calcularidadep�blica (int anoAtual) {
			return (anoAtual - anoNascimento);
		}
		
		
	}