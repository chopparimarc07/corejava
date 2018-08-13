package stringBasicsProgrames;

public class Compare1 {

	public static void main(String[] args) {
		String s = "Virat";
		String s1= "Virat";
		String s3= new String ("Virat");
		//= = operator compares references only not values
		
		System.out.println(s==s1);
		System.out.println(s==s3);

	}

}
