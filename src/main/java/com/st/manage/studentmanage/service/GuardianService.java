package com.st.manage.studentmanage.service;

import java.util.List;

import com.st.manage.studentmanage.dto.GuardianDTO;

public interface GuardianService {
	
	void saveGuardian(GuardianDTO guardianDTO);

    void updateGuardian(GuardianDTO guardianDTO);

    void deleteGuardian(String gid);

    GuardianDTO findGuardian(String gid);

    List<GuardianDTO> findAllGuardian();

}
