package inheritanceex;

public class MainTest4 {
    public static void main(String[] args) {
        Instrument percussion = new PercussionInstrument();
        Instrument xylophone = new Xylophone();

        Ensemble ensemble = new Ensemble();

        Instrument[] instruments = {percussion,xylophone};

        for (Instrument instrument : instruments) {
            ensemble.playInstrument(instrument);
        }

    }
}
