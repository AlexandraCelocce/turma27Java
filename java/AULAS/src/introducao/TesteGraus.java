package introducao;

public class TesteGraus {

	public TesteGraus() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String nome;
		double F,C,K;
		
		nome = "Ale";
		F = 500;
		
		C = ((F -32) / (1.8));
		K = C + 273;
		  
				System.out.println("Ol�, " + nome + "! A temperatura de hoje �: " + C+"�C e " +K+"�K");
				
				System.out.printf("Ol� %s A temperatura de hoje �: %.2f �C e %.2f �K \n", nome, C, K);
				
	
		}
	}



