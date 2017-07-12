package com.papercut.view;

import java.util.ArrayList;
import java.util.List;
import com.papercut.controller.PaperCutController;
import com.papercut.util.PaperCutUtil;

public class PaperCutView 
{
	private List<PaperCutViewBean> beanList = new ArrayList<PaperCutViewBean>();
	PaperCutController controller= new PaperCutController();
	
	public double processInputFile(String path) throws Exception
	{
		this.beanList=PaperCutUtil.readInputFile(path);
		this.beanList = controller.processInputData(this.beanList);
		double grandTotal =0;
		for(PaperCutViewBean bean:this.beanList)
		{
			System.out.println(bean.toString());
			grandTotal+=bean.getTotalCost();
		}
		System.out.println("Grand Total: "+ PaperCutUtil.formatAmount(grandTotal));
		return grandTotal;
	}
	
	public static void main(String[] args) 
	{
		
		PaperCutView view=new PaperCutView();
		try
		{
			view.processInputFile("C://Users//tejas//Downloads//sample.csv");
		}
		catch (Exception e)
		{
			System.out.println("Input file is not valid.");
			System.out.println(e.getMessage());
		}
	}
	
}