package com.nodojo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	//GET
		@RequestMapping(value="/user/",method = RequestMethod.GET)
		public @ResponseBody String  getUsers(){
			return " : Entered in getUsers, return all users. List the URIs and perhaps other details of the collection's members.";	
		}
		@RequestMapping(value="/user/{userId}",method = RequestMethod.GET)
		public @ResponseBody String  getUser(@PathVariable Long userId){
			return "Entered in getUser with userId = "+userId+" .Retrieve a representation of the addressed member of the collection, expressed in an appropriate Internet media type.";
		}
	
	//PUT
		@RequestMapping(value="/user/",method = RequestMethod.PUT)
		public @ResponseBody String putUsers(){
			return "Entered in putUsers, Replace the entire collection with another collection.";
		}
		@RequestMapping(value="/user/{userId}",method = RequestMethod.PUT)
		public @ResponseBody String putUser(@PathVariable Long userId, @RequestParam(required=false) String userName, @RequestParam(required=false) String password ){
			//required=false return  null if param is empty
			return "Entered in putUser, with id = "+userId+", name = "+userName+" and password = "+password+". Replace the addressed member of the collection, or if it does not exist, create it.";
		}
	
	//POST
		@RequestMapping(value="/user/",method = RequestMethod.POST)
		public @ResponseBody String postUser(@RequestParam(required=true) String userName, @RequestParam(required=true) String password ){
			//TODO return the created item URI
			return "Entered in postUser. Create a new entry in the collection with userName = "+userName+" and password = "+password+". The new entry's URI is assigned automatically and is usually returned by the operation.";
		}
		
	//DELETE
		@RequestMapping(value="/user/",method = RequestMethod.DELETE)
		public @ResponseBody String deleteUsers(){
			return "Entered in deleteUsers. Delete the entire collection.";
		}
		@RequestMapping(value="/user/{userId}",method = RequestMethod.DELETE)
		public @ResponseBody String deleteUser(@PathVariable Long userId){
			return "Entered in deleteUser. Delete the addressed member of the collection with id = "+userId+".";
		}
}