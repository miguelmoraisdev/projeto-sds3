package com.miguelm.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miguelm.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
