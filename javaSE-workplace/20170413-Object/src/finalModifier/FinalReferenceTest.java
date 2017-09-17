package finalModifier;

import java.util.Arrays;

class Person{
	private int age;
	public Person(){}
	public Person(int age){
		this.age=age;
	}
	public void setAge(int i) {
		// TODO Auto-generated method stub
		this.age=i;
	}
	public int getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}
}
public class FinalReferenceTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final修饰数组变量，数组为一个引用变量
		final int[] iArr={5,6,12,9};
		System.out.println(Arrays.toString(iArr));
		//对数组元素排序
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));
		iArr[2]=-8;
		System.out.println(Arrays.toString(iArr));
		//对iArr重新赋值，非法
		//iArr=null;
		//final修饰Person变量，p是一个引用变量
		final Person p=new Person(45);
		p.setAge(23);
		System.out.println(p.getAge());
		//对p重新赋值，非法
		//p=null;
	}

}
