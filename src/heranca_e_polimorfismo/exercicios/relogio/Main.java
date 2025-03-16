package heranca_e_polimorfismo.exercicios.relogio;

public class Main {
    public static void main(String[] args) {
        Clock brClock = new BRLClock();
        brClock.setSecond(0);
        brClock.setMinute(0);
        brClock.setHour(25);

        System.out.println(brClock.getTime());
        System.out.println(new USClock().convert(brClock).getTime());
    }
}
