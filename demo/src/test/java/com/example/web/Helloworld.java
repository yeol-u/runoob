package com.example.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

	@RequestMapping("/hello")
	public String abc(){
		return "helle";
		
	}
}
