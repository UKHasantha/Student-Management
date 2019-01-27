package com.st.manage.studentmanage.dto;

import java.util.List;

public class SubjectDTO {
	String sbid;
	String sbname;
	private List<ExamDTO> examsDtos;
	private List<CourseDTO> coursesDtos;
	
	public SubjectDTO() {
		super();
	}

	public SubjectDTO(String sbid, String sbname) {
		super();
		this.sbid = sbid;
		this.sbname = sbname;
	}

	public String getSbid() {
		return sbid;
	}

	public String getSbname() {
		return sbname;
	}

	public List<ExamDTO> getExamsDtos() {
		return examsDtos;
	}

	public List<CourseDTO> getCoursesDtos() {
		return coursesDtos;
	}

	public void setSbid(String sbid) {
		this.sbid = sbid;
	}

	public void setSbname(String sbname) {
		this.sbname = sbname;
	}

	public void setExamsDtos(List<ExamDTO> examsDtos) {
		this.examsDtos = examsDtos;
	}

	public void setCoursesDtos(List<CourseDTO> coursesDtos) {
		this.coursesDtos = coursesDtos;
	}

	@Override
	public String toString() {
		return "SubjectDTO [sbid=" + sbid + ", sbname=" + sbname + ", examsDtos=" + examsDtos + ", coursesDtos="
				+ coursesDtos + "]";
	}
	
}
