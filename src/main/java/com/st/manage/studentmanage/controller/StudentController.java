package com.st.manage.studentmanage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.manage.studentmanage.dto.StudentDTO;
import com.st.manage.studentmanage.service.StudentService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping
	public boolean saveStudent(@RequestBody StudentDTO studentDTO) {
		studentService.saveStudent(studentDTO);
		return true;
	}
	
	@GetMapping
	public List<StudentDTO> getAllStudent(){
		return studentService.findAllStudents();
	}
	
	@DeleteMapping
	public boolean deleteStudent(@PathVariable("sid") String sid) {
		studentService.deleteStudent(sid);
		return true;
	}
	
	@PutMapping("/{sid}")
	public void updateStudent(@PathVariable("sid")String sid, @RequestBody StudentDTO studentDTO) {
		studentService.updateStudent(sid, studentDTO);
	}
}
