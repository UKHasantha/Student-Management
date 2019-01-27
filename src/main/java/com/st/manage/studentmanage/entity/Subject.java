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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="subject")
public class Subject {
	@Id
	@Column(name="sbid")
	String sbid;
	@Column(name="sbname")
	String sbname;
	
	@OneToMany(mappedBy="subject",cascade= {CascadeType.ALL, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH})
	private List<Exam> exams;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade={CascadeType.PERSIST, 
			CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(
			name="course_subject",
			joinColumns=@JoinColumn(name="subject_sbid"),
			inverseJoinColumns=@JoinColumn(name="course_cid")
			)
	private List<Course> courses;

	public Subject() {
		super();
	}

	public Subject(String sbid, String sbname, List<Exam> exams, List<Course> courses) {
		super();
		this.sbid = sbid;
		this.sbname = sbname;
		this.exams = exams;
		this.courses = courses;
	}

	public String getSbid() {
		return sbid;
	}

	public String getSbname() {
		return sbname;
	}

	public List<Exam> getExams() {
		return exams;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setSbid(String sbid) {
		this.sbid = sbid;
	}

	public void setSbname(String sbname) {
		this.sbname = sbname;
	}

	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Subject [sbid=" + sbid + ", sbname=" + sbname + ", exams=" + exams + ", courses=" + courses + "]";
	}
}
