package com.thinkxfactor.zomatoplus.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.repo.ItemsRepository;
import com.thinkxfactor.zomatoplus.repo.RestaurantRepository;




@RestController
@RequestMapping("/restaurant")
public class RestaurantController
{
	@Autowired
	private RestaurantRepository resRepository;
	
	@Autowired
	private ItemsRepository itemRepository;
	
	@PostMapping("/add")
	public Restaurant addres(@RequestBody Restaurant res) {
		Restaurant persistedRes = resRepository.save(res);
		return persistedRes;
	}
	@GetMapping("/getAll")
	public List<Restaurant> getAll(){
		List<Restaurant> res1 = resRepository.findAll();
		return res1;	
	}
	@PostMapping("/createItems")
	public Items addItem(@RequestBody Items items1) {
		Items persistedItem = itemRepository.save(items1);
		return persistedItem;
	}
	@GetMapping("/getallitem")
	public List<Items> getallitem(){
		List<Items> items2 = itemRepository.findAll();
		return items2;	
		
	}
	
}

