package com.st.manage.studentmanage.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="register_course")
public class RegisterCourse {
	
	@Id
	@Column(name="regid")
	private String regid;
	@Column(name="regdate")
	private String regdate;
	
	@ManyToOne(cascade= {CascadeType.ALL, CascadeType.MERGE, 
			CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="sid", referencedColumnName="sid", insertable=false,updatable=false)
	private Student student;
	
	@ManyToOne(cascade= {CascadeType.ALL, CascadeType.MERGE, 
			CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="cid", referencedColumnName="cid", insertable=false,updatable=false)
	private Course course;

	public RegisterCourse() {
		super();
	}

	public RegisterCourse(String regid, String regdate, Student student, Course course) {
		super();
		this.regid = regid;
		this.regdate = regdate;
		this.student = student;
		this.course = course;
	}

	public String getRegid() {
		return regid;
	}

	public String getRegdate() {
		return regdate;
	}

	public Student getStudent() {
		return student;
	}

	public Course getCourse() {
		return course;
	}

	public void setRegid(String regid) {
		this.regid = regid;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "RegisterCourse [regid=" + regid + ", regdate=" + regdate + ", student=" + student + ", course=" + course
				+ "]";
	}
}
