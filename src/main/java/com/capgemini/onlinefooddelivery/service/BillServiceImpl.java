package com.capgemini.onlinefooddelivery.service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinefooddelivery.model.Bill;
import com.capgemini.onlinefooddelivery.repository.BillRepository;
import com.capgemini.onlinefooddelivery.service.BillService;


@Service
public class BillServiceImpl implements BillService {

	
	  @Autowired 
	  BillRepository billRepo;
	 
	
	@Override
	public Bill addBill(Bill bill) {
		return billRepo.saveAndFlush(bill);
	}

	@Override
	public Bill updateBill(Bill bill) {
		return billRepo.saveAndFlush(bill);
	}

	@Override
	public Bill removeBill(int billId) {
		Bill bill=billRepo.findById(billId).get(); 
		billRepo.deleteById(billId); 
		 return bill;
	}

	@Override
	public Bill viewBill(int billId) {

		return billRepo.findById(billId).get();
	}

	@Override
	public List<Bill> viewBills(LocalDate startDate, LocalDate endDate) {
		
		List<Bill> viewBills=billRepo.findAll();
		return viewBills.stream()
				.filter(a->
				a.getStartDateTime().toString().equals(startDate.toString())&&
				a.getEndDateTime().toString().equals(endDate.toString()))
				.collect(Collectors.toList());
	}

	@Override
	public List<Bill> viewBills(int customerid) {
		List<Bill> list = (List<Bill>)billRepo.findById(customerid).get();
		return list;
	}

	@Override
	public double calculateTotalCost(int billId) {
		return billRepo.getById(billId).getTotalCost();
	}


}
