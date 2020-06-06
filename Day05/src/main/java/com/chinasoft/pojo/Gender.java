package com.chinasoft.pojo;
import java.util.ArrayList;

public class Gender {
	private int id;
	private String  name;
	private String  teacher;
	//����һ����������
	private ArrayList<User> list;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public ArrayList<User> getList() {
		return list;
	}
	public void setList(ArrayList<User> list) {
		this.list = list;
	}
	public Gender(int id, String name, String teacher, ArrayList<User> list) {
		super();
		this.id = id;
		this.name = name;
		this.teacher = teacher;
		this.list = list;
	}
	@Override
	public String toString() {
		return "Gender [id=" + id + ", name=" + name + ", teacher=" + teacher + ", list=" + list + "]";
	}
	public Gender() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    

}
