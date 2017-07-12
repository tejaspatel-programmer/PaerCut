package com.papercut.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import com.papercut.view.PaperCutView;

public class PaperCutViewTest 
{

	PaperCutView view= new PaperCutView();
	@Test
	public void test() 
	{
		try
		{
			String grandTotal = view.processInputFile(".//testcases//sample.csv");
			assertEquals(grandTotal, "$64.1");
		}
		catch(Exception e)
		{
			fail("Error occurred while processing Input File.");
			e.printStackTrace();
		}
	}
	
	@Test
	public void test1() 
	{
		try
		{
			String grandTotal = view.processInputFile(".//testcases//test1.csv");
			assertEquals(grandTotal, "$29.75");
		}
		catch(Exception e)
		{
			fail("Error occurred while processing Input File.");
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2() 
	{
		try
		{
			String grandTotal = view.processInputFile(".//testcases//test2.csv");
			assertEquals(grandTotal, "$128.2");
		}
		catch(Exception e)
		{
			fail("Error occurred while processing Input File.");
			e.printStackTrace();
		}
	}
	
	@Test
	public void test3() 
	{
		try
		{
			String grandTotal = view.processInputFile(".//testcases//test3.csv");
			assertEquals(grandTotal, "$157.0");
		}
		catch(Exception e)
		{
			fail("Error occurred while processing Input File.");
			e.printStackTrace();
		}
	}

}
