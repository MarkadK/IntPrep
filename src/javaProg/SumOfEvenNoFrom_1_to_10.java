package javaProg;

public class SumOfEvenNoFrom_1_to_10 {

	public static void main(String[] args) {

		int sum=0;
		
		for(int i=1;i<=10;i++) {
			if(i % 2 == 0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
