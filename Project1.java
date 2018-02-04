import java.util.Scanner;
public class Project1 {

	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of fibonacci");
		int number = sc.nextInt();
		
		//initializing timer
		long startTime = System.nanoTime(); 
		
		for (i = 0; i<number ; i++){
			//System.out.print(fiboSeriesIte(i) + " ");
			System.out.print(fiboSeriesRec(i) + " ");
		}
		
		//finishing timer 
		long endTime = System.nanoTime();
		endTime -= startTime; 
		System.out.println("Time to compute was " + endTime + " nanoseconds. " + endTime/1000000 + " milliseconds.");
	}
	//recusive and iterative methods used from https://stackoverflow.com/questions/21710756/recursion-vs-iteration-fibonacci-sequence 
	public static long fiboSeriesRec(int n){
		if (n== 0 || n == 1 ) 
			return n;
		else 
			return fiboSeriesRec(n-1) + fiboSeriesRec(n-2);
	}
	public static long fiboSeriesIte(int n){
		long fib1 = 0, fib2 = 1, fib3=1;
		for (int i = 0; i < n ; i++){
			fib1 = fib2;
			fib2 = fib3;
			fib3 = fib1 + fib2;
		}
		return fib1;
	}
	


}

