package cn.itcast_07;

import java.util.ArrayList;
import java.util.Collection;

public class AnimalDemo {
	public static void main(String[] args) {
//		Collection<Animal> c1=new ArrayList<Animal>();
//		Collection<Animal> c2=new ArrayList<Dog>();
//		Collection<Animal> c3=new ArrayList<Object>();
//		Collection<Animal> c4=new ArrayList<Cat>();
		
		//通配符?
//		Collection<?> c1=new ArrayList<Animal>();
//		Collection<?> c2=new ArrayList<Dog>();
//		Collection<?> c3=new ArrayList<Object>();
//		Collection<?> c4=new ArrayList<Cat>();
		
		//? extends E
		//E（本身）及其子类
//		Collection<? extends Animal> c1=new ArrayList<Animal>();
//		Collection<? extends Animal> c2=new ArrayList<Dog>();
//		Collection<? extends Animal> c3=new ArrayList<Object>();
//		Collection<? extends Animal> c4=new ArrayList<Cat>();
		
		//? super E
		//E及其父类
//		Collection<? super Animal> c1=new ArrayList<Animal>();
//		Collection<? super Animal> c2=new ArrayList<Dog>();
//		Collection<? super Animal> c3=new ArrayList<Object>();
//		Collection<? super Animal> c4=new ArrayList<Cat>();
	}
}
