import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Bruce Wayn";
        String tipoConta = "Corrente";
        double saldo = 1000.00;
        int opcao = 0;

        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);

        String menu = """
                Digite a opção escolhida
                1 - Consultar saldo 
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("o saldo atual é de: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Valor que sera tranferido");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Operação invalida");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atual: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atual: " + saldo);
            }else if (opcao != 4) {
                System.out.println("Opão invalida!");
            }
        }
    }
}


