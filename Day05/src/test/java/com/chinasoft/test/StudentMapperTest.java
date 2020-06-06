package com.chinasoft.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.chinasoft.mapper.StudentMapper;
import com.chinasoft.pojo.Student;
import com.chinasoft.util.SessionUtil;

public class StudentMapperTest {

	//全局变量
	public SqlSessionFactory factory = SessionUtil.getSession();
	
	@Test
	public void selectAllStudent(){
        SqlSession session=factory.openSession();
        StudentMapper mapper=session.getMapper(StudentMapper.class);
        List<Student> students= mapper.selectAllStudent();
        for(Student student : students) {
        	System.out.println(student);
        }
        session.close();
      
        
    }
	@Test
	public void SelectOneStudentWithGender(){
        SqlSession session=factory.openSession();
        StudentMapper mapper=session.getMapper(StudentMapper.class);
        Student student= mapper.SelectOneAll(3);
       
        	System.out.println(student);
        
        session.close();
      
        
    }
	  public static void main(String[] args) {
  		
	    	new StudentMapperTest().selectAllStudent();
	    	
	    		
	    		
	    	}
}
