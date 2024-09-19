import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Calculator {

    public double calculateMidArithmetic(int window, int[] array) {
        int[] newArray = Arrays.copyOfRange(array, (array.length - window), array.length);
        OptionalDouble average = IntStream.of(newArray).average();
        return average.getAsDouble();
    }

    public double calculateMedian(int window, int[] array) {
        int[] newArray = Arrays.copyOfRange(array, (array.length - window), array.length);
        Arrays.sort(newArray);

        if (newArray.length % 2 == 0) {
            if (newArray.length == 2) {
                return (double) (newArray[0] + newArray[1]) / 2;
            } else {
                return (double) (newArray[newArray.length / 2] + newArray[(newArray.length / 2) - 1]) / 2;
            }
        } else {
            return newArray[newArray.length / 2];
        }
    }

    public double calculateMidQuad(int window, int[] array) {
        int sum = 0;
        for (int i = array.length - window; i < array.length; i++) {
            int quad = array[i] * array[i];
            sum += quad;
        }
        int target = sum / window;
        return Math.sqrt(target);
    }
}
