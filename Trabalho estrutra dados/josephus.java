package josephus;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class josephus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random aleatorio = new Random();
        ArrayList list = new ArrayList();
         
        
        System.out.println("\n\n SOLUÇÃO DO PROBLEMA DE JOSEPHUS \n\n");

        System.out.println("Entre com o numero de pessoas (n): ");
        int nsoldados = scanner.nextInt();
        scanner.nextLine();
        
       
    
        for(int i = 0; i < nsoldados; i++){
            System.out.print("Entre com o nome do " + (i + 1) + "º soldado: ");
            list.add(scanner.nextLine());
        }
       
        int pos = aleatorio.nextInt(list.size());
        System.out.println("*******************|------|***************************");
        
        System.out.println("A contagem irá começar pelo soldado: "+ list.get(pos));
        
       
        System.out.println("*******************|------|***************************");
        System.out.println("Entre com o valor do \"passo\" (m): ");
       
        int itv = scanner.nextInt();
        scanner.nextLine();
        System.out.println("*******************|------|***************************");
        
        
        int x = 1;
        int val = pos + itv;
        
        System.out.println("\n A sequencia de eliminação é:\n");
        
        while (list.size() != 1) {
            if (val > list.size()) {
                val = val - list.size();
            }else{
                System.out.println(x + "ª Soldado eliminado do circulo: " + " " + list.get(val-1));
                x++;
                list.remove(val-1);
                val = (val-1) + itv;
            }
    }
        System.out.println("*******************|------|***************************");
        System.out.println("O soldado à escapar no cavalo será: "+ list);
        
        
        
        
        
    }
    
}
