package com.st.manage.studentmanage.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.st.manage.studentmanage.dto.CourseDTO;
import com.st.manage.studentmanage.entity.Course;
import com.st.manage.studentmanage.repository.CourseRepository;
import com.st.manage.studentmanage.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseRepository courseRepository;

	@Override
	public void saveCourse(CourseDTO courseDTO) {
		courseRepository.save(new Course(courseDTO.getCid(),courseDTO.getCname(),courseDTO.getCperiod()));	
	}
	
	@Override
	public long getTotalCourse() {
		return courseRepository.getTotalCourse();
	}

	@Override
	public void updateCourse(String cid,CourseDTO courseDTO) {
		if (courseRepository.existsById(cid)) {
			courseRepository.save(new Course(courseDTO.getCid(),courseDTO.getCname(),courseDTO.getCperiod()));
		}else {
			throw new RuntimeException("Course doesn't exists....");
		}
	}

	@Override
	public boolean deleteCourse(String cid) {
		courseRepository.deleteById(cid);
		return true;
	}

	@Override
	public CourseDTO findCourse(String cid) {
		return null;
	}

	@Override
	public List<CourseDTO> findAllCourse() {
		List<Course> couList=courseRepository.findAll();
		ArrayList<CourseDTO> courseDTOs=new ArrayList<>();
		couList.forEach(course->courseDTOs.add(new CourseDTO(course.getCid(),course.getCname(),course.getCperiod())));
		return courseDTOs;
	}

}
