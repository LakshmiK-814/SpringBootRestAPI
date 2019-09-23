package com.example.Spring.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring.model.Inventory;
import com.example.Spring.services.InventoryService;

/*
Created By 		: Lakshmi.K
Created Date 	: 13/09/2019
Description		: It  controls the   UI and Service.
*/



	@RestController
	@RequestMapping(value = "/inventory")
	public class InventoryController
	{
	
		private InventoryService inventoryservice;
		
		
		@Autowired
		public void setInventoryService(InventoryService inventoryservice) {
			this.inventoryservice = inventoryservice;
		}
		
		
		
		// Get the all Inventories from the system
		@GetMapping("/get")
		public List<Inventory> GetInventories() {
			List<Inventory> lstInvenries;
			lstInvenries = inventoryservice.ListAll();
			return lstInvenries;
			}
		
		
		// Add the Inventory from the user
	     @PostMapping("/add")
		 public Inventory PostInventory(@RequestBody Inventory inventory ) {
			inventory = inventoryservice.Save(inventory);		
			return inventory;
			}
		
	     // Get the specific Inventory from the id
		@GetMapping("/get/{s_no}")
		public Optional<Inventory> GetByS_no(@PathVariable("s_no") int s_no) {
			return inventoryservice.GetByS_no(s_no);
			}
		
		
		// Delete the particular Inventory from the id
		@DeleteMapping("/delete/{s_no}")
		public void deleteById(@PathVariable("s_no") long s_no) {
			 inventoryservice.DeleteById(s_no);
		}
	
}