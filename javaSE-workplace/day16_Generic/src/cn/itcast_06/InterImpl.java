package cn.itcast_06;

//public class InterImpl implements Inter<String>{
//
//	@Override
//	public void show(String t) {
//		System.out.println(t);
//		
//	}
//	
//}

public class InterImpl<T> implements Inter<T>{

	@Override
	public void show(T t) {
		System.out.println(t);
		
	}
	
}
