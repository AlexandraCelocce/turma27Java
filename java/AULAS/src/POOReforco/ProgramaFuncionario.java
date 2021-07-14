package POOReforco;

public class ProgramaFuncionario {

	
	public static void main (String args []) {
		
		Funcionario funcionario1 = new Funcionario ();
		
		funcionario1.setNome("Leonardo");
		funcionario1.setSalario(2500);

		
		System.out.println(funcionario1.getNome());
		System.out.println(funcionario1.getSalario());
		
	}
}
