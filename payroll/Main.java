import java.util.InputMismatchException;
import java.util.Scanner;

import src.classes.Employee;
import src.classes.Comissioned;
import src.classes.TimeCard;
import src.classes.Union;

public class Main {
    
    public static void startProgram() { // Função de início do programa.

        System.out.println("");
        System.out.println("--------------------------------------------------------");
        System.out.println("|                                                      |");
        System.out.println("|            Sistema de Folha de Pagamantos            |");
        System.out.println("|                                                      |");
        System.out.println("--------------------------------------------------------");
        System.out.println("");
    }

    public static void programOptError() {  // Mensagem de erro na seleção de opções inicial.

        System.err.print("Selecione uma opção válida.");
    }

    public static int programOpt() {  // Função para seleção de opçoes para iniciar o programa.

        Scanner std = new Scanner(System.in); // Scanner para selecionar a função do programa.

        int selected = -1;

        System.out.println("");
        System.out.println("--------------------------------------------------------");
        System.out.println("|                                                      |");
        System.out.println("|      [1] Adicionar Empregado                         |");
        System.out.println("|      [2] Remover Empregado                           |");
        System.out.println("|      [3] Lançar um Cartão de Ponto                   |");
        System.out.println("|      [4] Lançar um Resultado de Venda                |");
        System.out.println("|      [5] Lançar uma Taxa de Serviço                  |");
        System.out.println("|      [6] Alterar detalhes de um Empregado            |");
        System.out.println("|      [7] Rodar a Folha de Pagamentos para hoje       |");
        System.out.println("|      [8] Desfazer ou Refazer transação               |");
        System.out.println("|      [9] Agenda de Pagamentos                        |");
        System.out.println("|      [10] Listar empregados                          |");
        System.out.println("|      [11] Criação de Novas Agendas de Pagamentos     |");
        System.out.println("|      [0] Encerrar o programa                         |");
        System.out.println("|                                                      |");
        System.out.println("--------------------------------------------------------");
        System.out.println("");
        System.out.print(" Selecione uma das opções acima: ");

        try{
            selected = std.nextInt();
        }
        catch(InputMismatchException error){

            programOptError();
            selected = programOpt();
        }

        return selected; // Retorno da opção selecionada.
    }

    public static void undoRedo() { // Função para desfazer/refazer transação.

        Scanner std = new Scanner(System.in);  // Scanner para selecionar undo ou redo.

        System.out.println("");
        System.out.println("--------------------------------------------------------");
        System.out.println("|                                                      |");
        System.out.println("|                [1] Undo      [2] Redo                |");
        System.out.println("|                                                      |");
        System.out.println("--------------------------------------------------------");
        System.out.println("");
        System.out.print(" Selecione uma das opções acima: ");
        System.out.println("");

        int selected = std.nextInt();

        if (selected == 1) {  // Desfazer

            System.out.println("Desfeito.");
            System.out.println("");
        }
        else if (selected == 2) { // Refazer

            System.out.println("Refeito.");
            System.out.println("");
        }
    }

    public static void main (String [] args) {

        Employee funcEmployee = new Employee();
        Union funcUnion = new Union();
        Comissioned funcComissioned = new Comissioned();
        TimeCard funcTimeCard = new TimeCard();

        startProgram();  // Função de início do programa.

        int selection = programOpt(); // Função para mostrar opçoes para iniciar o programa.

        while(selection != 0) { // Função para seleção de opçes.

            switch(selection) {
                
                case 1: // Adicionar novo empregado.
                    funcEmployee.addEmployee();
                    break;
                case 2: // Remover empregado.
                    funcEmployee.removeEmployee();
                    break;
                case 3: // Lançar um cartão de ponto.
                    funcTimeCard.timeCard();
                    break;
                case 4: // Lançar um resultado de venda.
                    funcComissioned.sell();
                    break;
                case 5: // Lançar uma taxa de serviço.
                    funcUnion.unionTax();
                    break;
                case 6: // Alterar detalhes de um empregado.
                    funcEmployee.changeDetail();
                    break;
                case 7: // Rodar folha de pagamento para hoje.
                    break;
                case 8: // Desfazer/Refazer
                    undoRedo();
                    break;
                case 9: // Agenda de pagamento.
                    break;
                case 10: // Listar empregados.
                    break; 
                case 11: // Criação de novas agendas de pagamento.
                    break;
            }
        }
    }
}