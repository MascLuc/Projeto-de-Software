import java.util.Scanner;

class Adicionar {

    public void AdicEmpregado() {
        System.out.println("");
        System.out.println("");
        System.out.println("---------------------------------------------------------------");
        System.out.println("                       Adição de empregado");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Digite o nome do empregado que deseja adicionar: ");
        Scanner funcAddScanner = new Scanner(System.in);
        String empregadoAdd = funcAddScanner.nextLine();
        System.out.println("");
        System.out.println("Funcionário adicionado.");
        System.out.println("---------------------------------------------------------------");
    }
}

class Remover {
    
    public void RemoEmpregado() {
        System.out.println("");
        System.out.println("");
        System.out.println("---------------------------------------------------------------");
        System.out.println("                     Remoção de empregado");
        System.out.println("---------------------------------------------------------------");
        System.out.print("Digite o nome do empregado que deseja remover:");
        Scanner funcRemScanner = new Scanner(System.in);
        String empregadoRem = funcRemScanner.nextLine();
        System.out.println("Funcionário removido.");
    }
}

public class App {

    public static void main(String args[]) {
        boolean fim = false;
        Adicionar func1 = new Adicionar();
        Remover func2 = new Remover();

        do{
            System.out.println("");
            System.out.println("");
            System.out.println("---------------- Sistema de Folha de Pagamentos ---------------");
            System.out.println("---------------------------------------------------------------");
            System.out.println("|           [0] - Encerrar programa                           |");
            System.out.println("|           [1] - Adição de empregado                         |");
            System.out.println("|           [2] - Remoção de empregado                        |");
            System.out.println("|           [3] - Lançar Cartão de Ponto                      |");;
            System.out.println("|           [4] - Lançar um Resultado de Venda                |");
            System.out.println("|           [5] - Lançar uma Taxa de Serviço                  |");
            System.out.println("|           [6] - Alterar detalhes de um Empregado            |");
            System.out.println("|           [7] - Rodar a Folha de Pagamentos para Hoje       |");
            System.out.println("|           [8] - Desfazer uma ação                           |");
            System.out.println("|           [9] - Agenda de Pagamento                         |");
            System.out.println("|           [10] - Criar Nova Agenda de Pagamento             |");
            System.out.println("---------------------------------------------------------------");
            System.out.print("> Selecione a função desejada: ");
            Scanner funcScanner = new Scanner(System.in);
            int funcao = funcScanner.nextInt();
            
            switch (funcao) {
                case 0:
                    fim = true;
                    break;
                case 1:
                    func1.AdicEmpregado();
                    break;    
                case 2:
                    func2.RemoEmpregado();
                    break;
                case 3:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("                     Lançar Cartão de Ponto");
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("                  Lançar um Resultado de Venda");
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 5:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("                  Lançar uma Taxa de Serviço");
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 6:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("                Alterar detalhes de um Empregado");
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 7:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("             Rodar a Folha de Pagamentos para Hoje");
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 8:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("                       Desfazer uma ação");
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 9:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("                      Agenda de Pagamento");
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 10:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("                Criar Nova Agenda de Pagamento");
                    System.out.println("---------------------------------------------------------------");
                    break;
                default:
                    System.out.println("Função inválida. Selecione uma função válida.");
            }       
        }while(fim != true);
    }
}