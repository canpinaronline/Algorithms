package study.algorithms.factorial;

public class Factorial {
	
	public int FirstFactorial(int number) {
		int sum = 1;
		for(int i=1; i<number+1;i++) {
			sum = sum * i;
			
		}
		return sum;
	}
	
}
