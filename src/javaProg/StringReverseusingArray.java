package javaProg;

public class StringReverseusingArray {

	public static void main(String[] args) {

		String name="Kishor MArkad";
		char[] ch=name.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
	}

}
