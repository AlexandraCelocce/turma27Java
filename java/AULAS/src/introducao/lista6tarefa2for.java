package introducao;

public final class lista6tarefa2for {

	public lista6tarefa2for() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int par=0, num = 0 , i;
		
		for (i=1; i<=10; i++) { 

			System.out.printf("\n Informe numero: ");
			scanf("%d" , num); 

		if (num % 2 == 0) { 
		par=par+1; 

		}

		}

		System.out.printf("Pares: %d\n", par); 

		System.out.printf("Impares: %d", 1-par); 

		System.out.println("\n");
	}

	private static void scanf(String string, int num) {
		// TODO Auto-generated method stub
		
	}

}
