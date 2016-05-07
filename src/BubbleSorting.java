package ua.kyiv.prog.bubble;

/**
 * Class for bubble sorting of array
 */

public class BubbleSorting {

    /**
     * Method for sorting array
     *
     * @param array Array of numbers to be sorted
     * @return Sorted array
     */

    public static int[] sort(int[] array) {
        int temp = 0;

        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - i - 1; j++){
                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}


