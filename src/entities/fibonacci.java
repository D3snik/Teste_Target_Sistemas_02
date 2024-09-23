package entities;

public class fibonacci {
	

	public static int fibonacciRecursivo(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
	}
}
