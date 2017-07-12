package com.papercut.view;

import com.papercut.util.PaperCutUtil;

public class PaperCutViewBean 
{

	private int totalPage=0;
	private int totalColorPages=0;
	private boolean isDoubleSided=false;
	private double totalCost;
	private String paperSize;
	
	@Override
	public String toString() 
	{
		return "Total Pages=" + getTotalPage()
				+ ", Total Color Pages=" + getTotalColorPages()
				+ ", Total Black & White Pages=" + getTotalBlackWhitePages()
				+ ", Double Sided=" + isDoubleSidedStr() + ", totalCost="
				+ getTotalCostString();
	}
	
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public void setTotalPage(String totalPage) {
		if(totalPage!=null && !"".equals(totalPage))
		{
			totalPage = totalPage.trim();
			this.totalPage = Integer.valueOf(totalPage);
		}
	}
	public int getTotalColorPages() {
		return totalColorPages;
	}
	public void setTotalColorPages(int totalColorPages) {
		this.totalColorPages = totalColorPages;
	}
	public void setTotalColorPages(String totalColorPages) 
	{
		if(totalColorPages!=null && !"".equals(totalColorPages))
		{
			totalColorPages= totalColorPages.trim();
			this.totalColorPages = Integer.valueOf(totalColorPages);
		}
	}
	/**
	 * Total Black and White pages = Total Page - Total Color Pages
	 * @return
	 */
	public int getTotalBlackWhitePages() {
		return (getTotalPage() - getTotalColorPages());
	}
	public boolean isDoubleSided() {
		return isDoubleSided;
	}
	public String isDoubleSidedStr() {
		return isDoubleSided==true?"Yes":"No";
	}
	public void setDoubleSided(boolean isDoubleSided) {
		this.isDoubleSided = isDoubleSided;
	}
	public void setDoubleSided(String isDoubleSided) {
		if(isDoubleSided!=null && !"".equals(isDoubleSided))
		{
			isDoubleSided=isDoubleSided.trim();
			if("true".equalsIgnoreCase(isDoubleSided))
			{
				this.isDoubleSided = true;
			}
			else if("false".equalsIgnoreCase(isDoubleSided))
			{
				this.isDoubleSided = false;
			}
		}
	}
	public double getTotalCost() 
	{
		return totalCost;
	}
	/**
	 * Convert amount in $ from cents and only decimal point
	 * @return
	 */
	public String getTotalCostString()
	{
		String total=PaperCutUtil.formatAmount(getTotalCost());
		return total;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public String getPaperSize() {
		return paperSize;
	}

	public void setPaperSize(String paperSize) {
		this.paperSize = paperSize;
	}
}
