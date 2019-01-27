package com.st.manage.studentmanage.dto;


public class RegisterCourseDTO {
	
	private String regid;
	private String regdate;
	private StudentDTO studentDTO;
	private CourseDTO courseDTO;
	
	public RegisterCourseDTO() {
		super();
	}

	public RegisterCourseDTO(String regid, String regdate, StudentDTO studentDTO, CourseDTO courseDTO) {
		super();
		this.regid = regid;
		this.regdate = regdate;
		this.studentDTO = studentDTO;
		this.courseDTO = courseDTO;
	}

	public String getRegid() {
		return regid;
	}

	public String getRegdate() {
		return regdate;
	}

	public StudentDTO getStudentDTO() {
		return studentDTO;
	}

	public CourseDTO getCourseDTO() {
		return courseDTO;
	}

	public void setRegid(String regid) {
		this.regid = regid;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public void setStudentDTO(StudentDTO studentDTO) {
		this.studentDTO = studentDTO;
	}

	public void setCourseDTO(CourseDTO courseDTO) {
		this.courseDTO = courseDTO;
	}

	@Override
	public String toString() {
		return "RegisterCourseDTO [regid=" + regid + ", regdate=" + regdate + ", studentDTO=" + studentDTO
				+ ", courseDTO=" + courseDTO + "]";
	}
	
}
