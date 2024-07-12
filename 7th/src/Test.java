import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        double[] scores = {80.3,100.0,13.4,60.3};
        System.out.println("average: "+EducationManagement.getAverage(scores));
        System.out.println(Arrays.toString(EducationManagement.getMultiplicationArray(scores)));
    }
}
