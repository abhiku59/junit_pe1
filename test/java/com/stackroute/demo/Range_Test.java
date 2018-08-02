package com.stackroute.demo;
import static org.junit.Assert.*;

import org.junit.Test;
public class Range_Test {


    @Test
    public void test() {
      
        Range junit=new Range();
        String s=junit.func(27);
        assertEquals("Tom",s);
        String q=junit.func(22);
        assertEquals("Jerry",q);
        String z=junit.func(47);
        assertNotEquals("Tom",z);
    }

}

