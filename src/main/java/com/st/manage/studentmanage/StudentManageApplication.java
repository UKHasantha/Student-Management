package com.st.manage.studentmanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.st.manage.studentmanage.repository.StudentRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses= StudentRepository.class)
public class StudentManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManageApplication.class, args);
	}

}

