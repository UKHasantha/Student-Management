package com.st.manage.studentmanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.st.manage.studentmanage.entity.Guardian;

public interface GuardianRepository extends JpaRepository<Guardian, String>{

}
