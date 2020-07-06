package estruturadados3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList inimigos = new ArrayList();
		int opc = -1;
		int hp = 0;
		int nInimigos = 0;
		while (opc != 0) {
			int pos = 0;

			System.out.println("------------------------------------------------");
			System.out.println("Opçoes: 1-Inserir 2-Remover 3-Listar");
			opc = scanner.nextInt();

			if (opc == 1) {
				if (inimigos.size() < 20) {
					System.out.print("Adicionar inimigo: ");
					hp = scanner.nextInt();
					if (hp != 0) {
						inimigos.add(hp);
						Collections.sort(inimigos);
						nInimigos++;

					}
				} else {
					System.out.println("espaço para inimigos lotado");
				}
			}
			if (opc == 2) {
				System.out.print("Posicao: ");
				hp = scanner.nextInt();
				if (hp < nInimigos) {
					inimigos.remove(hp);
				} else {
					System.out.println("posicao fora de alcance");
				}
			}

			if (opc == 3) {

				System.out.println("(" + inimigos.size() + ") " + inimigos);
			}

		}

	}
}
