package com.capgemini.onlinefooddelivery.service;

import java.time.LocalDate;
import java.util.List;


import com.capgemini.onlinefooddelivery.model.Bill;

public interface BillService {

	public Bill addBill(Bill bill);
	public Bill updateBill(Bill bill);

	/*
	 * public Bill removeBill(Bill bill); public Bill viewBill(Bill bill);
	 */
	public Bill removeBill(int billId); 
	public Bill viewBill(int billId);
	public List<Bill> viewBills(LocalDate startDate,LocalDate endDate);
	public List<Bill> viewBills(int custId);
	public double calculateTotalCost(int billId);
}
