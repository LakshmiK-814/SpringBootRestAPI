package com.example.Spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 Created By 	: Lakshmi.k
 Created Date 	: 13/09/2019
 Description	: Inventory object.
 */

@Entity
public class Inventory 
{
	
		@Id
		@GeneratedValue(strategy= GenerationType.AUTO)
		private long s_no;
		private String model_name;   
		private String processor_type;
		private String memory_size;
		private String os_name;
		private String assigned_to;
			
			
		public long getS_no() 
		{
			return s_no;
		}
	
		public void setS_no(long s_no) 
		{
			this.s_no = s_no;
		}
	
		public String getModel_name()
		{	
			return model_name;
		}
	
		public void setModel_name(String model_name)
		{
		this.model_name = model_name;
		}
	
		public String getProcessor_type()
		{
			return processor_type;
		}
		
		public void setProcessor_type(String processor_type) 
		{
			this.processor_type = processor_type;
		}
		
		public String getMemory_size() 
		{
			return memory_size;
		}
	
		public void setMemory_size(String memory_size) 
		{
			this.memory_size = memory_size;
		}
		public String getOs_name() 
		{
			return os_name;
		}
		public void setOs_name(String os_name) 
		{ 
		this.os_name = os_name;
		}
	
	   public String getAssigned_to()
	   {
		  return assigned_to;
	    }
	  public void setAssigned_to(String assigned_to) 
	  {
		  this.assigned_to = assigned_to;
	  }
	   
}
