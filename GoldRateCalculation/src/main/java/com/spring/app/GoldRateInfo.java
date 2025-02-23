package com.spring.app;

import java.util.Map;

public class GoldRateInfo {

	private Map<Integer,Double> rateInfo;

	public Map<Integer, Double> getRateInfo() {
		return rateInfo;
	}

	public void setRateInfo(Map<Integer, Double> rateInfo) {
		this.rateInfo = rateInfo;
	}
	
	public double calculateGoldRate(int goldCarat, double grams) 
	{
		double totalRate = 0.0;
		if(rateInfo != null && rateInfo.containsKey(goldCarat)) {
			totalRate = rateInfo.get(goldCarat) * grams;
		}else {
            throw new IllegalArgumentException("Invalid gold carat value");
        }
		return totalRate;
	}
}
