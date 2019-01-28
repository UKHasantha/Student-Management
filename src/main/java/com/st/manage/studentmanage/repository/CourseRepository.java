package com.st.manage.studentmanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.st.manage.studentmanage.entity.Course;

public interface CourseRepository extends JpaRepository<Course, String>{
	
	 @Query("SELECT count(c.cid) FROM Course c")
	    long getTotalCourse();

}
