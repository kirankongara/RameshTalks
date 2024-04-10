package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long eid;
	
	private String ename;
	private String edesignation;
	private String edepartment;
	private int eexp;
	public long getEid() {
		return eid;
	}
	public void setEid(long eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdesignation() {
		return edesignation;
	}
	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}
	public String getEdepartment() {
		return edepartment;
	}
	public void setEdepartment(String edepartment) {
		this.edepartment = edepartment;
	}
	public int getEexp() {
		return eexp;
	}
	public void setEexp(int eexp) {
		this.eexp = eexp;
	}
	
	
}
