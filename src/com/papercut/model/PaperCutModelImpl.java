package com.papercut.model;

import java.lang.reflect.Field;

/**
 * This class contains Model implementation part
 * @author tejas
 *
 */
public class PaperCutModelImpl implements PaperCutModel
{

	public double calculateTotalCost(int totalPage,int totalColorPages,int totalBlackWhitePages,boolean isDoubleSided,String paperSize) throws Exception
	{
		double totalCost=0;
		if(isDoubleSided)
		{
			totalCost+=(totalBlackWhitePages*getPrice(paperSize+"_BLACK_WHITE_DOUBLE_SIDE"))+(totalColorPages*getPrice(paperSize+"_COLOR_DOUBLE_SIDE"));
		}
		else
		{
			totalCost+=(totalBlackWhitePages*getPrice(paperSize+"_BLACK_WHITE_SINGLE_SIDE"))+(totalColorPages*getPrice(paperSize+"_COLOR_SINGLE_SIDE"));
		}
		return totalCost;
	}

	/**
	 * This method returns price based on paper size. It fetches the price value from constant class. 
	 * @param fieldName
	 * @return
	 * @throws Exception
	 */
	private double getPrice(String fieldName) throws Exception
	{
		Class<?> myInterfaceClass = PaperCutModelConstant.class;
		double price=0;
		for (Field field : myInterfaceClass.getDeclaredFields()) 
		{
			if (field.getName().equalsIgnoreCase(fieldName)) 
			{
				price = field.getDouble(null);
				break;
			} 
		}
		return price;
	}
}
