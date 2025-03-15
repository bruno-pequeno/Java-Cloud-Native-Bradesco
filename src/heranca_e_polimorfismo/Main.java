package heranca_e_polimorfismo;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager();

        printEmployee(new Manager());
        printEmployee(new Salesman());

    }

    public static void printEmployee(Employee employee) {

        System.out.printf("====== %s =====\n", employee.getClass().getSimpleName());
        if (employee instanceof Manager manager) {
            manager.setCode("001");
            manager.setName("Caio");
            manager.setSalary(5500);
            manager.setLogin("caio@gmail.com");
            manager.setPassword("caio123");
            manager.setCommission(1200);


            System.out.println(employee.getCode());
            System.out.println(employee.getName());
            System.out.println(employee.getSalary());
            System.out.println(manager.getLogin());
            System.out.println(manager.getPassword());
            System.out.println(manager.getCommission());
        }
        if (employee instanceof Salesman salesman){
            salesman.setCode("002");
            salesman.setName("Joana");
            salesman.setSalary(4400);
            salesman.setPercentPerSold(10);
            salesman.setSoldAmount(1000);

            System.out.println(salesman.getCode());
            System.out.println(salesman.getName());
            System.out.println(salesman.getSalary());
            System.out.println(salesman.getPercentPerSold());
            System.out.println(salesman.getSoldAmount());
        }
        System.out.println(employee.getFullSalary());
        System.out.println("==========-==========");
    }
}
