package com.papercut.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.papercut.view.PaperCutViewBean;

public class PaperCutUtil {

	public static List<PaperCutViewBean> readInputFile(String filePath) throws Exception 
	{
		List<PaperCutViewBean> beanList = new ArrayList<PaperCutViewBean>();
		String line = "";
		String cvsSplitBy = ",";
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		line = br.readLine();
		PaperCutViewBean bean=null;
		while ((line = br.readLine()) != null) 
		{
			String[] values = line.split(cvsSplitBy);
			bean = new PaperCutViewBean();
        	bean.setDoubleSided(values[2]);
        	bean.setTotalColorPages(values[1]);
        	bean.setTotalPage(values[0]);
        	bean.setPaperSize("A4");
        	beanList.add(bean);
		}
		br.close();
		return beanList;
	}
	
	public static String formatAmount(double totalCost)
	{
		String total="";
		if(totalCost>100)
		{
			total="$" + new DecimalFormat(".##").format((totalCost/100));
		}
		else
		{
			total=totalCost +" Cents";
		}
		return total;
	}
	
}
