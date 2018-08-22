package com.dto.registration;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="reg_info")
public class RegistrationDTO implements Serializable
{
	public RegistrationDTO() 
	{
		System.out.println("Registration DTO created...");
	}
	
	@Id
	@GenericGenerator(name="i",strategy="increment")
	@GeneratedValue(generator="i")
	@Column(name="Id")
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Email")
	private String email;
	@Column(name="Age")
	private int age;
	@Column(name="Password")
	private String password;
	@Column(name="C_Password")
	private String confirmPassword;
	@Column(name="Country")
	private String country;
	@Column(name="Contact")
	private long contactNumber;
	@Column(name="File_Path")
	private String fileToUpload;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	@Override
	public String toString()
	{
		return "Name = " +name+ "  Email = " +email+ "  Age = " +age+ "  Password = " +password+ "  Confirm Password = " +confirmPassword+ "  Country = " +country+ "  Contact Number = " +contactNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getFileToUpload() {
		return fileToUpload;
	}
	public void setFileToUpload(String fileToUpload) {
		this.fileToUpload = fileToUpload;
	}
}
