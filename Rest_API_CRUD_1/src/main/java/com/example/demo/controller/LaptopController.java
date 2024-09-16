package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Laptop;

@RestController
@RequestMapping("/laptop")
public class LaptopController {
	
	Laptop laptop;
	
	@GetMapping(value= "{Serialnum}")
	public Laptop readlaptop(String Serialnum)
	{
		return new Laptop(Serialnum, "DELL", 12323.876);
	}
	@PostMapping
	public String createLaptop(@RequestBody  Laptop laptop)
	{
		this.laptop=laptop;
		return "Laptop created successfully";
	}
	@PutMapping()
	public String updateLaptop(@RequestBody Laptop laptop)
	{
		this.laptop=laptop;
		
		return "Laptop updated Successfully";
	}
	
	@DeleteMapping(value= "{Serialnum}")
	public String deleteLaptop(String Serialnum) {
			laptop =null;
		return "Laptop updated Successfully  !" ;
	}
	
	
	 

}

