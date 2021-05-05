package com.miguelm.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miguelm.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
