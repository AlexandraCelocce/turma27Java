package introducao;
import javax.swing.JOptionPane ;
public class exerciciojavapares {

	public exerciciojavapares() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[  ] numeros = new int[  ] {
	                Integer.parseInt( JOptionPane.showInputDialog( "Digite o primeiro número" ) ),
	                Integer.parseInt( JOptionPane.showInputDialog( "Digite o segundo número" ) ),
	                Integer.parseInt( JOptionPane.showInputDialog( "Digite o terceiro número" ) ),
	        } ;
	 
	        JOptionPane.showMessageDialog( null, "Digitados:\n" + numeros[ 0 ] + "\n" + numeros[ 1 ] + "\n" + numeros[ 2 ] ) ;
	         
	        ordenacaoCrescente( numeros ) ;
	        JOptionPane.showMessageDialog( null, "Ordenação crescente:\n" + numeros[ 0 ] + "\n" + numeros[ 1 ] + "\n" + numeros[ 2 ] ) ;
	 
	        ordenacaoDecrescente( numeros ) ;
	        JOptionPane.showMessageDialog( null, "Ordenação decrescente:\n" + numeros[ 0 ] + "\n" + numeros[ 1 ] + "\n" + numeros[ 2 ] ) ;
	    }
	 
	    static void ordenacaoCrescente( int[  ] numeros ) {
	        int quantidade = numeros.length ;
	        int primeiro = 0 ;
	        int segundo = 1 ;
	        while ( segundo < quantidade ) {
	            // na ordenação crescente troca os valores quando o primeiro é maior que o segundo
	            if ( numeros[ primeiro ] > numeros[ segundo ] ) {
	                int troca = numeros[ primeiro ] ;
	                numeros[ primeiro ] = numeros[ segundo ] ;
	                numeros[ segundo ] = troca ;
	                primeiro = 0 ;
	                segundo = 1 ;
	            } else {
	                primeiro++ ;
	                segundo++ ;
	            }
	        }
	    }
	 
	    static void ordenacaoDecrescente( int[  ] numeros ) {
	        int quantidade = numeros.length ;
	        int primeiro = 0 ;
	        int segundo = 1 ;
	        while ( segundo < quantidade ) {
	       
	            if ( numeros[ primeiro ] < numeros[ segundo ] ) {
	                int troca = numeros[ primeiro ] ;
	                numeros[ primeiro ] = numeros[ segundo ] ;
	                numeros[ segundo ] = troca ;
	                primeiro = 0 ;
	                segundo = 1 ;
	            } else {
	                primeiro++ ;
	                segundo++ ;
	            }
	        }
	    }
	
	}


