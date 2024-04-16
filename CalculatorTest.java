package com.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator cal;

	@Before
	public void setUp() throws Exception
	{
		cal = new Calculator();

	}

	@After
	public void tearDown() throws Exception 
	{
	}

	@Test
	public void test()
	{
		assertEquals(7,cal.add(4, 3));
		assertEquals(4,cal.add(4, 0));
		assertEquals(3,cal.add(0, 3));
		//assertEquals(7,cal.add(5, 3));

	}
	


}


