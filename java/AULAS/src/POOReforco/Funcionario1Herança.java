package POOReforco;

//extends cria heran�a

public class Funcionario1Heran�a extends PessoaHeran�a {
	
	private String departamento;
	
	//construtor                 //vem da super classe     //da propria string funcionario
	public Funcionario1Heran�a (String nome, int matricula, String departamento) {
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
