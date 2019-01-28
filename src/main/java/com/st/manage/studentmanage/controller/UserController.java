package com.st.manage.studentmanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.manage.studentmanage.dto.UserDTO;
import com.st.manage.studentmanage.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/login")
public class UserController {

	  @Autowired
	  UserService userService;

	 @PostMapping
	    public boolean canAuthenticate(@RequestBody UserDTO userDto){
	        return userService.canAuthenticate(userDto.getUsername() , userDto.getPassword());
	 }

	
}
