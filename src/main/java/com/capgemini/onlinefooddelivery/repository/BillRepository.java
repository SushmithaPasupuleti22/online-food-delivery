package com.capgemini.onlinefooddelivery.repository;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.onlinefooddelivery.model.Bill;

@Repository

public interface BillRepository extends JpaRepository<Bill,Integer> {
	/*
	 * public static final EntityManager entityManager = null;
	 * 
	 * public default List<Bill> viewBills(LocalDate startDate, LocalDate endDate){
	 * Query query = entityManager.
	 * createNativeQuery("SELECT em.* FROM spring_data_jpa_example.employee as em "
	 * + "WHERE em.firstname LIKE ?", Employee.class); query.setParameter(1,
	 * firstName + "%");
	 * 
	 * return query.getResultList(); }
	 */
	}

