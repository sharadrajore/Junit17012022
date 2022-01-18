package com.zensar.order.bo;

import java.sql.SQLException;

import com.zensar.order.dao.OrderDAO;
import com.zensar.order.dto.Order;
import com.zensar.order.exception.BOException;

public class OrderBOImpl implements OrderBO {
	
	private OrderDAO dao;


	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}



	public boolean placeOrder(Order order) throws BOException  {
		int result;
		try {
			result = dao.create(order);
			
			if(result==0) {
				return false;
			}
		
		} catch (SQLException e) {
			
			throw new BOException(e);
		}
		
			
		return true;
	}
	
	

}
