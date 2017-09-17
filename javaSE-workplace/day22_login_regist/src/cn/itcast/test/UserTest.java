package cn.itcast.test;

import java.util.Scanner;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.game.GuessNumber;
import cn.itcast.pojo.User;

/*
 * 用户测试类
 */
public class UserTest {
	public static void main(String[] args) {
		while(true){
		System.out.println("----------欢迎光临---------");
		System.out.println("1.登录");
		System.out.println("2.注册");
		System.out.println("3.退出");
		System.out.println("请输入你的选择：");
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		UserDao ud=new UserDaoImpl();
		
		switch (str) {
		case "1":
			System.out.println("----------登录界面---------");
			System.out.println("请输入用户名：");
			String username=sc.nextLine();
			System.out.println("请输入密码：");
			String password=sc.nextLine();
			
			boolean flag=ud.isLogin(username, password);
			if(flag){
				System.out.println("登录成功！！");
				System.out.println("要玩游戏吗？y/n");
				
				while(true){
					String resultString=sc.nextLine();
					//boolean flag1=false;
					if(resultString.equalsIgnoreCase("y")){
					GuessNumber.start();
					System.out.println("还玩吗？");
				}else{
					break;
				}
				}
				System.out.println("谢谢使用！");
				System.exit(0);
			}else{
				System.out.println("用户名或密码有错，登录失败！");
			}
			
			break;
		case "2":
			System.out.println("----------注册界面---------");
			System.out.println("请输入用户名：");
			String newUsername=sc.nextLine();
			System.out.println("请输入密码：");
			String newPassword=sc.nextLine();
			
			User user=new User();
			user.setUserName(newUsername);
			user.setPassword(newPassword);
			
			
			
			ud.regist(user);
			System.out.println("注册成功！");
			break;
		case "3":	
		default:
			System.out.println("谢谢使用，欢迎下次再来！");
			System.exit(0);
			break;
		}
		
		}
		
	}
}
