package com.zensar.order.bo;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import java.sql.SQLException;

import org.mockito.MockitoAnnotations;

import com.zensar.order.dao.OrderDAO;
import com.zensar.order.dto.Order;
import com.zensar.order.exception.BOException;

public class OrderBOImplTest {
	
	@Mock
	OrderDAO dao;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	

	@Test
	public void placeOrderShouldCreateAnOrder() throws BOException, SQLException {
		
		OrderBOImpl bo=new OrderBOImpl();
		
		bo.setDao(dao);
		
		Order order=new Order();
		
		when(dao.create(order)).thenReturn(new Integer(1));
		
		boolean result = bo.placeOrder(order);
		
		assertTrue(result);
		
	}

}
