package inheritanceex;

public class PercussionInstrument extends Instrument {

    PercussionInstrument() {
        this.name = "Percussion Instrument";
    }
    void play() {
        System.out.println("Playing Percussion Instrument");
    }

    @Override
    void keep() {
        System.out.println("Keeping Percussion Instrument");
    }
}
