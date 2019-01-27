package com.st.manage.studentmanage.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.st.manage.studentmanage.dto.StudentDTO;
import com.st.manage.studentmanage.entity.Guardian;
import com.st.manage.studentmanage.entity.Student;
import com.st.manage.studentmanage.repository.StudentRepository;
import com.st.manage.studentmanage.service.StudentService;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly=true)
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void saveStudent(StudentDTO studentDTO) {
//		if (!studentDTO.getSid().equals(sid)) {
//			throw new RuntimeException("Student ID Not Found....!");
//		}
		studentRepository.save(new Student(studentDTO.getSid(), studentDTO.getSname(), 
				studentDTO.getScontact(), studentDTO.getSaddress()));
	}

	@Override
	public void updateStudent(String sid, StudentDTO studentDTO) {
//		if (!studentDTO.getSid().equals(sid)) {
//			throw new RuntimeException("Student ID not Found...!");
//		}
		if (studentRepository.existsById(sid)) {
			studentRepository.save(new Student(studentDTO.getSid(),studentDTO.getSname(),studentDTO.getScontact(),studentDTO.getSaddress()));
		}else {
			throw new RuntimeException("Student doesn't exists..");
		}
	}

	@Override
	public void deleteStudent(String sid) {
		studentRepository.deleteById(sid);
	}

	@Override
	public StudentDTO findStudent(String sid) {
		Student student=studentRepository.findById(sid).get();
		Guardian guardian=new Guardian();
		guardian.getGid();
		return new StudentDTO(student.getSid(),student.getSname(),student.getScontact(),student.getSaddress());
	}

	@Override
	public List<StudentDTO> findAllStudents() {
		List<Student> studList = studentRepository.findAll();
		List<StudentDTO> studentDTOs= new ArrayList<>();
		studList.forEach(student ->studentDTOs.add(new StudentDTO(student.getSid(),student.getSname(),
				student.getScontact(),student.getSaddress())));
		return studentDTOs;
	}
	

}
