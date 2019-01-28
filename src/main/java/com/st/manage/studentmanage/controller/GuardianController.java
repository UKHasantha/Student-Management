package com.st.manage.studentmanage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.manage.studentmanage.dto.GuardianDTO;
import com.st.manage.studentmanage.service.GuardianService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/guardians")
public class GuardianController {
	
	@Autowired
	private GuardianService guardianService;
	
	@PostMapping
	public boolean saveGurdian(@RequestBody GuardianDTO guardianDTO) {
		guardianService.saveGuardian(guardianDTO);
		return true;
		
	}
	@GetMapping
	public List<GuardianDTO> allGuardian(){
		return guardianService.findAllGuardian();
	}

}
