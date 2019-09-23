package com.example.Spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring.model.Inventory;


/*
Created By 	: Lakshmi.K
Created Date 	: 13/09/2019
Description	:  It will operate all DB operations through this repository. 
*/


	@Repository
	public interface InventoryRepository extends CrudRepository<Inventory , Long> {

	}
