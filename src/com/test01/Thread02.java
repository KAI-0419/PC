package com.test01;

public class Thread02 {

	public static void main(String[] args) {
		MyThread02 m1 = new MyThread02("야옹");
		MyThread02 m2 = new MyThread02("멍멍");
		
		//우선순의 할당
		m1.setPriority(10);
		m2.setPriority(Thread.MIN_PRIORITY);
		
		m1.start();
		m2.start();
	}
}

class MyThread02 extends Thread {
	public MyThread02(String name) {
		super(name);
	}

	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println(this.getName()+"="+i);
		}
		System.out.println(this.getName()+" 끝!");
	}
}