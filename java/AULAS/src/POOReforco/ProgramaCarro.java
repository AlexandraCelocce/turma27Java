package POOReforco;

public class ProgramaCarro {
	
	public static void main (String args []) {
		
	Carro meuCarro = new Carro ();
	meuCarro.cor = "Dourado";
	meuCarro.modelo = "Honda Fit";
	meuCarro.velocidadeAtual = 0;
	meuCarro.velocidadeMaxima = 80; 
		
		meuCarro.liga();
		
		meuCarro.acelerador(20);
		System.out.println(meuCarro.velocidadeAtual);
		meuCarro.pegaMarcha();
	}

}
