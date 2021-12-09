package com.capgemini.onlinefooddelivery.controller;
  
import java.time.LocalDate;
import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlinefooddelivery.model.Bill;
import com.capgemini.onlinefooddelivery.service.BillServiceImpl;
  
  @RestController
  @RequestMapping("/bill")
  public class BillController {
  
  
  @Autowired public BillServiceImpl billService;
  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping("/add")
  public Bill addBill(@RequestBody Bill bill) {
	  return billService.addBill(bill);
  }
  @PutMapping("/update")
  public Bill updateBill(@RequestBody  Bill bill) throws AccountNotFoundException {
	  Bill bill1=null;
		try {
	  bill=billService.updateBill(bill1);
		}
		catch(Exception e) {
			throw new AccountNotFoundException("CustomerBill is not found for updating");
		}
		return bill;
  }
  @DeleteMapping("/delete/{billId}")
  public Bill removeBill(@PathVariable("billId")  int billId) throws AccountNotFoundException {
	  Bill bill=null;
		try {
	  bill=billService.removeBill(billId);
		}
		catch(Exception e) {
			throw new AccountNotFoundException("CustomerBill is not found for deleting"+billId);
		}
		return bill;
	  
  }
  @GetMapping("/view/{billId}")
  public Bill viewBill(@PathVariable("billId") int billId) throws AccountNotFoundException {
	  
	  Bill bill=null;
		try {
	  bill= billService.viewBill(billId);
		}
		catch(Exception e) {
			throw new AccountNotFoundException("CustomerBill is not found for viewing"+billId);
		}
		return bill;
	
  }
  
  @GetMapping("/viewBills")
  public List<Bill> viewBills(LocalDate startDate, LocalDate endDate) throws AccountNotFoundException {
	  
	  
	  Bill bill=null;
		try {
	  bill= (Bill) billService.viewBills(startDate, endDate);
		}
		catch(Exception e) {
			throw new AccountNotFoundException("CustomerBill is not found for viewing");
		}
		return (List<Bill>) bill;

  }
  @GetMapping("/viewBills/{customerid}")
  public List<Bill> viewBills(@PathVariable("customerid") int customerid) throws AccountNotFoundException {
	  
	  
	  Bill bill=null;
		try {
	  bill=(Bill) billService.viewBills(customerid);
		}
		catch(Exception e) {
			throw new AccountNotFoundException("CustomerBill is not found for viewing");
		}
		return (List<Bill>) bill;
  }
  @GetMapping("/totalCost/{billId}")
  public double calculateTotalCost(@PathVariable("billId") int billId) throws AccountNotFoundException {
	  
	  
	  double bill=(Double) null;
		try {
	  bill=billService.calculateTotalCost(billId);
		}
		catch(Exception e) {
			throw new AccountNotFoundException("CustomerBill is not found for viewing");
		}
		return bill;
	  
  }
  
  }
 