package com.st.manage.studentmanage.dto;

import java.util.List;

public class CourseDTO {
	String cid;
	String cname;
	String cperiod;
	private List<StudentDTO> studentsDtos;
	private List<SubjectDTO> subjectsDtos;
	
	public CourseDTO() {
		super();
	}

	public CourseDTO(String cid, String cname, String cperiod) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cperiod = cperiod;
	}

	public String getCid() {
		return cid;
	}

	public String getCname() {
		return cname;
	}

	public String getCperiod() {
		return cperiod;
	}

	public List<StudentDTO> getStudentsDtos() {
		return studentsDtos;
	}

	public List<SubjectDTO> getSubjectsDtos() {
		return subjectsDtos;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public void setCperiod(String cperiod) {
		this.cperiod = cperiod;
	}

	public void setStudentsDtos(List<StudentDTO> studentsDtos) {
		this.studentsDtos = studentsDtos;
	}

	public void setSubjectsDtos(List<SubjectDTO> subjectsDtos) {
		this.subjectsDtos = subjectsDtos;
	}

	@Override
	public String toString() {
		return "CourseDTO [cid=" + cid + ", cname=" + cname + ", cperiod=" + cperiod + ", studentsDtos=" + studentsDtos
				+ ", subjectsDtos=" + subjectsDtos + "]";
	}
	
	

}
