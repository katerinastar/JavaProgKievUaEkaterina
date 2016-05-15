/**
 * Class for counting the amount of numbers in array
 */

public class Amount {

    /**
     * Method for counting the amount of numbers from minimum value to maximum value in array
     * @param array array of numbers
     * @param min minimum value
     * @param max maximum value
     * @return amount of numbers in array from min to max
     */

    public static int count(long[] array, int min, int max){
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] >= min && array[i] < max) {
                count++;
            }
        }
        return count;
    }
}
