package cn.itcast_04;

public class ObjectToolDemo {
	public static void main(String[] args) {
//		ObjectTool o=new ObjectTool();
//		
//		o.setObj(new String("feng"));
//		String s=(String) o.getObj();
//		System.out.println("Name:"+s);
//		
//		o.setObj(new Integer(30));
//		Integer i=(Integer) o.getObj();
//		System.out.println("Age:"+i);
		
//		o.setObj(new String("lin"));
		//ClassCastException
//		Integer ii=(Integer) o.getObj();
//		System.out.println("Name:"+ii);
		
		ObjectTool<String> o=new ObjectTool<String>();
		
		o.setObj(new String("lim"));
		String s=o.getObj();
		System.out.println(s);
		
		ObjectTool<Integer> oo=new ObjectTool<Integer>();
		oo.setObj(new Integer(20));
		Integer i=oo.getObj();
		System.out.println(i);
		
	}
}
