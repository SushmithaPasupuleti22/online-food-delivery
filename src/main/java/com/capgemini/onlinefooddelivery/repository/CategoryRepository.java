package com.capgemini.onlinefooddelivery.repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capgemini.onlinefooddelivery.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer>{
	public static final EntityManager entityManager = null;
	public default Category removeCategory(int catId) {
		Query query = entityManager.createNativeQuery("DELETE FROM category "
				+ "  WHERE cat_Id LIKE ?;", Category.class);
        query.setParameter(1, catId + "%");

        return (Category) query.getResultList();
		
	}


	public default Category findByName(String categoryName) {
		return new Category(); 
	}


}
