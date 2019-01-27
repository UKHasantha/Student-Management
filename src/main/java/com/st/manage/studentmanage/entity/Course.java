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
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	@Id
	@Column(name="cid")
	String cid;
	@Column(name="cname")
	String cname;
	@Column(name="cperiod")
	String cperiod;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade={CascadeType.PERSIST, 
			CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(
			name="course_student",
			joinColumns=@JoinColumn(name="course_cid"),
			inverseJoinColumns=@JoinColumn(name="student_sid")
			)
	private List<Student> students;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade={CascadeType.PERSIST, 
			CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(
			name="course_subject",
			joinColumns=@JoinColumn(name="course_cid"),
			inverseJoinColumns=@JoinColumn(name="subject_sbid")
			)
	private List<Subject> subjects;
	
	public Course() {
		super();
	}

	public Course(String cid, String cname, String cperiod) {
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

	public List<Student> getStudents() {
		return students;
	}

	public List<Subject> getSubjects() {
		return subjects;
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

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cperiod=" + cperiod + ", students=" + students
				+ ", subjects=" + subjects + "]";
	}
	
	

}
