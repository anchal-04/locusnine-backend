package com.locusnine.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locusnine.Request.UserRequest;
import com.locusnine.dto.UserDetailsDTO;
import com.locusnine.entity.UserEntity;
import com.locusnine.repository.UserRepository;
import com.locusnine.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<UserDetailsDTO> getUsers() {
		List<UserEntity> userEntity = userRepository.findAll();
		List<UserDetailsDTO> userDetailsList = userEntity.stream().map(w -> modelMapper.map(w, UserDetailsDTO.class))
				.collect(Collectors.toList());
		return userDetailsList;
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public void addUser(UserRequest userRequest) {
		UserEntity userEntity = new UserEntity();
		userEntity.setUserEmail(userRequest.getUserEmail());
		userEntity.setUserName(userRequest.getUserName());
		userEntity.setUserRole(userRequest.getUserRole());
		userEntity.setUserStatus(userRequest.getUserStatus());
		userRepository.save(userEntity);
	}

	@Override
	public void editUser(UserRequest userRequest) {
		UserEntity userEntity = new UserEntity();
		userEntity.setUserId(userRequest.getUserId());
		userEntity.setUserEmail(userRequest.getUserEmail());
		userEntity.setUserName(userRequest.getUserName());
		userEntity.setUserRole(userRequest.getUserRole());
		userEntity.setUserStatus(userRequest.getUserStatus());
		userRepository.save(userEntity);
	}

}
