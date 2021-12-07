package com.project.dao;

import java.util.List;
import org.springframework.stereotype.Service;
import com.project.model.Student;

@Service
public interface Studentdao {
	public void addUser(Student student);
	public List<Student> getAllStudents();
	public void updateUser(Student student);
	public void deleteUser(int studentId);
	public Student validateUser(Student student);
}
