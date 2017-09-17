package finalModifier;

public class FinalErrorTest {

	//定义一个final修饰的实例变量
	//系统不会对其默认初始化
	final int age;
	{
		//System.out.println(age);//出错，因为age没初始化
		age=6;
		System.out.println(age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FinalErrorTest();
	}

}
