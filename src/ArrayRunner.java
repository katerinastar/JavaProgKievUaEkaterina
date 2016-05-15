/**
 * Class for filling the array with random numbers and computing probability of this numbers in the array
 */

public class ArrayRunner {
    public static void main(String[] args) {
        long[] array = new long[10000];
        String formatString = "There are %d numbers from %d to %d in array. Probability: %f";

        for(int i = 0; i < array.length; i++) {
            array[i] = RandomNumber.selectNumber(1000);
            System.out.println(array[i]);
        }

        System.out.println(String.format(formatString, Amount.count(array, 1, 100), 1, 100,
                Probability.findProbability(Amount.count(array, 1, 100))));
        System.out.println(String.format(formatString, Amount.count(array, 100, 200), 100, 200,
                Probability.findProbability(Amount.count(array, 100, 200))));
        System.out.println(String.format(formatString, Amount.count(array, 200, 300), 200, 300,
                Probability.findProbability(Amount.count(array, 200, 300))));
        System.out.println(String.format(formatString, Amount.count(array, 300, 400), 300, 400,
                Probability.findProbability(Amount.count(array, 300, 400))));
        System.out.println(String.format(formatString, Amount.count(array, 400, 500), 400, 500,
                Probability.findProbability(Amount.count(array, 400, 500))));
        System.out.println(String.format(formatString, Amount.count(array, 500, 600), 500, 600,
                Probability.findProbability(Amount.count(array, 500, 600))));
        System.out.println(String.format(formatString, Amount.count(array, 600, 700), 600, 700,
                Probability.findProbability(Amount.count(array, 600, 700))));
        System.out.println(String.format(formatString, Amount.count(array, 700, 800), 700, 800,
                Probability.findProbability(Amount.count(array, 700, 800))));
        System.out.println(String.format(formatString, Amount.count(array, 800, 900), 800, 900,
                Probability.findProbability(Amount.count(array, 800, 900))));
        System.out.println(String.format(formatString, Amount.count(array, 900, 1000), 900, 1000,
                Probability.findProbability(Amount.count(array, 900, 1000))));
    }
}
