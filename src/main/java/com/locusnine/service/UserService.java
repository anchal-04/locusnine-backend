package com.locusnine.service;

import java.util.List;

import com.locusnine.Request.UserRequest;
import com.locusnine.dto.UserDetailsDTO;

public interface UserService {
	
	List<UserDetailsDTO> getUsers();
	
	void deleteUser(Long id);
	
	void addUser(UserRequest userRequest);
	
	void editUser(UserRequest userRequest);

}
