package com.st.manage.studentmanage.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="exam")
public class Exam {
	@Id
	@Column(name="eid")
	String eid;
	@Column(name="ename")
	String ename;
	@Column(name="edate")
	String edate;
	@Column(name="eperiod")
	String eperiod;
	
	@ManyToOne(cascade= {CascadeType.ALL, CascadeType.MERGE, 
			CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="subject_sbid")
	private Subject subject;

	public Exam() {
		super();
	}

	public Exam(String eid, String ename, String edate, String eperiod) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edate = edate;
		this.eperiod = eperiod;
	}

	public String getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public String getEdate() {
		return edate;
	}

	public String getEperiod() {
		return eperiod;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setEdate(String edate) {
		this.edate = edate;
	}

	public void setEperiod(String eperiod) {
		this.eperiod = eperiod;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Exam [eid=" + eid + ", ename=" + ename + ", edate=" + edate + ", eperiod=" + eperiod + ", subject="
				+ subject + "]";
	}

	
}
