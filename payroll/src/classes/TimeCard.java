package src.classes;

import java.util.Scanner;

public class TimeCard {
    
    public void timeCard() {  // Função para lançar cartão de ponto.

        Scanner idScan = new Scanner(System.in); // Scanner para selecionar empregado por ID.
        Scanner std = new Scanner(System.in); // Scanner para selecionar entrada ou saída.

        System.out.println("");
        System.out.print("Digite o ID do empregado: ");
        System.out.println("");

        int id = idScan.nextInt();

        System.out.println("--------------------------------------------------------");
        System.out.println("|                                                      |");
        System.out.println("|              [1] Entrada      [2] Saída              |");
        System.out.println("|                                                      |");
        System.out.println("--------------------------------------------------------");
        System.out.println("");
        System.out.print(" Selecione uma das opções acima: ");

        int selected = std.nextInt();

        System.out.println("");
        System.out.println("Infomação lançada.");
    }
}
