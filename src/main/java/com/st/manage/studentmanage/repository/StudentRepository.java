package com.st.manage.studentmanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.st.manage.studentmanage.entity.Student;

public interface StudentRepository extends JpaRepository<Student, String>{

}
