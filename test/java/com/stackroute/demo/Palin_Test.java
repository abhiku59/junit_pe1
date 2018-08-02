package com.stackroute.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Palin_Test{
	    
	    
	    @Test
	    void test()
	    {
	        Palindrome obj = new Palindrome();
	         String x=obj.num(1441);
	        assertEquals("palindrome ",x);
	        
	    }
	}


