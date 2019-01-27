package com.st.manage.studentmanage.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@Column(name="sid")
	String sid;
	@Column(name="sname")
	String sname;
	@Column(name="scontact")
	String scontact;
	@Column(name="saddress")
	String saddress;
	
	@ManyToOne(cascade= {CascadeType.ALL, CascadeType.MERGE, 
			CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="guardian_gid")
	private Guardian guardian;
	
	
	@ManyToMany(fetch=FetchType.LAZY, cascade={CascadeType.PERSIST, 
			CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(
			name="course_student",
			joinColumns=@JoinColumn(name="student_sid"),
			inverseJoinColumns=@JoinColumn(name="course_cid")
			)
	private List<Course> courses;


	public Student() {
		super();
	}


	public Student(String sid, String sname, String scontact, String saddress) {
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


	public Guardian getGuardian() {
		return guardian;
	}


	public List<Course> getCourses() {
		return courses;
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


	public void setGuardian(Guardian guardian) {
		this.guardian = guardian;
	}


	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scontact=" + scontact + ", saddress=" + saddress
				+ ", guardian=" + guardian + ", courses=" + courses + "]";
	}
	

}
