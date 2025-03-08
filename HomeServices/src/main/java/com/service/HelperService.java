package com.service;
import org.springframework.stereotype.Service;

import com.model.HelperBean;

@Service
public class HelperService {
	 public double calculateTotalCost(HelperBean helperBean) {
	        double cost = 0.0;

	        if (helperBean.getServiceType().equalsIgnoreCase("ACService")) {
	            cost = 400 * helperBean.getNoOfHours();
	        } else if (helperBean.getServiceType().equalsIgnoreCase("WashingMachineService")) {
	            cost = 500 * helperBean.getNoOfHours();
	        } else if (helperBean.getServiceType().equalsIgnoreCase("RefrigeratorService")) {
	            cost = 300 * helperBean.getNoOfHours();
	        }

	        return cost;
	    }
}
