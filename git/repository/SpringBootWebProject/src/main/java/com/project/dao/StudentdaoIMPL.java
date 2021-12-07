package com.project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.repository.StudentRepository;
import com.project.model.Student;

@Service
public class StudentdaoIMPL implements Studentdao {
	
	@Autowired
	StudentRepository StudentRepository;
	
	@Override
	public void addUser(Student student) {
		// TODO Auto-generated method stub
		StudentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> studentList = StudentRepository.findAll();
		
		return studentList;
	}

	@Override
	public void updateUser(Student student) {
		// TODO Auto-generated method stub
		StudentRepository.save(student);
		
	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		StudentRepository.deleteById(userId);
	}

	@Override
	public Student validateUser(Student student) {
		// TODO Auto-generated method stub
		Student student1 = StudentRepository.findByLoginData(student.getStuName(), student.getStuPassword());
		return null;
	}

}
