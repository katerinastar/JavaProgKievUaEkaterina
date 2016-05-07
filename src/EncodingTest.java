package ua.kyiv.prog.caesar;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test to check encoding
 */

public class EncodingTest {
    @Test
    public void encode1(){
        Assert.assertEquals("def", Encoding.encode("abc", 3));
    }

    @Test
    public void encode2(){
        Assert.assertEquals("где", Encoding.encode("абв", 3));
    }

    @Test
    public void encode3(){
        Assert.assertEquals("%%%", Encoding.encode("   ", 5));
    }

    @Test
    public void encode4(){
        Assert.assertEquals("JgnnqYqtnf", Encoding.encode("HelloWorld", 2));
    }

    @Test
    public void encode5(){
        Assert.assertEquals("Jsl0Шпх", Encoding.encode("Eng+Укр", 5));
    }
}