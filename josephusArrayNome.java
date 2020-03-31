package josephus;

import java.util.ArrayList;
import java.util.Scanner;

public class josephusArrayNome {
	public static void main(String[] argv) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("\n\n SOLUCAO DO PROBLEMA DE JOSEPHUS \n\n");
		System.out.println("Entre com o numero de pessoas (n): ");
		int n = entrada.nextInt();

		ArrayList<String> nomes = new ArrayList<>();
		entrada.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Entre com o nome da " + (i + 1) + "ª pessoa: ");
			nomes.add(entrada.nextLine());
		}
		

		System.out.println("Entre com o passo:");
		int passo = entrada.nextInt();

		
		int eliminado = 0;
		for (int i = 1; i <= n; i++) {
			eliminado = passo * i; 
			while (eliminado > n) 
				eliminado = (passo * (eliminado - n) - 1) / (passo - 1); 
			if (i == n) {
				System.out.println("\n\n Pessoa Selecionada: " + nomes.get(eliminado - 1));
			} else {
				System.out.println(i + "ª Pessoa Eliminada: " + " " + nomes.get(eliminado - 1));
			}
		}

	}
}
