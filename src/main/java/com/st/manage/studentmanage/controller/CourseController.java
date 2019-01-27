package com.st.manage.studentmanage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.st.manage.studentmanage.dto.CourseDTO;
import com.st.manage.studentmanage.service.CourseService;

@CrossOrigin
@RestController
@RequestMapping("api/v1/courses")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping
	public boolean saveStudent(@RequestBody CourseDTO courseDTO) {
		System.out.println("CourseDTO"+courseDTO);
		courseService.saveCourse(courseDTO);
		return true;
	}
	
	@GetMapping
	public List<CourseDTO> getAllCourses(){
		return courseService.findAllCourse();
	}
}
