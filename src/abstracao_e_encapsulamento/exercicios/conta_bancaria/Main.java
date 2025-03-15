package abstracao_e_encapsulamento.exercicios.conta_bancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do depósito inicial: ");
        double saldo = sc.nextDouble();

        double chequeEspecial = (saldo <= 500) ? 50.0 : saldo * 0.5;
        boolean usouChequeEspecial = false;

        int opcao;
        do {
            System.out.println("=============");
            System.out.println("      Menu   ");
            System.out.println("=============");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto");
            System.out.println("6 - Verificar se está usando cheque especial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f\n", saldo);
                    break;

                case 2:
                    System.out.printf("Seu cheque especial é de: R$ %.2f\n", chequeEspecial);
                    break;

                case 3:
                    System.out.print("Digite o valor para depositar: ");
                    double deposito = sc.nextDouble();
                    saldo += deposito;

                    if (usouChequeEspecial && saldo > 0) {
                        double taxa = (chequeEspecial + saldo) * 0.2;
                        saldo -= taxa;
                        System.out.printf("Taxa de uso do cheque especial cobrada: R$ %.2f\n", taxa);
                        usouChequeEspecial = false;
                    }

                    System.out.printf("Depósito realizado! Saldo atual: R$ %.2f\n", saldo);
                    break;

                case 4:
                    System.out.print("Digite o valor para sacar: ");
                    double saque = sc.nextDouble();
                    if (saldo + chequeEspecial >= saque) {
                        saldo -= saque;
                        if (saldo < 0) usouChequeEspecial = true;
                        System.out.printf("Saque realizado! Saldo atual: R$ %.2f\n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;

                case 5:
                    System.out.print("Digite o valor do boleto: ");
                    double boleto = sc.nextDouble();
                    if (saldo + chequeEspecial >= boleto) {
                        saldo -= boleto;
                        if (saldo < 0) usouChequeEspecial = true;
                        System.out.printf("Boleto pago! Saldo atual: R$ %.2f\n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente para pagar o boleto.");
                    }
                    break;

                case 6:
                    if (saldo < 0) {
                        System.out.println("Você está usando o cheque especial!");
                    } else {
                        System.out.println("Você não está usando o cheque especial.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo... Obrigado por usar o sistema!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
