package com.zensar.order.bo;

import com.zensar.order.dto.Order;
import com.zensar.order.exception.BOException;

public interface OrderBO {
	boolean placeOrder (Order order) throws BOException;
}
