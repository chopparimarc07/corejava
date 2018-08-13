package stringBasicsProgrames;

import java.util.LinkedHashSet;
import java.util.Set;

public class Stringremove {

	public static void main(String[] args) {
		String st = "STIGENTECH";
		Set<Character>c=new LinkedHashSet<Character>();
		for(Character cc:st.toCharArray()) {
			c.add(cc);
		}
		System.out.println(c);
	}
	
}
