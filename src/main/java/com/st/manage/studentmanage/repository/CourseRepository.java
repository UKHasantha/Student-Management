package com.st.manage.studentmanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.st.manage.studentmanage.entity.Course;

public interface CourseRepository extends JpaRepository<Course, String>{

}
