package com.alisajidraza.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@Autowired
	Greeting greeting;
   AtomicLong counter =new AtomicLong();
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name")String name)
	{
		greeting.setId(counter.incrementAndGet());
		greeting.setContent("i am learning spring boot from "  +name);
		
		return greeting;
	}
}
