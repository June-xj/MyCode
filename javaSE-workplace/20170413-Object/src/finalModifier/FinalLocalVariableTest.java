package finalModifier;

public class FinalLocalVariableTest {

	public void test(final int a){
		//不能对final修饰的形参赋值
		//a=5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String str="hello";
		//不能重新赋值
		//str="java";
		//final局部变量可被赋值一次
		final double d;
		d=5.6;
		//错误
		//d=3.4;
	}

}
