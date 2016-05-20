package com.m2i.poec.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FiboTest {
	
	
	@Before
	public void beforeEach(){
		System.out.println("init du before");
	}
	
	@After
	public void afterEach(){
		System.out.println("clean du after");
	}
	@BeforeClass
	public static void BeforeAll(){
		System.out.println("le tous debut");
	}
	@AfterClass
	public static void afterAll(){
		System.out.println("Le tous après");
	}
	

	@Test
	public void fiboPositif() {
		assertEquals("0 => 0",0,Fibo.fib(0));
		assertEquals("1 => 1",1,Fibo.fib(1));
		assertEquals("2 => 1",1,Fibo.fib(2));
		assertEquals("3 => 2",2,Fibo.fib(3));
		assertEquals("20 => 6765",6765,Fibo.fib(20));
		assertEquals("46 => 1836311903",1836311903,Fibo.fib(46));
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void fiboNegatif() {
		Fibo.fib(-1);
	}
	@Test(expected=IllegalArgumentException.class)
	public void fiboTooBig() {
		Fibo.fib(47);
	}
}
