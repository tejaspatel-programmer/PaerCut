package com.papercut.controller;

import java.util.List;

import com.papercut.model.PaperCutModel;
import com.papercut.model.PaperCutModelImpl;
import com.papercut.view.PaperCutViewBean;

public class PaperCutController 
{

	PaperCutModel model=null;
	
	public PaperCutController()
	{
		model = new PaperCutModelImpl();
	}
	
	public List<PaperCutViewBean> processInputData(List<PaperCutViewBean> list) throws Exception
	{
		if(list!=null && list.size()>0)
		{
			for(PaperCutViewBean viewBean: list)
			{
				if(viewBean!=null)
				{
					double totalCost=model.calculateTotalCost(viewBean.getTotalPage(), viewBean.getTotalColorPages(), viewBean.getTotalBlackWhitePages(), viewBean.isDoubleSided(), viewBean.getPaperSize());
					viewBean.setTotalCost(totalCost);
				}
			}
		}
		return list;
	}
	
}
