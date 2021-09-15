package com.lti.test;
import com.lti.model.Flight;
import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.client.Main;


public class TestCase1 {

	@Test
	public void testAdd() {
		//test data
		int num1=10;
		int num2=15;
		assertEquals(25, Main.add(num1, num2));
	}
	@Test
	public void testNums() {
		//test data
		int num1=10;
		int num2=10;
		assertTrue(Main.compare(num1, num2));
	}
	@Test
	public void testObjects() {
		//test data
		Flight f1=new Flight(1001,"Chennai","Pune");
//		Flight f2=new Flight(1001,"Chennai","Pune"); 
		Flight f2=f1;
		assertSame(f1, f2);
		
	}

}
