package heranca_e_polimorfismo.exercicios.relogio;

public non-sealed class USClock extends Clock{

    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setAfterMidDay(){
        this.periodIndicator = "PM";
    }

    public void setBeforeMidDay(){
        this.periodIndicator = "AM";
    }

    public void setHour(int hour) {
        setBeforeMidDay();
        if((hour > 12) && (hour <= 23)){
            setAfterMidDay();
            this.hour = hour - 12;
        }else if(hour >= 24){
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    @Override
    Clock convert(Clock clock) {
        this.second = clock.getSecond();
        this.hour = clock.getMinute();

        if (clock instanceof USClock) {
            USClock usClock = (USClock) clock;

            this.hour = usClock.getHour();
            this.periodIndicator = usClock.getPeriodIndicator();

        } else if(clock instanceof BRLClock){
            BRLClock brlClock = (BRLClock) clock;
                this.setHour(brlClock.getHour());
        }
        return this;
    }

    @Override
    public String getTime() {
        return super.getTime() + " " + this.periodIndicator;
    }
}
