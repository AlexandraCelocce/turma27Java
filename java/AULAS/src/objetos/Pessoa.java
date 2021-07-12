package objetos;

public class Pessoa {

		//atributos
		String nome ;
	    public char sexo;
		public int  anoNascimento;
		
		
		public int  calcularIdade () {
			return (2021 - anoNascimento);
		}
		
		int  calcularidadepública (int anoAtual) {
			return (anoAtual - anoNascimento);
		}
		
		
	}