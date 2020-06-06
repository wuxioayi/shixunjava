package com.chinasoft.test;

import java.util.List;
import org.junit.Test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.chinasoft.mapper.UserMapper;
import com.chinasoft.pojo.User;
import com.chinasoft.util.SessionUtil;

public class UserMapperTest {
	public SqlSessionFactory factory = SessionUtil.getSession();
	
	public void addUserNoPer(){
        SqlSession session=factory.openSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        mapper.addUserNoPar();
        session.commit();
        session.close();
        
        
    }
	public void addUserByParameter(){
        SqlSession session=factory.openSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        User user=new User(83,"hhfd","123456","9978","4343","354545",0);
        mapper.addUserByParameter(user);
        session.commit();
        session.close();
        
        
    }
	
	
	public void selectOneUserByPar(){
        SqlSession session=factory.openSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        User user= mapper.selectOneUserByPar(33);
        session.close();
        
        
    }
	@Test//只能查找唯一的一项，查到两项会报错，因为不是list
	public void selectLogin(){
        SqlSession session=factory.openSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        User user= new User();
        user.setUsername("www");
        user.setPassword("1111");
        User user1 = mapper.selectLogin(user);
        System.out.println(user1);
        session.close();
        
        
    }
	public void selectALL(){
        SqlSession session=factory.openSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        List<User> list= mapper.selectAll();
        for(User user : list) {
        	System.out.println(user);
        }
        session.close();
        
        
    }
	@Test
	public void selectOrderByPar(){
        SqlSession session=factory.openSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        List<User> user= mapper.selectOrderByPar("id");
        for(User user1 : user) {
        	System.out.println(user1);
        }
        session.close();
        
        
    }
	public static void main(String[] args) {
		//new UserMapperTest().addUserNoPer();
		//new UserMapperTest().addUserByParameter();
		//new UserMapperTest().selectOneUserByPar();
		//new UserMapperTest().selectALL();
	new UserMapperTest().selectOrderByPar();
	
		
		
	}


}
