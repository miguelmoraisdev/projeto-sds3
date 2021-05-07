package com.miguelm.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.miguelm.dsvendas.dtos.SaleSuccessDTO;
import com.miguelm.dsvendas.dtos.SaleSumDTO;
import com.miguelm.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new com.miguelm.dsvendas.dtos.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGrupedBySeller();
	
	@Query("SELECT new com.miguelm.dsvendas.dtos.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))"
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGrupedBySeller();
	
}
