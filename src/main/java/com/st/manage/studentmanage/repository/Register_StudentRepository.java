package com.st.manage.studentmanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.st.manage.studentmanage.entity.RegisterCourse;

public interface Register_StudentRepository extends JpaRepository<RegisterCourse, String>{

}
