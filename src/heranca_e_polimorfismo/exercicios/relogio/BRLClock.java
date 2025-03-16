package heranca_e_polimorfismo.exercicios.relogio;

public non-sealed class BRLClock extends Clock{

    @Override
    public Clock convert(Clock clock) {
        this.second = clock.getSecond();
        this.hour = clock.getMinute();

        if (clock instanceof USClock) {
            USClock usClock = (USClock) clock;

            this.hour = (usClock.getPeriodIndicator().equals("PM")) ?
                    usClock.getHour() + 12 :
                    usClock.getHour();

        } else if(clock instanceof BRLClock){
            BRLClock brlClock = (BRLClock) clock;

            this.hour = brlClock.getHour();
        }
        return this;
    }
}
