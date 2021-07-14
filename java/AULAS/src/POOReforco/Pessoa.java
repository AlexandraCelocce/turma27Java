package POOReforco;

public class Pessoa {
	
	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	
	//contrutor = criar pq é privado. Apenas os metodos da classe pessoa podera acessar
	
	public Pessoa (String primeiro, String meio, String ultimo) {
	
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomesDoMeio = meio; 
		
		//Construtor sempre tera o mesmo nome da classe (ex: pessoa) e os mesmos parametros (ex: prim, meio, ult)
		// contrutores não criam nem retornam objetos. O "new" cria novo objeto. 
		//Construtor apenas executa o objeto. 
	}

	 public String getNomeCompleto () {
		 
		 String nomeCompleto = primeiroNome+" "+nomesDoMeio+" "+ultimoNome;
		 return nomeCompleto;
		 
	 }
	 
	
}
