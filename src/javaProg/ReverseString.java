package javaProg;

public class ReverseString {

	public static void main(String[] args) {
		String name="Kishor Markad";
		int length=name.length();
		String reverse="";
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+name.charAt(i);
			
		}
		System.out.println(reverse);
	}

}
