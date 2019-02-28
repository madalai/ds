package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureCallableExample {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	Callable<String> call1 = new Callable<String>() {
		
		@Override
		public String call() throws Exception {
			Thread.sleep(10000);
			return "Call Method Completed";
		}
	};
	
	ExecutorService executor = Executors.newSingleThreadExecutor();
	Future<String> fut = executor.submit(call1);
	String op = fut.get();
	System.out.println(op);
	executor.shutdown();
}
}
