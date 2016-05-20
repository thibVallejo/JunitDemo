package com.m2i.poec.junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class HelloJunitTest {

	@Test
	public void helloShouldREturnHello(){
		
		//Given
		HelloJunit helloJunit= new HelloJunit();
		//When
		String result = helloJunit.hello();
		//Then
		//je dois garantir que "hello".equals(result);
		assertEquals("helloJunit.hello() should equals hello","hello",result);
		assertTrue("helloJunit.hello() should equals hello","hello".equals(result));
	}
	
	

}
