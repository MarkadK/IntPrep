package javaProg;

public class CountNoOfDigit {

	public static void main(String[] args) {
		long num=1324536454627L;
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
