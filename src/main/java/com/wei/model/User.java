package com.wei.model;

import java.util.Date;

public class User {

	private String rowkey;
	
	private String code;
	
	private String password;

	private String name;
	
	private int age;
	
	private String email;
	
	private Date inputdate;
	
	private String inputuser;
	
	private Date modifydate;
	
	private String modifyuser;
	
	private String remark;

	public String getRowkey() {
		return rowkey;
	}

	public void setRowkey(String rowkey) {
		this.rowkey = rowkey;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

/*	public Date getInputdate() {
		return inputdate;
	}

	public void setInputdate(Date inputdate) {
		this.inputdate = inputdate;
	}*/

	public String getInputuser() {
		return inputuser;
	}

	/*public void setInputuser(String inputuser) {
		this.inputuser = inputuser;
	}

	public Date getModifydate() {
		return modifydate;
	}*/

	public void setModifydate(Date modifydate) {
		this.modifydate = modifydate;
	}

	public String getModifyuser() {
		return modifyuser;
	}

	public void setModifyuser(String modifyuser) {
		this.modifyuser = modifyuser;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	

}
