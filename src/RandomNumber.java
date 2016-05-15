/**
 * Class for selecting random number
 */

public class RandomNumber {

    /**
     * Method for selecting random number from 0 to max value
     * @param max the maximum possible number
     * @return random number
     */

    public static long selectNumber(int max) {
        double random = Math.random();
        double result = random * max;
        return (long) Math.floor(result);
    }
}
