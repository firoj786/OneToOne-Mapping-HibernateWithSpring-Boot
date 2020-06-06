// annotate the class as an entity and map to db table

// define the fields

// annotate the fields with db column names

// create constructors

// generate getter/setter methods

// generate toString() method
package com.nt.student;
/**
*Firoj Khan
 @Since
*/

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_detail")
public class StudentDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "course")

	private String course;
	@Column(name = "subject")
	private String sub;

//	public StudentDetails( String course, String sub) {
//		this.course = course;
//		this.sub = sub;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", course=" + course + ", sub=" + sub + "]";
	}

}
