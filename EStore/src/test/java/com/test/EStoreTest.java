package com.test;
import com.exception.InvalidOnlineOrderException;
import com.model.OnlineOrder;
import com.test.Main;
import com.util.EStore;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class EStoreTest {
	private static EStore bObj;

	@BeforeAll
	public static void setUp() throws Exception {
				
		//Create few  objects for OnlineOrder class and add to a list.
		//Set that list to the onlineOrderList using the setOnlineOrderList method in EStore
		bObj = new EStore();
		List<OnlineOrder> orders = new ArrayList<>();
		orders.add(new OnlineOrder(1, "Alice", "Laptop", "Electronics", 1, "Home Delivery", 50000.0));
		orders.add(new OnlineOrder(2, "Bob", "Phone", "Mobiles", 2, "Store Pickup", 30000.0));
		bObj.setOnlineOrderList(orders);
	}

	//Test the validateItemType method when the item type is Electronics
	@Test
	public void test11ValidateItemTypeWhenElectronics() throws InvalidOnlineOrderException{
		assertTrue(bObj.validateItemType("Electronics"));
	}
	
	//Test the validateItemType method when the item type is Mobiles
	@Test
	public void test12ValidateItemTypeWhenMobiles() throws InvalidOnlineOrderException{
		assertTrue(bObj.validateItemType("Mobiles"));
	}
	
	//Test the validateItemType method when the item type is Essentials
	@Test
	public void test13ValidateItemTypeWhenEssentials() throws InvalidOnlineOrderException{
		assertTrue(bObj.validateItemType("Essentials"));
	}

	//Test the validateItemType method when the item type is Fashion
	@Test
	public void test14ValidateItemTypeWhenFashion() throws InvalidOnlineOrderException{
        assertTrue(bObj.validateItemType("Fashion"));
	}
	
	//Test the validateItemType method when the item type is Invalid
	@Test
	public void test15ValidateItemTypeWhenInvalid() throws InvalidOnlineOrderException{
		bObj.validateItemType("InvalidType");
	}
	
	
	//Test the viewOnlineOrdersByOrderId method when the value is valid
	@Test
	public void test16ViewOnlineOrdersByOrderIdWhenValid() throws InvalidOnlineOrderException{
		OnlineOrder order = bObj.viewOnlineOrdersByOrderId(1);
		assertEquals(1, order.getOrderId());
		assertEquals("Alice", order.getCustomerName());

	}

	//Test the viewOnlineOrdersByOrderId method when the value is Invalid
	@Test
	public void test17ViewOnlineOrdersByOrderIdWhenInvalid()  throws InvalidOnlineOrderException{
		 bObj.viewOnlineOrdersByOrderId(999);
	} 
}
