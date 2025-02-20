package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.exception.InvalidConsumerException;
import com.model.Consumer;
import com.util.CreditScoreReport;

public class CreditScoreReportTest
{
	private static  CreditScoreReport csrObj;
	private static List<Consumer> consumers;
	
	@BeforeAll
	public static void setUp() throws Exception 
	{
        //Create few  objects for Consumer class and add to a list.
		//Set that list to the consumerList, using the setConsumerList method in CreditScoreReport class
		csrObj = new CreditScoreReport();
		consumers = new ArrayList<>();
		
		consumers.add(new Consumer("C001", "Alice", "1990-05-12", "SSN001", 5000.0, 800));
        consumers.add(new Consumer("C002", "Bob", "1985-07-23", "SSN002", 4500.0, 750));
        consumers.add(new Consumer("C003", "Charlie", "1988-02-10", "SSN003", 6000.0, 500));
        consumers.add(new Consumer("C004", "David", "1995-11-02", "SSN004", 4000.0, 800));
        consumers.add(new Consumer("C005", "Eve", "1992-09-14", "SSN005", 5500.0, 300));
        
		csrObj.setConsumerList(new ArrayList<>(consumers)); 
	}
	
	// Test totalConsumerCountForEachCreditScoreRange method
	@Test
	public void test11TotalConsumerCountForEachCreditScoreRange() throws InvalidConsumerException
	{	 
		Map<Integer, Integer> expected = new HashMap<>();
		expected.put(800,2);
		expected.put(750,1);
		expected.put(500,1);
		expected.put(300,1);
		
		assertEquals(expected, csrObj.totalConsumerCountForEachCreditScoreRange());
	}
	
	// Test totalConsumerCountForEachCreditScoreRange method when the list is empty
	@Test
	public void test12TotalConsumerCountForEachCreditScoreRangeForEmptyList()
	{
		csrObj.setConsumerList(new ArrayList<>());
		
		assertThrows(InvalidConsumerException.class, () -> {
			csrObj.totalConsumerCountForEachCreditScoreRange();
		});
		
		csrObj.setConsumerList(new ArrayList<>(consumers));
		
	}
	
	//Test the viewConsumerReportBasedOnCreditScore method when creditScore is between 800 to 900
	@Test
	public void test13ViewConsumerReportBasedOnCreditScoreWhenExcellent() throws InvalidConsumerException
	{
		assertEquals("EXCELLENT", csrObj.viewConsumerReportBasedOnCreditScore(850));
	}
	
	//Test the viewConsumerReportBasedOnCreditScore method when creditScore is between 600 to 799
	@Test
	public void test14ViewConsumerReportBasedOnCreditScoreWhenGood() throws InvalidConsumerException
	{
		assertEquals("GOOD", csrObj.viewConsumerReportBasedOnCreditScore(700));
	}
	
	//Test the viewConsumerReportBasedOnCreditScore method when creditScore is between 500 to 599
	@Test
	public void test15ViewConsumerReportBasedOnCreditScoreWhenFair() throws InvalidConsumerException
	{
		assertEquals("FAIR", csrObj.viewConsumerReportBasedOnCreditScore(550));
	}
	
	//Test the viewConsumerReportBasedOnCreditScore method when creditScore is between 300 to 499
	@Test
	public void test16ViewConsumerReportBasedOnCreditScoreWhenPoor() throws InvalidConsumerException
	{
		assertEquals("POOR", csrObj.viewConsumerReportBasedOnCreditScore(400));
	}
	
	//Test the viewConsumerReportBasedOnCreditScore method For EmptyList
	@Test
	public void test17ViewConsumerReportBasedOnCreditScoreForEmptyList()
	{
		csrObj.setConsumerList(new ArrayList<>());
		
		assertThrows(InvalidConsumerException.class, () -> {
	            csrObj.viewConsumerReportBasedOnCreditScore(250);
	        });
		
		csrObj.setConsumerList(new ArrayList<>(consumers));
	}
}
	 	  	  	 		  	     	      	 	
