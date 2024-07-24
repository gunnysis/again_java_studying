package inheritanceex;

public class Xylophone extends PercussionInstrument{
    Xylophone() {
        this.name = "Xylophone";
    }

    @Override
    void play() {
        System.out.println("Playing Xylophone Instrument");
    }
}
