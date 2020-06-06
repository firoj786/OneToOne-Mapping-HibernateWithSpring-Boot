package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nt.student.Student;
import com.nt.student.StudentDetails;
import com.nt.student.repository.StudentDetailsRepository;
import com.nt.student.repository.StudentRepository;


/**
*Firoj Khan
*
*@Since
*/

@RestController
//@Controller
//@ResponseBody
public class StudentController {

	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	StudentDetailsRepository studentDetailsRepository;
	
	@RequestMapping(value = "/helloMapping", method = RequestMethod.GET)
	public String helloMedthod() {
		return "HELLO";
	}
	
	@RequestMapping(value = "/saveData", method = RequestMethod.GET)
	public String saveStudentDetails() {
		StudentDetails studentDetail = new StudentDetails();
		studentDetail.setCourse("CSE");
		studentDetail.setSub("Computer Science And Electornics");
		studentDetailsRepository.save(studentDetail);
		
		Student student = new Student();
		student.setSname("Praveen");
		student.setEmail("praveen@gmail.com");
		student.setStuidentDtail(studentDetail);
		studentRepository.save(student);
		return "Studnet Data Saved";
	}
	
	@RequestMapping(value = "/findAllStudentData", method = RequestMethod.GET)
	public List<Student> findAllStudent(){
		
		return studentRepository.findAll();
		
	}
	@RequestMapping(value = "/findByStudentData/{id}", method = RequestMethod.GET)
	public Student findByStudentId(@PathVariable Long id){
		Student student = studentRepository.findById(id).orElse(null);
		return student;
	}
}
