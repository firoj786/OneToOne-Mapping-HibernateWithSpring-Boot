package com.nt.student;

/**
*Firoj Khan
 @Since
*/

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name = "name")
	private String sname;
	@Column(name = "email")
	private String email;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_detail_id")
	private StudentDetails stuidentDtail;

//	public Student( String sname, String email) {
//		this.sname = sname;
//		this.email = email;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public StudentDetails getStuidentDtail() {
		return stuidentDtail;
	}

	public void setStuidentDtail(StudentDetails stuidentDtail) {
		this.stuidentDtail = stuidentDtail;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", email=" + email + ", stuidentDtail=" + stuidentDtail + "]";
	}

}
