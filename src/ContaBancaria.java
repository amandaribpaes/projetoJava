import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int operacao = 0;
        double saldo = 2500;
        String dadosCliente = """
                    ***********************
                    Dados iniciais do cliente:
                    
                    Nome: Jacqueline Oliveira
                    Tipo conta: Corrente
                    Saldo inicial: R$ %.2f
                    ***********************
                      """.formatted(saldo);
        System.out.println(dadosCliente);

        String mensagemOperacao = """
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Digite a opção desejada:""";

        while (operacao != 4) {
            System.out.println(mensagemOperacao);
            operacao = leitura.nextInt();
            switch (operacao) {
                case 1:
                    System.out.println("Seu saldo é de: R$ %.2f".formatted(saldo));
                    break;
                case 2:
                    System.out.println("Digite o valor a receber:");
                    double valorReceber = leitura.nextDouble();
                    saldo += valorReceber;
                    System.out.println("Seu saldo atual é de: R$ %.2f".formatted(saldo));
                    break;
                case 3:
                    System.out.println("Digite o valor a transferir:");
                    double valorTransferir = leitura.nextDouble();
                    if (valorTransferir > saldo) {
                        System.out.println("Saldo insuficiente para realizar esssa operação, seu saldo atual é de: R$ %.2f".formatted(saldo));
                        break;
                    }
                    saldo -= valorTransferir;
                    System.out.println("Seu saldo atual é de: R$ %.2f".formatted(saldo));
                    break;
                default:
                    if (operacao == 4) {
                        break;
                    }
                    System.out.println("Opção inválida");
                    break;
            }
        }


    }
}
