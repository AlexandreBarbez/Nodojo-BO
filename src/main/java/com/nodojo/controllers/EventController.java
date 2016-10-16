package com.nodojo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {	
	
	//GET
		@RequestMapping(value="/event/",method = RequestMethod.GET)
		public @ResponseBody String  getEvents(){
			return " : Entered in getEvents, return all events. List the URIs and perhaps other details of the collection's members.";	
		}
		@RequestMapping(value="/event/{eventId}",method = RequestMethod.GET)
		public @ResponseBody String  getEvent(@PathVariable Long eventId){
			return "Entered in getEvent with eventId = "+eventId+" .Retrieve a representation of the addressed member of the collection, expressed in an appropriate Internet media type.";
		}
	
	//PUT
		@RequestMapping(value="/event/",method = RequestMethod.PUT)
		public @ResponseBody String putEvents(){
			return "Entered in putEvents, Replace the entire collection with another collection.";
		}
		@RequestMapping(value="/event/{eventId}",method = RequestMethod.PUT)
		public @ResponseBody String putEvent(@PathVariable Long eventId, @RequestParam(required=false) String eventTitle, @RequestParam(required=false) String description, @RequestParam(required=false) String date ){
			//required=false return  null if param is empty
			return "Entered in putEvent, with id = "+eventId+", name = "+eventTitle+", password = "+description+" and date = "+date+". Replace the addressed member of the collection, or if it does not exist, create it.";
		}
	
	//POST
		@RequestMapping(value="/event/",method = RequestMethod.POST)
		public @ResponseBody String postEvent(@RequestParam(required=true) String eventTitle, @RequestParam(required=true) String description ){
			//TODO return the created item URI
			return "Entered in postEvent. Create a new entry in the collection with eventTitle = "+eventTitle+" and description = "+description+". The new entry's URI is assigned automatically and is usually returned by the operation.";
		}
		
	//DELETE
		@RequestMapping(value="/event/",method = RequestMethod.DELETE)
		public @ResponseBody String deleteEvents(){
			return "Entered in deleteEvents. Delete the entire collection.";
		}
		@RequestMapping(value="/event/{eventId}",method = RequestMethod.DELETE)
		public @ResponseBody String deleteEvent(@PathVariable Long eventId){
			return "Entered in deleteEvent. Delete the addressed member of the collection with id = "+eventId+".";
		}
	
}
