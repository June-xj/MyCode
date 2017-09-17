package cn.itcast_05;

public class IntegerDemo {
	public static void main(String[] args) {
		//定义一个int类型的包装类类型变量
		//Integer i=new Integer(100);
		Integer ii=100;
		ii+=200;
		System.out.println(ii);
		//通过反编译
		//Integer ii=Integer.valueOf(100);//自动装箱
		//ii=Integer.valueOf(ii.intValue()+200);//自动拆箱再自动装箱
		//System.out.println((new StringBuilder().append(ii).toString()));
		
		//如果对象为空则不能进行自动装箱
	}
}
