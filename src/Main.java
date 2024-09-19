public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int[] testArray = {11, 10, 2, 6, 18, 26, 11, 3};
        System.out.println(calculator.calculateMidArithmetic(3, testArray));
        System.out.println(calculator.calculateMedian(3, testArray));
        System.out.println(calculator.calculateMedian(2, testArray));
        System.out.println(calculator.calculateMidQuad(3, testArray));
    }
}
