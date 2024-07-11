import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class EducationManagement {
    static double getAverage(double[] scores) {
        OptionalDouble average = DoubleStream.of(scores).average();
        return average.isPresent() ? average.getAsDouble() : 0.0;
    }
}
