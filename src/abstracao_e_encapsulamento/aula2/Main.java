package abstracao_e_encapsulamento.aula2;

public class Main {
    public static void main(String[] args) {
        var person = new Person("Lucas", 30);

        System.out.println(person.getInfo());
        System.out.println(person.name());
    }
}