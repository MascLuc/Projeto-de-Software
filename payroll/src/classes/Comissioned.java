package src.classes;

import java.util.Scanner;

public class Comissioned extends Employee {
    
    protected float percent;
    protected float salary;

    public void sell() { //  Função para adicionar resultado de venda

        Scanner idScan = new Scanner(System.in); // Scanner para selecionar o empregado por ID.
        Scanner valueScan = new Scanner(System.in); // Scanner para inserir o valor da venda.

        System.out.println("");
        System.out.print("Digite o ID do funcionário: ");
        System.out.println("");

        int id = idScan.nextInt();

        System.out.println("Digite o valor da venda: ");
        System.out.println("");

        float value = valueScan.nextFloat();

        System.out.println(" Resultado de Venda lançado.");
    }
}
