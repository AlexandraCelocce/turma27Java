package POOReforco;

public class PessoaHeran�a {
      private String nome;
      private int matricula;
 
 //lembrando: construtor tem o mesmo nome que minha classe!
      
 public PessoaHeran�a (String nome, int matricula) {
	 this.nome = nome;
	 this.matricula = matricula;  
 }
    //forma de encapsular

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getMatricula() {
	return matricula;
}

public void setMatricula(int matricula) {
	this.matricula = matricula;
}
 
 
 
}
