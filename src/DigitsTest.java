package ua.kiev.prog;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DigitsTest {
    @Test
    public void testDigits1(){
        Assert.assertEquals(1, Digits.findDigit(5));
    }

    @Test
    public void testDigits(){
        Assert.assertEquals(1,Digits.findDigit(-1));
    }

    @Test
    public void testDigits0(){
        Assert.assertEquals(1, Digits.findDigit(0));
    }

    @Test
    public void testDigits2(){
        Assert.assertEquals(2, Digits.findDigit(55));
    }

    @Test
    public void testDigits3(){
        Assert.assertEquals(3, Digits.findDigit(555));
    }

    @Test
    public void testDigits7(){
        Assert.assertEquals(7, Digits.findDigit(5555555));
    }

}