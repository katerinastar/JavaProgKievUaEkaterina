package ua.kyiv.prog.bubble;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test to check bubble sorting
 */

public class BubbleSortingTest {
    @Test
    public void sort1(){
        int[] actualArray = {5, 4, 2, 1};
        int[] expectedArray = {1, 2, 4, 5};
        Assert.assertArrayEquals(expectedArray, BubbleSorting.sort(actualArray));
    }

    @Test
    public void sort2(){
        int[] actualArray = {};
        int[] expectedArray = {};
        Assert.assertArrayEquals(expectedArray, BubbleSorting.sort(actualArray));
    }

    @Test
    public void sort3(){
        int[] actualArray = {5};
        int[] expectedArray = {5};
        Assert.assertArrayEquals(expectedArray, BubbleSorting.sort(actualArray));
    }

    @Test
    public void sort4(){
        int[] actualArray = {1, 2, 4, 5};
        int[] expectedArray = {1, 2, 4, 5};
        Assert.assertArrayEquals(expectedArray, BubbleSorting.sort(actualArray));
    }

    @Test
    public void sort5(){
        int[] actualArray = {3, 3};
        int[] expectedArray = {3, 3};
        Assert.assertArrayEquals(expectedArray, BubbleSorting.sort(actualArray));
    }

    @Test
    public void sort6(){
        int[] actualArray = {0, 0, 0};
        int[] expectedArray = {0, 0, 0};
        Assert.assertArrayEquals(expectedArray, BubbleSorting.sort(actualArray));
    }

    @Test
    public void sort7(){
        int[] actualArray = {5, -4, 2, -1};
        int[] expectedArray = {-4, -1, 2, 5};
        Assert.assertArrayEquals(expectedArray, BubbleSorting.sort(actualArray));
    }

}