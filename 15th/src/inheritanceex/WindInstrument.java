package inheritanceex;

public abstract class WindInstrument extends Instrument{

    WindInstrument() {
        this.name = "Wind Instrument";
    }

    @Override
    void play() {
        System.out.println("Playing Wind Instrument");
    }
}
