package javaProg;

public class Find_The_Divisor {

	public static void main(String[] args) {

		int num=8;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
			{
				System.out.println(i);
			}
		}
	}
}
