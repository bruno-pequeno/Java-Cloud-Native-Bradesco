package interfaces_funcionais.exercicios.area_das_figuras;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GeometricForm geometricForm = null;

        int opcao;
        do{
            System.out.println("\n===============================");
            System.out.println("              Menu             ");
            System.out.println("===============================");
            System.out.println("1 - Área do Quadrado");
            System.out.println("2 - Área do Retângulo");
            System.out.println("3 - Área do Circulo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1: geometricForm = createSquare();
                    break;
                case 2: geometricForm = createRectangle();
                    break;
                case 3: geometricForm = createCircle();
                    break;
                case 0:
                    System.out.println("Saindo... Obrigado por usar o sistema!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println("O resultado da área é: " + geometricForm.getArea());

        } while (opcao != 0);
    }

    private static GeometricForm createSquare(){
        System.out.println("Informe o tamanho dos lados: ");
        int side = sc.nextInt();

        return new Square(side);
    }

    private static GeometricForm createRectangle(){
        System.out.println("Informe a base: ");
        double base = sc.nextDouble();

        System.out.println("Informe a altura: ");
        double height = sc.nextDouble();

        return new Rectangle(base, height);
    }

    private static GeometricForm createCircle(){
        System.out.println("Informe o raio: ");
        double radius = sc.nextDouble();

        return new Circle(radius);
    }
}
