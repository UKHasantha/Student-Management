package com.st.manage.studentmanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.st.manage.studentmanage.entity.Users;

public interface UserRepository extends JpaRepository<Users, String>{

}
