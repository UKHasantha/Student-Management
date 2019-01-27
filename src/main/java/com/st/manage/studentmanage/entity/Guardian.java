package com.st.manage.studentmanage.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="guardian")
public class Guardian {
	@Id
	@Column(name="gid")
	String gid;
	@Column(name="gname")
	String gname;
	@Column(name="gcontact")
	String gcontact;
	@Column(name="gaddress")
	String gaddress;
	
	@OneToMany(mappedBy="guardian",cascade= {CascadeType.ALL, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH})
	private List<Student> students;

	public Guardian() {
		super();
	}

	public Guardian(String gid, String gname, String gcontact, String gaddress) {
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

	public List<Student> getStudents() {
		return students;
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

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Guardian [gid=" + gid + ", gname=" + gname + ", gcontact=" + gcontact + ", gaddress=" + gaddress
				+ ", students=" + students + "]";
	}
	

}
