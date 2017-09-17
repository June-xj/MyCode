package finalModifier;

public class FinalVariableTest {
	//定义成员变量时指定默认值
	final int a=6;
	//以下变量在构造器中初始化
	final String str;
	final int c;
	final static double d;
	//没有在任何地方指定初始值
	//final char ch;
	//初始化块，为没有指定默认值的实例变量指定初始值
	{
		str="hello";
		//a=9;//不能重新赋值
	}
	//静态初始化块，没有指定默认值的类变量指定初始值
	static {
		d=5.6;
	}
	//构造器没指定默认值又没在初始化块中的实例变量指定初始值
	public FinalVariableTest(){
		//不能再对已经有初始值的的final变量重新赋值
		//str="java";
		c=5;
	}
	public void changeFinal(){
		//普通方法不能为final变量赋值
		//d=1.2;
		//ch='a';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVariableTest ft=new FinalVariableTest();
		System.out.println(ft.a);
		System.out.println(ft.c);
		System.out.println(ft.d);
	}

}
