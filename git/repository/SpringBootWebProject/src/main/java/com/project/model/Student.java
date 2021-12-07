package com.project.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="Student")

public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private String stuName;
	private String stuAge;
	private String stuClass;
	private String stuCity;
	private String stuPassword;
	@Lob
	private byte[] stuPic;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String stuName, String stuAge, String stuClass, String stuCity, byte[] stuPic, String stuPassword) {
		super();
		this.id = id;
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuClass = stuClass;
		this.stuCity = stuCity;
		this.stuPic = stuPic;
		this.stuPassword = stuPassword;
	}
	

	public Student(int id, String stuName, String stuAge, String stuClass, String stuCity, String stuPassword) {
		super();
		this.id = id;
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuClass = stuClass;
		this.stuCity = stuCity;
		this.stuPassword = stuPassword;
	}

	public String getStuPassword() {
		return stuPassword;
	}

	public void setStuPassword(String stuPassword) {
		this.stuPassword = stuPassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuAge() {
		return stuAge;
	}

	public void setStuAge(String stuAge) {
		this.stuAge = stuAge;
	}

	public String getStuClass() {
		return stuClass;
	}

	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}

	public String getStuCity() {
		return stuCity;
	}

	public void setStuCity(String stuCity) {
		this.stuCity = stuCity;
	}

	public byte[] getstuPic() {
		return stuPic;
	}
	public void setStuPic(byte[] stuPic) {
		this.stuPic = stuPic;
	}
	public String getStuPic() {
		return Base64.encodeBase64String(stuPic);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", stuName=" + stuName + ", stuAge=" + stuAge + ", stuClass=" + stuClass
				+ ", stuCity=" + stuCity + ", stuPassword=" + stuPassword + ", stuPic=" + Arrays.toString(stuPic) + "]";
	}
		
}
