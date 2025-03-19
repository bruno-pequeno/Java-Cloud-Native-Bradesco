package interfaces_funcionais.exercicios.mensageria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CentralDeMensagens mensageria = new CentralDeMensagens();

        int opcao;
        do{
            System.out.println("\n===============================");
            System.out.println("              Menu             ");
            System.out.println("===============================");
            System.out.println("1 - Enviar mensagem SMS");
            System.out.println("2 - Enviar mensagem via Email");
            System.out.println("3 - Enviar mensagem nas redes sociais");
            System.out.println("4 - Enviar mensagem de WhatsApp");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite sua mensagem: ");
                    String mensagemSMS = sc.nextLine();

                    if(mensagemSMS.isBlank()){
                        System.out.println("A mensagem não pode ser vazia!");
                    } else {
                        System.out.println(mensageria.enviarMensagemSMS(mensagemSMS));
                    }

                    break;
                case 2:
                    System.out.println("Digite sua mensagem: ");
                    String mensagemEmail = sc.nextLine();

                    if(mensagemEmail.isBlank()){
                        System.out.println("A mensagem não pode ser vazia!");
                    } else {
                        System.out.println(mensageria.enviarMensagemEmail(mensagemEmail));
                    }


                    break;
                case 3:
                    System.out.println("Digite sua mensagem: ");
                    String mensagemRedesSociais = sc.nextLine();

                    if(mensagemRedesSociais.isBlank()){
                        System.out.println("A mensagem não pode ser vazia!");
                    } else {
                        System.out.println(mensageria.enviarMensagemRedesSociais(mensagemRedesSociais));
                    }

                    break;
                case 4:
                    System.out.println("Digite sua mensagem: ");
                    String mensagemWhatsApp = sc.nextLine();

                    if(mensagemWhatsApp.isBlank()){
                        System.out.println("A mensagem não pode ser vazia!");
                    } else {
                        System.out.println(mensageria.enviarMensagemWhatsApp(mensagemWhatsApp));
                    }

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
