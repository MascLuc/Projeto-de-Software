package src.classes;

import java.util.Scanner;
import java.util.InputMismatchException;

import src.classes.Union;

public class Employee {

    protected String name;
    protected String adress;
    protected int employeeId;
    protected int employeeType;
    protected String bank;
    protected int agency;
    protected int account;
    protected int accountType;
    protected int paymentSchedule;
    protected int paymentMethod;
    protected int union;

    public static void addEmployeeError() {  // Mensagem de erro na criação de um novo empregado.
    
        System.err.print("Digite os dados corretamente.");
    }

    public static void paymentMethod() {  // Função para selecionar o método de pagamento
        
        Scanner std = new Scanner(System.in);  // Scanner para seleção de metodo de pagamento.
        Scanner bankScan = new Scanner(System.in); // Scanner para inserir nome do banco.
        Scanner agencyScan = new Scanner(System.in); // Scanner para inserir agencia bancária.
        Scanner accountScan = new Scanner(System.in); // Scanner para inserir conta bancária.
        Scanner typeScan = new Scanner(System.in); // Scanner para inserir tipo de conta.


        System.out.println("");
        System.out.println("--------------------------------------------------------");
        System.out.println("|                                                      |");
        System.out.println("|           Selecione o método de pagamento            |");
        System.out.println("|                                                      |");
        System.out.println("|               [1] Cheque em mãos                     |");
        System.out.println("|               [2] Cheque por Correio                 |");
        System.out.println("|               [3] Depósito em conta                  |");
        System.out.println("|                                                      |");
        System.out.println("--------------------------------------------------------");
        System.out.println("");
        System.out.print(" Selecione uma das opções acima: ");

        float selected = std.nextFloat();

        System.out.println("");
        System.out.print("Digite o nome do banco: "); 
        String bank = bankScan.nextLine();

        System.out.print("Digite o número da agência: "); 
        int agency = agencyScan.nextInt();

        System.out.print("Digite o número da conta bancária: ");
        int account = accountScan.nextInt();

        System.out.println("");
        System.out.println("--------------------------------------------------------");
        System.out.println("|                                                      |");
        System.out.println("|              Selecione o tipo de conta               |");
        System.out.println("|                                                      |");
        System.out.println("|                 [1] Conta Poupança                   |");
        System.out.println("|                 [2] Conta corrente                   |");
        System.out.println("|                                                      |");
        System.out.println("--------------------------------------------------------");
        System.out.println("");
        System.out.print(" Selecione uma das opções acima: ");

        int type = typeScan.nextInt();
    }


    public void addEmployee(){  // Função para adicionar um novo empregado.

        Union newUnion = new Union();
        
        Scanner std = new Scanner(System.in); // Scanner para Seleção de tipo de empregado.
        Scanner nameScan = new Scanner(System.in); // Scanner Nome do empregado.
        Scanner adressScan = new Scanner(System.in); // Scanner Endereço do empregado.
        Scanner salaryScan = new Scanner(System.in); // Scanner salário do empregado.
        Scanner percentScan = new Scanner(System.in); // Scanner para percentual de comissão.

        int selected = -1;

        System.out.println("");
        System.out.println("--------------------------------------------------------");
        System.out.println("|                                                      |");
        System.out.println("|                 [1] Horista                          |");
        System.out.println("|                 [2] Assalariado                      |");
        System.out.println("|                 [3] Comissionado                     |");
        System.out.println("|                                                      |");
        System.out.println("--------------------------------------------------------");
        System.out.println("");
        System.out.print(" Selecione uma das opções acima: ");

        try {
            
            selected = std.nextInt();
            
            System.out.println("");
            System.out.print("Digite o nome do empregado: ");
            String name = nameScan.nextLine();
            System.out.print("Digite o endereço do empregado: ");
            String adress = adressScan.nextLine();
            
            if (selected == 1) { // Se o empregado for horista.
                        
                System.out.print("Digite o salário por hora: ");
                float salary = salaryScan.nextFloat();
                paymentMethod();
                newUnion.unionPart();
            }
            
            else if (selected == 2) { // Se o empregado for assalariado.
                        
                System.out.print("Digite o salário mensal: ");
                float salary = salaryScan.nextFloat();
                paymentMethod();
                newUnion.unionPart();
            }
            
            else if (selected == 3) { // Se o empregado for comissionado.

                System.out.print("Digite o salário mensal: ");
                float salary = salaryScan.nextFloat();
                System.out.print("Digite o percentual de comissão: ");
                float percent = percentScan.nextFloat();
                paymentMethod();
                newUnion.unionPart();
            }
        }
        catch(InputMismatchException error) {
            addEmployeeError();
            addEmployee();
        }
    }

    public void removeEmployee() {  // Função para remover empregado.
        
        Scanner idScan = new Scanner(System.in); // Scanner para ID do empregado.

        System.out.println("");
        System.out.print("Digite o ID do funcionário que deseja remover: ");
        int id = idScan.nextInt();

        System.out.println("");
        System.out.println("Empregado removido.");
    }

    public void changeDetail() {  //Função para alterar dados de um empregado.
        
        Scanner idScan = new Scanner(System.in); // Scanner para ID do empregado.
        Scanner std = new Scanner(System.in); // Scanner para seleção de opção para alterar.

        System.out.print("Digite o id do empregado que deseja alterar: ");
        int id = idScan.nextInt();

        System.out.print("");
        System.out.println("--------------------------------------------------------");
        System.out.println("|                                                      |");
        System.out.println("|    [1] Nome                    [5]  Sindicato        |");
        System.out.println("|    [2] Endereço                [6]  ID sindicato     |");
        System.out.println("|    [3] Tipo                    [7]  Taxa sindical    |");
        System.out.println("|    [4] Metodo de pagamento     [8]  Dados do Banco   |");
        System.out.println("|                                                      |");
        System.out.println("--------------------------------------------------------");
        System.out.println("");
        System.out.print(" Selecione uma das opções acima: ");

        int selected = std.nextInt();  
        
        switch(selected) {

            case 1: // Alterar nome.

                Scanner nameScanner = new Scanner(System.in);

                System.out.println("Digite o nome do empregado");
                String name = nameScanner.nextLine();
                System.out.println("");

                System.out.println("Alteração realizada.");
                System.out.println("");
                break;
            case 2: // Alterar endereço.

                Scanner adrScanner = new Scanner(System.in);

                System.out.println("Digite o endereço: ");
                String adress = adrScanner.nextLine();
                System.out.println("");

                System.out.println("Alteração realizada");
                System.out.println("");
                break;
            case 3: // Alterar tipo de empregado.

                Scanner typeScan = new Scanner(System.in); // Scanner para Seleção de tipo de empregado.
                
                System.out.println("");
                System.out.println("--------------------------------------------------------");
                System.out.println("|                                                      |");
                System.out.println("|                 [1] Horista                          |");
                System.out.println("|                 [2] Assalariado                      |");
                System.out.println("|                 [3] Comissionado                     |");
                System.out.println("|                                                      |");
                System.out.println("--------------------------------------------------------");
                System.out.println("");
                System.out.print(" Selecione uma das opções acima: ");

                int type = typeScan.nextInt();
        
                System.out.println("Alteração realizada");
                System.out.println("");
                break;
            case 4: // Alterar metodo de pagamento.

                Scanner methScan = new Scanner(System.in); // Scanner para selecionar metodo de pagamento.

                System.out.println("");
                System.out.println("--------------------------------------------------------");
                System.out.println("|                                                      |");
                System.out.println("|           Selecione o método de pagamento            |");
                System.out.println("|                                                      |");
                System.out.println("|               [1] Cheque em mãos                     |");
                System.out.println("|               [2] Cheque por Correio                 |");
                System.out.println("|               [3] Depósito em conta                  |");
                System.out.println("|                                                      |");
                System.out.println("--------------------------------------------------------");
                System.out.println("");
                System.out.print(" Selecione uma das opções acima: ");

                int meth = methScan.nextInt();

                System.out.println("Alteração realizada");
                System.out.println("");
                break;
            case 5: // Alterar Participação sindical
                
                Scanner unionScan = new Scanner(System.in); // Scanner para selecionar participação sindical.

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

                int union = unionScan.nextInt();

                System.out.println("Alteração realizada");
                System.out.println("");
                break;
            case 6: // Alterar ID sindicato.

                Scanner unionIdScan = new Scanner(System.in); // Scanner para inserir ID de sindicato do funcionário.

                System.out.println("");
                System.out.print("Digite o ID de sindicato do empregado: ");
                System.out.println("");

                int unionId = unionIdScan.nextInt();

                System.out.println("Alteração realizada");
                System.out.println("");
                break;
            case 7: // Alterar Taxa do sindicato.

                Scanner unionTaxScan = new Scanner(System.in); // Scanner para inserir taxa sindical.

                System.out.println("");
                System.out.print("Digite o valor da taxa sindical: ");
                System.out.println("");

                int unionTax = unionTaxScan.nextInt();

                System.out.println("Alteração realizada");
                System.out.println("");
                break;
            case 8: // Alterar dados bancários.

                Scanner agencyScan = new Scanner(System.in); // Scanner para inserir o número da agência.
                Scanner accountScan = new Scanner(System.in); // Scanner para inserir o número da conta.
                Scanner accTypeScan = new Scanner(System.in); // Scanner para inserir o tipo da conta.

                System.out.println("");
                System.out.print("Digite o número da agência: "); 
                int agency = agencyScan.nextInt();
        
                System.out.print("Digite o número da conta bancária: ");
                int account = accountScan.nextInt();
        
                System.out.println("");
                System.out.println("--------------------------------------------------------");
                System.out.println("|                                                      |");
                System.out.println("|              Selecione o tipo de conta               |");
                System.out.println("|                                                      |");
                System.out.println("|                 [1] Conta Poupança                   |");
                System.out.println("|                 [2] Conta corrente                   |");
                System.out.println("|                                                      |");
                System.out.println("--------------------------------------------------------");
                System.out.println("");
                System.out.print(" Selecione uma das opções acima: ");
        
                int accType = accTypeScan.nextInt();  
                break;
        }
    }
}