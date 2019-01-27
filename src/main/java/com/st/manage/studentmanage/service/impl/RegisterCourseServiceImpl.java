package com.st.manage.studentmanage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.st.manage.studentmanage.dto.RegisterCourseDTO;
import com.st.manage.studentmanage.entity.Course;
import com.st.manage.studentmanage.entity.RegisterCourse;
import com.st.manage.studentmanage.entity.Student;
import com.st.manage.studentmanage.repository.Register_StudentRepository;
import com.st.manage.studentmanage.service.RegisterCourceService;

@Service
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class RegisterCourseServiceImpl implements RegisterCourceService{
	
	@Autowired
	private Register_StudentRepository registerRepository;

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void register(RegisterCourseDTO regisCourseDTO) {
		RegisterCourse registerCourse= new RegisterCourse();
		registerCourse.setRegid(regisCourseDTO.getRegid());
		registerCourse.setRegdate(regisCourseDTO.getRegdate());
		
		registerCourse.setStudent(new Student(regisCourseDTO.getStudentDTO().getSid(),regisCourseDTO.getStudentDTO().getSname(),
										regisCourseDTO.getStudentDTO().getScontact(),regisCourseDTO.getStudentDTO().getSaddress()));
		
		registerCourse.setCourse(new Course(regisCourseDTO.getCourseDTO().getCid(),regisCourseDTO.getCourseDTO().getCname(),
				regisCourseDTO.getCourseDTO().getCperiod()));
		
		registerRepository.save(registerCourse);
		
	}

	@Override
	public List<RegisterCourseDTO> findAllRegisters() {
		// TODO Auto-generated method stub
		return null;
	}


}
