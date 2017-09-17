package cn.itcast_02;

public class CharacterDemo {
	public static void main(String[] args) {
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.isUpperCase('0'));
		System.out.println("--------------------------");
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isLowerCase('0'));
		System.out.println("--------------------------");
		System.out.println(Character.isDigit('A'));
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isDigit('0'));
		System.out.println("--------------------------");
		
		System.out.println(Character.toUpperCase('A'));
		System.out.println(Character.toUpperCase('a'));
		
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toLowerCase('a'));
	}
}
