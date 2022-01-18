package com.zensar.order.dto;

public class Order {
	
	
	private int id;
	
	private String status;
	
	

	public Order() {
		super();
	}

	public Order(int id, String status) {
		super();
		this.id = id;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", status=" + status + "]";
	}
	
	

}
