package stringBasicsProgrames;

import java.util.Scanner;

public class PalindromTest {
 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
        String s=sc.nextLine();
        String s2="";
        for(int i=s.length()-1;i>=0;i--) {
        	s2=s2+s.charAt(i);
        	
        }
        System.out.println(s2);
        if(s2.equals(s)) {
        	System.out.println("given string is palindrome");
        }else {
        	System.out.println("given string is not palindrome");
        }
}
}