package com.chinasoft.pojo;

public class Student {

	private int id;
	private String  user;
	private String  pwd;
    private String  phone;
    private String  email;
    private String  address;
    private int c_id  ;
    private Gender gender;
    
	public Student(int id, String user, String pwd, String phone, String email, String address, int c_id,
			Gender gender) {
		super();
		this.id = id;
		this.user = user;
		this.pwd = pwd;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.c_id = c_id;
		this.gender = gender;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", user=" + user + ", pwd=" + pwd + ", phone=" + phone + ", email=" + email
				+ ", address=" + address + ", c_id=" + c_id + ", gender=" + gender + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
    
}
