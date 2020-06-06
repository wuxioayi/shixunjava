package com.chinasoft.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Select;

import com.chinasoft.pojo.Student;

public interface StudentMapper {
	//查看学生表的内容
	
	List<Student> selectAllStudent();
	//查看某个学生的所有信息
	Student SelectOneAll(int id);

}
