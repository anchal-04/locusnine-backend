package com.locusnine.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.locusnine.Request.UserRequest;
import com.locusnine.api.UserApi;
import com.locusnine.dto.UserDetailsDTO;
import com.locusnine.service.UserService;



@RestController
@CrossOrigin
public class UserController implements UserApi {
	
	@Autowired
	private UserService userService;

	@Override
	public ResponseEntity<List<UserDetailsDTO>> getUsers() {
		return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<HttpStatus> addUser(UserRequest request) {
		userService.addUser(request);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<HttpStatus> deleteUser(Long id) {
		userService.deleteUser(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<HttpStatus> editUser(UserRequest request) {
		userService.editUser(request);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	
		
	

}
