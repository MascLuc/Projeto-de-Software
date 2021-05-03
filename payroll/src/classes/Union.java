package src.classes;

import java.util.Scanner;

public class Union {
    
    protected int UnionEmployeeId;
    protected float unionTax;
    protected float serviceTax;

    public void unionPart() {  // Função para cadastro sindicato.
        
        Scanner repScan = new Scanner(System.in);      // Scanner opção participar do sindicato.
        Scanner unionIdScan = new Scanner(System.in);  // Scanner para inserir ID de sindicato do empregado.
        Scanner taxScan = new Scanner(System.in);      // Scanner para inserir a taxa sindical.

        System.out.println("");
        System.out.println("--------------------------------------------------------");
        System.out.println("|                                                      |");
        System.out.println("|         O empregado pertence ao sindicato?           |");
        System.out.println("|                                                      |");
        System.out.println("|               [1] Sim        [2] Não                 |");
        System.out.println("|                                                      |");
        System.out.println("--------------------------------------------------------");
        System.out.println("");
        System.out.print(" Selecione uma das opções acima: ");

        float rep = repScan.nextFloat();

        if (rep == 1) {

            System.out.println("");
            System.out.print("Digite o ID de sindicato do empregado: ");
            int unionId = unionIdScan.nextInt();

            System.out.println("");
            System.out.print("Digite o valor da taxa sindical: ");
            float tax = taxScan.nextFloat();
        }

        else {
            
        }
    }

    public void unionTax() { // Função para lançar taxa de serviço.

        Scanner idScan = new Scanner(System.in); // Scanner para selecionar empregado por ID.
        Scanner taxScan = new Scanner(System.in); // Scanner para inserir valor da taxa.

        System.out.println("");
        System.out.print("Digite o ID do empregado: ");
        System.out.println("");

        int id = idScan.nextInt();

        System.out.print("Digite o valor da taxa de serviço: ");
        System.out.println("");

        float tax = taxScan.nextFloat();

        System.out.println("Taxa de Serviço lançada.");
    }
}