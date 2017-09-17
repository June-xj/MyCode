package cn.itcast_05;

//public class ObjectTool<T> {
//	
////	public void show(String s){
////		System.out.println(s);
////	}
////	
////	public void show(int i){
////		System.out.println(i);
////	}
////	
////	public void show(boolean b){
////		System.out.println(b);
////	}
//	
//	public void show(T t){
//		System.out.println(t);
//	}
//}

//·ºÐÍ·½·¨
public class ObjectTool{
	public <T> void show(T t){
		System.out.println(t);
	}
}
