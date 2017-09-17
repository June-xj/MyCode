package cn.itcast_03;

public class ObjectToolDemo {
	public static void main(String[] args) {
		ObjectTool o=new ObjectTool();
		o.setObj(new Integer(27));
		Integer i=(Integer) o.getObj();
		System.out.println("Age:"+i);
		
		o.setObj(new String("lin"));
		String s=(String) o.getObj();
		System.out.println("Name:"+s);
		
		o.setObj(new Integer(30));
		//ClassCastException
		String ss=(String) o.getObj();
		System.out.println("Name:"+ss);
		
	}
}
