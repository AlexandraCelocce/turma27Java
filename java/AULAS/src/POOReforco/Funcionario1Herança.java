package POOReforco;

//extends cria herança

public class Funcionario1Herança extends PessoaHerança {
	
	private String departamento;
	
	//construtor                 //vem da super classe     //da propria string funcionario
	public Funcionario1Herança (String nome, int matricula, String departamento) {
		//superclasse
		super(nome, matricula);
		this.departamento = departamento;
	
	}
     //sourse, getters and setters 
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}
