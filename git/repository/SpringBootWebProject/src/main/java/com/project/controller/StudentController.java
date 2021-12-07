package com.project.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.project.dao.Studentdao;
import com.project.model.Student;

@Controller
public class StudentController {
	
	@Autowired
	Student student;
	
	@Autowired
	Studentdao studentdao;
	
	String msg;
	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("student",student);
		model.addAttribute("msg",msg);
		return "home";
		
	}
	@RequestMapping("validate")
	public String validateStudent(@ModelAttribute("student")Student student,Model mv) {
		Student student1 = studentdao.validateUser(student);
		if(student1 != null) {
			msg = "Login Succesful";
			System.out.println("Login Successfull");
			return "redirect:/";
		}
		else {
			System.out.println("Login Failed");
			msg = "Login Failed";
			return "redirect:/";
		}
	}
	@RequestMapping("/registration")
	public String showRegistrationForm(Model model) {
		model.addAttribute("student",student);
		return "registration";
	}
	
	@RequestMapping("submitform")
	public ModelAndView saveStudent(@ModelAttribute("student") Student student, ModelAndView mv, @RequestParam("pic") MultipartFile file) throws IOException {
		
		System.out.println("In Save User");
		byte[] stuPic = file.getBytes();
		student.setStuPic(stuPic);
		studentdao.addUser(student);
		mv.addObject("msg", "Student Added Successfully");
		//mv.addObject("user", user);
		mv.setViewName("registration");
		return mv;
	}
	@RequestMapping("getall")
	public ModelAndView getAllUser(ModelAndView mv) {
		List<Student> studentList = studentdao.getAllStudents();
		mv.addObject("users", studentList);
		mv.addObject("msg", msg);
		mv.setViewName("viewusers");
		return mv;
	}
	@RequestMapping("getuserform")
	public String getUserForm() {
		return "getuser";
	}
	@RequestMapping("updatestudent/{id}")
	public String getUpdatestudent(@PathVariable int id, Model m) {
		
		List<Student> student = studentdao.getAllStudents();
		System.out.println("In Controller : "+student);
		m.addAttribute("student", student);
		return "updateform";
		
	}
	@RequestMapping("saveupdate")
	public String saveUpdate(@ModelAttribute("student") Student student) {
		studentdao.updateUser(student);
		return "redirect:/getall";
		
	}
	@RequestMapping("deleteuser/{id}")
	public String deleteUser(@PathVariable int id) {
		studentdao.deleteUser(id);
		return "redirect:/getall";
	}
}
