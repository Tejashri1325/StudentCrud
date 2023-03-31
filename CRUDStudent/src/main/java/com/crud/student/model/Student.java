package com.crud.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType .AUTO)
	int rollNo;
	String firstName;
	String lastName;
	int standard;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", standard="
				+ standard + "]";
	}

}
