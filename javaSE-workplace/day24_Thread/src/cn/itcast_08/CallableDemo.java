package cn.itcast_08;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService pool=Executors.newFixedThreadPool(2);
		
		Future<Integer> f1=pool.submit(new MyCallable(5));
		Future<Integer> f2=pool.submit(new MyCallable(6));
		
		Integer i1=f1.get();
		Integer i2=f2.get();
		
		System.out.println(i1);
		System.out.println(i2);
		
		
	}
}
