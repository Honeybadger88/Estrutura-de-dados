package estruturadados3;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList f1 = new ArrayList();
		ArrayList f2 = new ArrayList();
		int opc = -1;
		int opc2 = 0;
		while (opc != 0) {

			System.out.println("------------------------------------------------");
			System.out.println("Opçoes: 1-Inserir 2-Remover 3-Alterar 4-testar qual maior fila");
			opc = scanner.nextInt();
			if (opc == 1) {
				System.out.println("1-insere elemento na lista f1 | 2- insere elemento na lista f2 ");
				opc2 = scanner.nextInt();
				if (opc2 == 1) {
					System.out.println("insira o dado na lista f1");
					f1.add(scanner.nextInt());
				} else if (opc2 == 2) {
					System.out.println("insira o dado na lista f2");
					f2.add(scanner.nextInt());
				}
			}
			if (opc == 2) {

				System.out.print("1-remova elemento na lista f1 | 2- remove elemento na lista f2 ");
				opc2 = scanner.nextInt();
				if (opc2 == 1) {
					System.out.println("remova o dado na lista f1");
					f1.remove(scanner.nextInt());
				} else if (opc2 == 2) {
					System.out.println("remova o dado na lista f2");
					f2.remove(scanner.nextInt());
				}
			}

			if (opc == 3) {
				System.out.print("1-altera elemento na lista f1 | 2- altera elemento na lista f2 ");
				opc2 = scanner.nextInt();
				if (opc2 == 1) {
					System.out.println("altere o dado na lista f1");
					System.out.print("Posição: ");
					int pos = scanner.nextInt();
					System.out.print("valor: ");
					f1.set(pos, scanner.nextInt());

				} else if (opc2 == 2) {
					System.out.println("altere o dado na lista f2");
					System.out.print("Posição: ");
					int pos = scanner.nextInt();
					System.out.print("valor: ");
					f2.set(pos, scanner.nextInt());

				}

			}
			if (opc == 4) {
				qualmaiorfila(f1, f2);
			}
		}
	}

	public static void qualmaiorfila(ArrayList f1, ArrayList f2) {

		if (f1.size() > f2.size()) {
			System.out.println("lista f1 tem mais elementos");
		} else if (f1.size() < f2.size()) {
			System.out.println("lista f2 tem mais elementos");
		} else {
			System.out.println("listas tem a mesma quantidade de elementos");
		}
		System.out.println("F1= "+f1.size()+" elementos, F2= "+f2.size()+" elementos. ");
	}
}
