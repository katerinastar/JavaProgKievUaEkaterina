package ua.kyiv.prog.bubble;

/**
 * Class for running BubbleSorting
 */

public class BubbleRunner {
    public static void main(String[] args){
        int[] array = {5, 4, 2, 1};
        BubbleSorting.sort(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
