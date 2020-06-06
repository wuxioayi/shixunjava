package com.chinasoft.mapper;
import com.chinasoft.pojo.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

public interface UserMapper {
	//添加用户没有参数形式
	void addUserNoPar();
	//有参数形式
		void addUserByParameter(User user);
		User selectOneUserByPar(int id);
		@Select("select * from user")
		List<User> selectAll();
	//登录功能
		User selectLogin(User user);
	//根据不同的列来排序
		List<User> selectOrderByPar(@Param("id")String id); 
		
}
