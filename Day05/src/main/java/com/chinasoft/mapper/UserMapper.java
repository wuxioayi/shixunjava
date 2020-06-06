package com.chinasoft.mapper;
import com.chinasoft.pojo.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

public interface UserMapper {
	//����û�û�в�����ʽ
	void addUserNoPar();
	//�в�����ʽ
		void addUserByParameter(User user);
		User selectOneUserByPar(int id);
		@Select("select * from user")
		List<User> selectAll();
	//��¼����
		User selectLogin(User user);
	//���ݲ�ͬ����������
		List<User> selectOrderByPar(@Param("id")String id); 
		
}
