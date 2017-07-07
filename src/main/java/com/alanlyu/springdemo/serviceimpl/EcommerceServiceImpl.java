package com.alanlyu.springdemo.serviceimpl;

import java.util.Random;

import com.alanlyu.springdemo.service.BusinessService;

public class EcommerceServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\nAs an Organization, " + companyName +
						" provides an outstanding Ecommerce platform." +
						"\nThe annual income exceeds "+ random.nextInt(revenue) + "dollars.";
		return service;
	}

}
