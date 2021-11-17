package com.technohunk.controller;


import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technohunk.dto.CustomerDTO;
import com.technohunk.dto.UserCredentialDto;
import com.technohunk.service.UserService;

@RestController
@RequestMapping("/v1")
public class UserCredentialController {

	@Autowired
	private UserService userService;
	
	
	
	@GetMapping("/users/{uid}")
	public UserCredentialDto  getAllUser(@PathVariable int uid){
		return userService.findById(uid);
	}
	
	@PostMapping("/users/")
	public ResponseEntity<?> registerUser(@RequestBody UserCredentialDto user, @RequestBody CustomerDTO customer ){
		user.setCustomer(customer);
		if(userService.save(user)) {
			URI auth = null;
			try {
				auth = new URI("/auth");
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return (ResponseEntity<?>) ResponseEntity.created(auth);
			
		}
		return (ResponseEntity<?>) ResponseEntity.unprocessableEntity();
	}
	
}
