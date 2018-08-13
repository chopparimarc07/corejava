package stringBasicsProgrames;

public class StringMethods {

	public static void main(String[] args) {
		String s="STIGENTECH";
		String s1="OAK is programming language";
		String string=new String("Virat");
		String str=string.intern();
		int a=10;
		String str1=String.valueOf(a);
		
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s);
		System.out.println(s.startsWith("ST"));
		System.out.println(s.endsWith("ch"));
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(6));
		System.out.println(s.length());
		System.out.println(s1.replace("OAK", "java"));
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str1+10);
	}

}
