package cn.itcast_03;

public class UserDaoDemo {
	public static void main(String[] args) {
		UserDao ud=new UserDaoImpl();
		ud.add();
		
		UserDao ud2=new UserDaoImpl2();
		ud2.add();
		
	}
}
