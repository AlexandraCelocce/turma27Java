package introducao;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteArquivo {

	public static void main(String[] args) {
		File arquivo = new File ("C: \\temp1 \\turma27.txt");
		Scanner leia = null;

	 try {
		
		leia = new Scanner (arquivo);
		while (leia.hasNextLine())
			
			System.out.println(leia.nextLine());
			
			
		} catch (IOException erro) {
			System.out.println("Erro na abertura de arquivo...");
			
		} finally {
			if (leia != null) {
				leia.close();
			
			
			}}
		
		
	}

}
