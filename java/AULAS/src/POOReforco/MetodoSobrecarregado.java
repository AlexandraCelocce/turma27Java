package POOReforco;

public class MetodoSobrecarregado {

	
	//sobrecarga = classe com varios metodos com mesmo nome, da pra diferenciar atravez de numero,tipo
		
	public void testaMetodosSobrecarregados() {
		
		System.out.printf("Salario em número inteiro: %d \n", salario(1000)); //%d para chamar numero inteiro
		System.out.printf("Salario em número inteiro: %d \n", salario(7.500));
	}
     public int salario (int valorInt) {
    	 
    	 System.out.printf("Salario com argumento inteiro: %d \n", valorInt);
    	 return valorInt * valorInt;
    	 
     }
     public double salario(double valorDouble) {
    	 
    	 System.out.printf("Salario com argumento double: %f \n", valorDouble); //%f porque é double
    	 return valorDouble * valorDouble;
    	 
     }
}
