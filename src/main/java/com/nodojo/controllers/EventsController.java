package com.nodojo.controllers;

//import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nodojo.models.Events;

@RestController
public class EventsController {
	//private final AtomicLong counter = new AtomicLong();
	
	@PostMapping(value="/event")
	@ResponseBody
	public Events post_event(	@RequestParam(value="name") String r_name,
						@RequestParam(value="date",defaultValue="today") String r_date,
						@RequestParam(value="address",defaultValue="DefaultAddress") String r_address){
					
		//return new Events(counter.incrementAndGet(), r_name, r_date, r_address);
		return new Events(r_name, r_date, r_address);
	}
	
	@GetMapping(value="/event")
	@ResponseBody
	public Events get_event(@RequestParam(value="name") String r_name,
			@RequestParam(value="date",defaultValue="today") String r_date,
			@RequestParam(value="address",defaultValue="DefaultAddress") String r_address){
		
		//return new Events(counter.incrementAndGet(), "Dojo Spring", "12 octobre 2016", "Epsi");
		return new Events("Dojo Spring", "12 octobre 2016", "Epsi");
	}
	
	
}
