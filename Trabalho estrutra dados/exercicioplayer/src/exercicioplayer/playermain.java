package exercicioplayer;

import java.util.Scanner;


public class playermain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Lista valor = new Lista();
		String opc = null;
		No aux = null;

		valor.insere("musica 1");
		valor.insere("musica 2");
		valor.insere("musica 3");
		valor.insere("musica 4");
		valor.insere("musica 5");
		valor.insere("musica 6");
		valor.insere("musica 7");
		
		while (opc != "O") {
			

			System.out.println("------------------------------------------------");
			System.out.println("Opçoes: T-Play (Tocar) || S- Stop (Sair) || P - Pause || A - Avançar || V - Voltar");
			opc = scanner.next();

			if (opc.equals("T")) {
				
				 System.out.println("Tocando"); 
				 aux = valor.atual() ;
				 System.out.println();
			
			}
			else if (opc.equals("P")) {
				System.out.println("Pausado");
				
			}

			else if (opc.equals("A")) {
				if (aux == null){
					System.out.println("você precisa startar a playlist");
				}else {
				
				aux = valor.proximo(aux);
	
				 System.out.println();
			}
			}
			else if (opc.equals("V")) {
				
				System.out.println("Tocando"); 
				
				 aux = valor.anterior(aux);
			
			}
			else if (opc.equals("S")) {
				break;
				
			}

		}
       

	}

}

