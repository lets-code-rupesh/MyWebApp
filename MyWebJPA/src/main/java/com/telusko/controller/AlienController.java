package com.telusko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.telusko.dao.AlienRepo;
import com.telusko.model.Alien;

@Controller
public class AlienController {

	@Autowired
	AlienRepo alienRepo; 
	
	@RequestMapping("/")
	public String homepage() {
		return "home";
	}

	@RequestMapping("/addAlien")
	public String addpage(Alien alien) {
		alienRepo.save(alien);
		return "home";
	}
	
}
