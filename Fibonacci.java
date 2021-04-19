package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	
	public void run() {
		System.out.println("This program lists the Fibonacci Sequence.");
		int term = 0;
		int fib = 1; 		

		while (term < MAX_TERM_VALUE) {
			println(term);
			int fibNum;
			fibNum = term + fib;	
			term = fib;
			fib = fibNum;
			
		}


	}
	
	private static final int MAX_TERM_VALUE = 10000;

}
