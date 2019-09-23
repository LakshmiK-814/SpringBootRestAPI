package com.example.Spring.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Spring.model.Inventory;
import com.example.Spring.repository.InventoryRepository;


/*
Created By 		: Lakshmi.K
Created Date 	: 13/09/2019
Description		: This class will implements all the methods given in InventoryService class. 
*/


	@Service
	public class InventoryServiceImplement implements InventoryService {
	private InventoryRepository inventoryRepository;

	
		@Autowired
		public void  setInventoryRepository(InventoryRepository inventoryRepository) {
			this.inventoryRepository=inventoryRepository;
		}
	
	
		@Override
		public List<Inventory> ListAll(){
			List<Inventory> inventoryentity = new ArrayList<>();
			inventoryRepository.findAll().forEach(inventoryentity::add);
			return inventoryentity;
		}
	

		@Override
		public Inventory Save(Inventory inventory) {
			inventoryRepository.save(inventory);
			return inventory;
		}


		@Override
		public Optional<Inventory> GetByS_no(long s_no) {
			return inventoryRepository.findById(s_no);
		}

	
		@Override
		public void DeleteById(Long s_no) {
			inventoryRepository.deleteById(s_no);
		}

}