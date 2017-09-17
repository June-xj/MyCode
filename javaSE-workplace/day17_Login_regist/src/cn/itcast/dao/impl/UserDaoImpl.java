package cn.itcast.dao.impl;

import java.util.ArrayList;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;

/*
 * 这是用户操作的具体实现类（集合版）
 */
public class UserDaoImpl implements UserDao {

	//多个对象共享一个成员变量，用静态
	private static ArrayList<User> array=new ArrayList<User>();
	
	@Override
	public boolean isLogin(String username, String password) {
		boolean flag=false;
		
		for(User u:array){
			if(u.getUserName().equals(username)&&u.getPassword().equals(password)){
				flag=true;
				break;
			}
		}
		
		return flag;
	}

	@Override
	public void regist(User user) {
		
		array.add(user);

	}

}
