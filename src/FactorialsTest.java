package ua.kiev.prog;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialsTest {
    @Test
    public void testFactorial0() {
        Assert.assertEquals(1, Factorials.findFactorial(0));
    }

    @Test
    public void testFactorial1() {
        Assert.assertEquals(1, Factorials.findFactorial(1));
    }

    @Test
    public void testFactorial5() {
        Assert.assertEquals(120, Factorials.findFactorial(5));
    }

    @Test
    public void testFactorial10() {
        Assert.assertEquals(3628800, Factorials.findFactorial(10));
    }
}
