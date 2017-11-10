package com.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="StudentPracFOUR")
public class Student {
	
	int id;
	String name,dept,address;
	Date joindate;
	
	@Column(name="joinDate")
	@Temporal(TemporalType.DATE)
	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	public Student() {}

	@Id
	@Column(name="studentid")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="my_seq_gen")
	@SequenceGenerator(name="my_seq_gen", sequenceName="SFIVE", allocationSize = 1)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="Sname")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="Sdept")
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Lob
	@Column(name="Saddrs")
	public String getAddress() {
		return "value for getter "+address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", address=" + address + "]";
	}
	
	
	

}
