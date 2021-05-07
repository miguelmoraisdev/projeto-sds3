package com.miguelm.dsvendas.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miguelm.dsvendas.dtos.SaleDTO;
import com.miguelm.dsvendas.dtos.SaleSuccessDTO;
import com.miguelm.dsvendas.dtos.SaleSumDTO;
import com.miguelm.dsvendas.entities.Sale;
import com.miguelm.dsvendas.repositories.SaleRepository;
import com.miguelm.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGrupedBySeller() {
		return repository.amountGrupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGrupedBySeller() {
		return repository.successGrupedBySeller();
	}
	
}
