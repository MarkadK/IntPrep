package javaProg;

//----> 1/2+2/3+3/4+4/5....s
public class Series_1 {

	public static void main(String[] args) {

		double sum=0;
		for(double i=1;i<=10;i++)
		{
			sum=sum+i / (i+1);
			
		}
		System.out.println(sum);
		

	}

}
