package com.test01;

public class Thread03 {

	public static void main(String[] args) {
		MyThread02 m1 = new MyThread02("야옹");
		MyThread02 m2 = new MyThread02("멍멍");
		
		long start_time = System.currentTimeMillis();
		m1.start();
		
		try {
			//m1 thread가 종료될 때까지 다른 thread(m2, main) 멈춘다
			m1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		m2.start();
		
		long end_time = System.currentTimeMillis();
		System.out.println("실행시간: "+(end_time - start_time));
		
		
		
		
	}

}
