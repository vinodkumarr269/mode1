package com.hcl.junitpractice;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {
@Test(expected=NullPointerException.class)
	public void testNullEx(){
		Data obj=null;
		assertEquals(5,obj.sum(2,3));
	}
	@Test
	public void testDiv(){
		Data obj=new Data();
		assertEquals(2,obj.div(5,2));
	}
	@Test(expected=ArithmeticException.class)
	public void testDivEx(){
		Data obj=new Data();
		obj.div(5,0);
	}
	@Test
	public void testGetPropertyTest(){
		Data objData=new Data();
		assertNotNull(objData.getPropertyTest("Bhargav"));
		assertNull(objData.getPropertyTest("Tushar"));
	}

	@Test
	public void eventest(){
		Data objData=new Data();
		assertTrue(objData.even(10));
		assertFalse(objData.even(11));
		
		
		
		
		
		
		
	}
	@Test
	public void minArray(){
		int x[]=new int[]{2,3,9,5,1};
		Data objData=new Data();
		assertEquals(1,objData.minArray(x));
		
	}

	@Test
	public void SayHello(){
		Data objData=new Data();
		assertEquals("welcome to junit",objData.sayHello());
		
	}
	@Test
	public void testSum(){
		Data objData=new Data();
		assertEquals(4,objData.sum(2,2));
		assertEquals(4,objData.sum(1,3));
		
	}
	@Test
	public void testMax3(){
		Data objData=new Data();
		assertEquals(5,objData.max3(5,1,3));
		assertEquals(5,objData.max3(1,5,1));
		assertEquals(5,objData.max3(1,1,5));
		
	}

}
