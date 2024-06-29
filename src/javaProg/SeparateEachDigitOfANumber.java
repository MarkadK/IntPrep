package javaProg;

public class SeparateEachDigitOfANumber {

	public static void main(String[] args) {

		int num=1234;
		int temp=0;
		while(num!=0) {
//			temp=num%10;			
//			System.out.println(temp);
//			num=num/10;
			
			System.out.println(num%10);
			num=num/10;
			
		}
	}

}
