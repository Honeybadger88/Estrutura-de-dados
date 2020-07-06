package listaencadeadafinal;


	import java.util.Scanner;

	public class main {
		public static void main(String[] args) throws Exception  {
			Scanner scanner = new Scanner(System.in);
			int id = 0;
			
			
			System.out.println("Tamanho da lista de IDS:");
			Lista lista = new Lista(scanner.nextInt());

			
			int opc = -1;
			
			
			while (opc != 0) {
				

				System.out.println("------------------------------------------------");
				System.out.println("Opçoes: 1-Inserir 2-Listar 3-Remover");
				opc = scanner.nextInt();

				if (opc == 1) {
					
						System.out.print("Adicionar ID na lista: ");
						id = scanner.nextInt();
						lista.inserirNoFinal(id);
						System.out.println("id "+id+" adicionado na lista\n");
				
				}
				if (opc == 2) {
					System.out.print("Listar: ");
					System.out.println();
					lista.imprimeLista();
				
				}

				if (opc == 3) {
					System.out.println("Qual id você deseja remover da lista?");
					id = scanner.nextInt();
					lista.removerItem(id);
					System.out.println("Você removeu o ID:"+ id);
				}
			}
		}
	}
	
