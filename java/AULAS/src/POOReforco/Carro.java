package POOReforco;

public class Carro {
     String cor;
     String modelo;
     double velocidadeAtual;
     double velocidadeMaxima;
     
     //metodos
     
     void liga () {
    	 
    	 System.out.println("O carro est� ligado...");
    	     	 
     }
    void acelerador (double quantidade) {
    	double velocidadeNova = this.velocidadeAtual + quantidade;
    	this.velocidadeAtual = velocidadeNova;
    	
    }
     int pegaMarcha () {
    	 
    	 if (this.velocidadeAtual<0) {
    		 
    		 return -1;
    		 
    	 } 
    	 if (this.velocidadeAtual>= 0 && this.velocidadeAtual<40) {
    		 
    		 return 1;
    		  
    	 }
    	 if (this.velocidadeAtual>= 0 && this.velocidadeAtual<80) {
    		 
    		 return 2;
    		 
    	 }
    	 return 3;
    	 
     }
     
     
     
}
