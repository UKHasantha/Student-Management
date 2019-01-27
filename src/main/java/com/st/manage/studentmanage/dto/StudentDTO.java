package com.st.manage.studentmanage.dto;

import java.util.List;

public class StudentDTO {
	String sid;
	String sname;
	String scontact;
	String saddress;
	private GuardianDTO guardianDTO;
	private List<CourseDTO> coursesDtos;
	
	public StudentDTO() {
		super();
	}
	
	public StudentDTO(String sid, String sname, String scontact, String saddress) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scontact = scontact;
		this.saddress = saddress;
	}

	public String getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}

	public String getScontact() {
		return scontact;
	}

	public String getSaddress() {
		return saddress;
	}

	public GuardianDTO getGuardianDTO() {
		return guardianDTO;
	}

	public List<CourseDTO> getCoursesDtos() {
		return coursesDtos;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setScontact(String scontact) {
		this.scontact = scontact;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public void setGuardianDTO(GuardianDTO guardianDTO) {
		this.guardianDTO = guardianDTO;
	}

	public void setCoursesDtos(List<CourseDTO> coursesDtos) {
		this.coursesDtos = coursesDtos;
	}

	@Override
	public String toString() {
		return "StudentDTO [sid=" + sid + ", sname=" + sname + ", scontact=" + scontact + ", saddress=" + saddress
				+ ", guardianDTO=" + guardianDTO + ", coursesDtos=" + coursesDtos + "]";
	}
	
}
