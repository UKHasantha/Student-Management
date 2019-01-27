package com.st.manage.studentmanage.service;

import java.util.List;

import com.st.manage.studentmanage.dto.RegisterCourseDTO;

public interface RegisterCourceService {
	
	 void register(RegisterCourseDTO regisCourseDTO);

	 List<RegisterCourseDTO> findAllRegisters();
}
