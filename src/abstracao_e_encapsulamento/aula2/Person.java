package abstracao_e_encapsulamento.aula2;

public record Person(String name, int age) {
     public Person{
     }

     public Person(String name){
         this(name, 10);
     }

     public String getInfo(){
         return "Name: " + name + "\nAge: " + age;
     }
}
