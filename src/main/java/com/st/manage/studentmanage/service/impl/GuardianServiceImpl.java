package com.st.manage.studentmanage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.st.manage.studentmanage.dto.GuardianDTO;
import com.st.manage.studentmanage.entity.Guardian;
import com.st.manage.studentmanage.repository.GuardianRepository;
import com.st.manage.studentmanage.service.GuardianService;

@Service
public class GuardianServiceImpl implements GuardianService{

	@Autowired
	private GuardianRepository guardianRepository;
	
	@Override
	public void saveGuardian(GuardianDTO guardianDTO) {
		guardianRepository.save(new Guardian(guardianDTO.getGid(),guardianDTO.getGname(),guardianDTO.getGcontact(),guardianDTO.getGaddress()));
	}

	@Override
	public void updateGuardian(GuardianDTO guardianDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGuardian(String gid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GuardianDTO findGuardian(String gid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GuardianDTO> findAllGuardian() {
		// TODO Auto-generated method stub
		return null;
	}

}
