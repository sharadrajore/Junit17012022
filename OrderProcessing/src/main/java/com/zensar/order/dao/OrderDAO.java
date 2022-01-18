package com.zensar.order.dao;

import java.sql.SQLException;

import com.zensar.order.dto.Order;

public interface OrderDAO {
	
	int create(Order order) throws SQLException;

}
