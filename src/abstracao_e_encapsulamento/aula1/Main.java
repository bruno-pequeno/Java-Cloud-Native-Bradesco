package abstracao_e_encapsulamento.aula1;

public class Main {
    public static void main(String[] args) {
        var male = new Person("Lucas");
        male.incAge();

        var female = new Person("Joaquina");
        female.incAge();

        System.out.println("Name: " + male.getName() + "\nAge: " + male.getAge());
        System.out.println("Name: " + female.getName() + "\nAge: " + female.getAge());

    }
}
