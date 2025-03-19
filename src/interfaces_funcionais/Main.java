package interfaces_funcionais;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User("Julia", 19), new User("Caio", 25),
                new User("Eduardo", 22), new User("Ana", 32));

        var consumer = new Consumer<User>() {
            @Override
            public void accept(User user) {
                System.out.println(user);

            }
        };
        users.forEach(consumer);

        System.out.println("\n======= Users com lambda =======");
        users.forEach(System.out::println);

        System.out.println("\n======= Printando o nome com método =======");
        printStringValue(User::name, users);

        System.out.println("\n======= Printando a idade com método =======");
        printStringValue(user -> String.valueOf(user.age()), users);

        }

    private static void printStringValue(Function<User, String> callback, List<User> users){
        users.forEach(u -> System.out.println(callback.apply(u)));
    }
}
