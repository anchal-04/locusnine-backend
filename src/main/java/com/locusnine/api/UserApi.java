package com.locusnine.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.locusnine.Request.UserRequest;
import com.locusnine.dto.UserDetailsDTO;

import io.swagger.annotations.ApiOperation;




@RequestMapping("/users")
public interface UserApi {
	
	@ApiOperation(value = "Fetch the information of user", nickname = "getUsers", notes = "Returns the information of the user", response = UserDetailsDTO.class, tags = {
	"User" })
	@GetMapping(produces = { "application/json" })
	ResponseEntity<List<UserDetailsDTO>> getUsers();
	
	@ApiOperation(value = "Add user in the application", nickname = "addUser", notes = "Adds new user", response = HttpStatus.class, tags = {
	"User" })
	@PostMapping(produces = { "application/json" })
	ResponseEntity<HttpStatus> addUser(@RequestBody UserRequest request);
	
	@ApiOperation(value = "Remove user in the application", nickname = "deleteUser", notes = "Remove existing user", response = HttpStatus.class, tags = {
	"User" })
	@DeleteMapping(produces = { "application/json" })
	ResponseEntity<HttpStatus> deleteUser(@RequestParam Long id);
	
	@ApiOperation(value = "Edit user in the application", nickname = "editUser", notes = "Edit existing user", response = HttpStatus.class, tags = {
	"User" })
	@PutMapping(produces = { "application/json" })
	ResponseEntity<HttpStatus> editUser(@RequestBody UserRequest request);


}
