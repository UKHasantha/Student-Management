package com.st.manage.studentmanage.service;

import java.util.List;

import com.st.manage.studentmanage.dto.CourseDTO;


public interface CourseService {
	
	void saveCourse(CourseDTO courseDTO);

    void updateCourse(String cid,CourseDTO courseDTO);

    void deleteCourse(String cid);

    CourseDTO findCourse(String cid);

    List<CourseDTO> findAllCourse();

}
