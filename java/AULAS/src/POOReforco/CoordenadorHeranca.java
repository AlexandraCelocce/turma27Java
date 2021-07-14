package POOReforco;

public class CoordenadorHeranca extends PessoaHerança {

	private String cursoCoordenado;
	
	public CoordenadorHeranca (String nome, int matricula, String cursoCoordenado) {
		
		super(nome, matricula);
		this.cursoCoordenado = cursoCoordenado;
		
	}

	public String getCursoCoordenado() {
		return cursoCoordenado;
	}

	public void setCursoCoordenado(String cursoCoordenado) {
		this.cursoCoordenado = cursoCoordenado;
	}
	
	
}
