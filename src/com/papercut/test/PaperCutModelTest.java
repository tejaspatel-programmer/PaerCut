package com.papercut.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import com.papercut.model.PaperCutModelImpl;
import com.papercut.util.PaperCutUtil;

public class PaperCutModelTest 
{

	@Rule
    public ErrorCollector collector = new ErrorCollector();	
	
	PaperCutModelImpl impl = new PaperCutModelImpl();
	
	@Test
	public void test() 
	{
		try 
		{
			double totalCost= impl.calculateTotalCost(25,10,15, false, "A4");
			assertEquals(PaperCutUtil.formatAmount(totalCost), "$4.75");
		}
		catch (Exception e) 
		{
			fail("Calculat Method retuns incorrect Total.");
			e.printStackTrace();
		}
	}
	
	@Test
	public void test1() 
	{
		try 
		{
			double totalCost= impl.calculateTotalCost(25,10,15, false, "A4");
			assertEquals(PaperCutUtil.formatAmount(totalCost), "$4.75");
		}
		catch (Exception e) 
		{
			fail("Calculat Method retuns incorrect Total.");
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2() 
	{
		try 
		{
			double totalCost= impl.calculateTotalCost(55,13,42, true, "A4");
			assertEquals(PaperCutUtil.formatAmount(totalCost), "$6.8");
		}
		catch (Exception e) 
		{
			fail("Calculat Method retuns incorrect Total.");
			e.printStackTrace();
		}
	}
	

	@Test
	public void test3() 
	{
		try 
		{
			double totalCost= impl.calculateTotalCost(502,22,480, true, "A4");
			assertEquals(PaperCutUtil.formatAmount(totalCost), "$52.4");
		}
		catch (Exception e) 
		{
			fail("Calculat Method retuns incorrect Total.");
			e.printStackTrace();
		}
	}

}
