package com.st.manage.studentmanage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.st.manage.studentmanage.entity.Users;
import com.st.manage.studentmanage.repository.UserRepository;
import com.st.manage.studentmanage.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public boolean canAuthenticate(String username, String password) {
		 boolean exists = userRepository.existsById(username);
	        if (!exists){
	            return false;
	        }
	        Users user = userRepository.findById(username).get();
	        return user.getPassword().equals(password);
	}

}
