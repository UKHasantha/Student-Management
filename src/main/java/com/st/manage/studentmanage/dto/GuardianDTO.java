package com.st.manage.studentmanage.dto;

import java.util.List;

public class GuardianDTO {
	String gid;
	String gname;
	String gcontact;
	String gaddress;
	private List<StudentDTO> studentsDtos;
	
	public GuardianDTO() {
		super();
	}

	public GuardianDTO(String gid, String gname, String gcontact, String gaddress) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gcontact = gcontact;
		this.gaddress = gaddress;
	}

	public String getGid() {
		return gid;
	}

	public String getGname() {
		return gname;
	}

	public String getGcontact() {
		return gcontact;
	}

	public String getGaddress() {
		return gaddress;
	}

	public List<StudentDTO> getStudentsDtos() {
		return studentsDtos;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public void setGcontact(String gcontact) {
		this.gcontact = gcontact;
	}

	public void setGaddress(String gaddress) {
		this.gaddress = gaddress;
	}

	public void setStudentsDtos(List<StudentDTO> studentsDtos) {
		this.studentsDtos = studentsDtos;
	}

	@Override
	public String toString() {
		return "GuardianDTO [gid=" + gid + ", gname=" + gname + ", gcontact=" + gcontact + ", gaddress=" + gaddress
				+ ", studentsDtos=" + studentsDtos + "]";
	}
	

}
