package com.st.manage.studentmanage.dto;

public class ExamDTO {
	String eid;
	String ename;
	String edate;
	String eperiod;
	private SubjectDTO subjectDTO;
	
	public ExamDTO() {
		super();
	}

	public ExamDTO(String eid, String ename, String edate, String eperiod, SubjectDTO subjectDTO) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edate = edate;
		this.eperiod = eperiod;
		this.subjectDTO = subjectDTO;
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

	public SubjectDTO getSubjectDTO() {
		return subjectDTO;
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

	public void setSubjectDTO(SubjectDTO subjectDTO) {
		this.subjectDTO = subjectDTO;
	}

	@Override
	public String toString() {
		return "ExamDTO [eid=" + eid + ", ename=" + ename + ", edate=" + edate + ", eperiod=" + eperiod
				+ ", subjectDTO=" + subjectDTO + "]";
	}
	
	

}
