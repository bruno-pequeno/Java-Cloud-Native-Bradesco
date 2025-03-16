package heranca_e_polimorfismo.exercicios.ingressos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ingresso ingresso = new Ingresso();
        MeiaEntrada meiaEntrada = new MeiaEntrada();
        IngressoFamilia ingressoFamilia = new IngressoFamilia();

        int opcao;
        do{
            System.out.println("====================");
            System.out.println("        Menu        ");
            System.out.println("====================");
            System.out.println("1 - Ingresso comum");
            System.out.println("2 - Meia entrada");
            System.out.println("3 - Ingresso família");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    ingresso.setNomeFilme("Era do Gelo");
                    ingresso.setDubladoOuLegendado(DubladoOuLegendado.DUBLADO);

                    System.out.printf("==== %s ====", ingresso.getClass().getSimpleName());
                    System.out.println("\n" + ingresso.getNomeFilme() + "\n"
                            + ingresso.getDubladoOuLegendado() + "\n"
                            + ingresso.getValor());
                    break;
                case 2:
                    meiaEntrada.setNomeFilme("O Apicultor 2");
                    meiaEntrada.setDubladoOuLegendado(DubladoOuLegendado.LEGENDADO);

                    System.out.printf("==== %s ====", meiaEntrada.getClass().getSimpleName());
                    System.out.println("\n" + meiaEntrada.getNomeFilme() + "\n"
                            + meiaEntrada.getDubladoOuLegendado() + "\n"
                            + meiaEntrada.valorMeiaEntrada());

                    break;
                case 3:
                    ingressoFamilia.setNomeFilme("Meu Malvado Favorito 3");
                    ingressoFamilia.setDubladoOuLegendado(DubladoOuLegendado.DUBLADO);

                    System.out.print("Digite a quantidade de pessoas: ");
                    int inputQtdPessoas = sc.nextInt();

                    System.out.printf("==== %s ====", ingressoFamilia.getClass().getSimpleName());
                    System.out.println("\n" + ingressoFamilia.getNomeFilme() + "\n"
                            + ingressoFamilia.getDubladoOuLegendado() + "\n"
                            + ingressoFamilia.valorIngressoFamilia(inputQtdPessoas));

                    break;
                case 0:
                    System.out.println("Saindo... Obrigado por usar o sistema!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }
}
