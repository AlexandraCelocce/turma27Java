package introducao;

	import introducao.AnimalSuperC;
	import introducao.CachorroC;
	import introducao.CavaloC;
	import introducao.PreguicaC;

	public class ControleAnimais {

		public static void main(String[] args) {

			CachorroC auau1 = new CachorroC("Freddynho",9);	
			CavaloC pocoto1 = new CavaloC("Pangaré",15);
			PreguicaC ronco1 = new PreguicaC("Jaqueline", 24);

			System.out.println(auau1.getNome()+" tem: "+auau1.getIdade()+" anos\n");
			auau1.emitirSom();
			System.out.println();
			auau1.correrAuAu();
			System.out.println();

			System.out.println(pocoto1.getNome()+" tem: "+pocoto1.getIdade()+" anos\n");
			pocoto1.emitirSom();
			System.out.println();
			pocoto1.correrPocoto();
			System.out.println();

			System.out.println(ronco1.getNome()+" tem: "+ronco1.getIdade()+" anos\n");
			ronco1.emitirSom();
			System.out.println();
			ronco1.subirNaArvore();
			System.out.println();
		}

	}