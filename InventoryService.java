package com.example.Spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Spring.model.Inventory;

/*
Created By 		: Lakshmi.K
Created Date 	: 13/09/2019
Description		: Interface for InventoryServiceImplement Class to perform CRUD operations.
*/



	@Service
	public interface InventoryService {

		List<Inventory> ListAll();
		Inventory Save(Inventory inventory);   
		Optional<Inventory> GetByS_no(long s_no);
		void DeleteById(Long s_no);
	
	}
	
	   