package ua.kiev.prog;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    @Test
    public void testFibonacci1(){
        Assert.assertEquals(1, Fibonacci.findFibonacci(1));
    }

    @Test
    public void testFibonacci2(){
        Assert.assertEquals(1, Fibonacci.findFibonacci(2));
    }

    @Test
    public void testFibonacci10(){
        Assert.assertEquals(55, Fibonacci.findFibonacci(10));
    }

    @Test
    public void testFibonacci6(){
        Assert.assertEquals(8, Fibonacci.findFibonacci(6));
    }

    @Test
    public void testFibonacci0(){
        Assert.assertEquals(0, Fibonacci.findFibonacci(0));
    }

    @Test
    public void testFibonacci610(){
        Assert.assertEquals(610, Fibonacci.findFibonacci(15));
    }
}