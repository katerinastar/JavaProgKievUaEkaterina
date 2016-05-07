package ua.kyiv.prog.caesar;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for checking decoding
 */

public class DecodingTest {
    @Test
    public void encode1(){
        Assert.assertEquals("abc", Decoding.decode("def", 3));
    }

    @Test
    public void encode2(){
        Assert.assertEquals("абв", Decoding.decode("где", 3));
    }

    @Test
    public void encode3(){
        Assert.assertEquals("   ", Decoding.decode("%%%", 5));
    }

    @Test
    public void encode4(){
        Assert.assertEquals("HelloWorld", Decoding.decode("JgnnqYqtnf", 2));
    }

    @Test
    public void encode5(){
        Assert.assertEquals("Eng+Укр", Decoding.decode("Jsl0Шпх", 5));
    }

}