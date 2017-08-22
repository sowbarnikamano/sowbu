package com.forkjoin;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
public class ForkJoinExample {
	public static void main(String args[]){
		ForkJoinPool pl = new ForkJoinPool();
		Fibonacci task = new Fibonacci(16);
		int number = pl.invoke(task);
		System.out.println(number);

	}
}

class Fibonacci extends RecursiveTask<Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int s = 0;
	public Fibonacci(int s) {
		this.s = s;
		}

	@Override
	protected Integer compute() {
		// TODO Auto-generated method stub
		if (s <= 1)
			return s;
		else {
			
			if (s > 10) {
				System.out.println("inside forkjoin");
				Fibonacci f1 = new Fibonacci(s - 1);
				Fibonacci f2 = new Fibonacci(s - 2);
				f1.fork();
				return f2.compute() + f1.join();
			} else {
				return fib(s - 1) + fib(s - 2);
			}

		}

	}

	private int fib(int n) {
		if (n <= 1)
			return n;

		return fib(n - 1) + fib(n - 2);

	}

}
