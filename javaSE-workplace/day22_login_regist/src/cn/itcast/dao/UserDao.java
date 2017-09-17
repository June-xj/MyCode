package cn.itcast.dao;

import cn.itcast.pojo.User;

/*
 * 这是针对用户进行操作的接口
 */
public interface UserDao {
	/*
	 * 这是用户登录功能
	 */
	public abstract boolean isLogin(String userName,String password);
	/*
	 * 这是用户注册功能
	 */
	public abstract void regist(User user);
}
