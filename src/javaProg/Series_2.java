package javaProg;

// 1^1+2^2+3^3+4^4+.......

public class Series_2 {

	public static void main(String[] args) {

		int sum=0;
		for(int i=1;i<=5;i++) {
			sum=sum+(i*i);
		}
		System.out.println(sum);
	}

}
