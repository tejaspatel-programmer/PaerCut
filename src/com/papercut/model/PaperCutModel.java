package com.papercut.model;

public interface PaperCutModel 
{
	public double calculateTotalCost(int totalPage,int totalColorPages,int totalBlackWhitePages,boolean isDoubleSided,String papersize) throws Exception;
}
