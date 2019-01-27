package com.st.manage.studentmanage.service;

import java.util.List;

import com.st.manage.studentmanage.dto.StudentDTO;

public interface StudentService {
	
	void saveStudent( StudentDTO studentDTO);

    void updateStudent(String sid, StudentDTO studentDTO);

    void deleteStudent(String sid);

    StudentDTO findStudent(String sid);

    List<StudentDTO> findAllStudents();

}
