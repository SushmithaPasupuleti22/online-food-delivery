package com.capgemini.onlinefooddelivery.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name = "bill")
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int billId;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime startDateTime;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime endDateTime;	
	@OneToOne
	private OrderDetails order;
	private int totalItem;
	private double totalCost;
	
	
	public Bill(int billId, LocalDateTime startDateTime, LocalDateTime endDateTime, OrderDetails order, int totalItem,
			double totalCost) {
		super();
		this.billId = billId;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.order = order;
		this.totalItem = totalItem;
		this.totalCost = totalCost;
	}
	public Bill() {
		super();

	}
	
	
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public LocalDateTime getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(LocalDateTime startDateTime) {
		this.startDateTime = startDateTime;
	}
	public LocalDateTime getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(LocalDateTime endDateTime) {
		this.endDateTime = endDateTime;
	}
	public OrderDetails getOrder() {
		return order;
	}
	public void setOrder(OrderDetails order) {
		this.order = order;
	}
	public int getTotalItem() {
		return totalItem;
	}
	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	
	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", startDateTime=" + startDateTime + ", endDateTime=" + endDateTime
				+ ", order=" + order + ", totalItem=" + totalItem + ", totalCost=" + totalCost + "]";
	}
	
	
	
}
