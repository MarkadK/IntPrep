package javaProg;

public class FindMaximumDigitFromNumber {

	public static void main(String[] args) {

		int num=867532;
		
		int max=num%10;
		
		while(num>0) {
			if(num%10 >max) {
				max=num%10;
			}
			num=num/10;
		}
		System.out.println(max);

	}

}
