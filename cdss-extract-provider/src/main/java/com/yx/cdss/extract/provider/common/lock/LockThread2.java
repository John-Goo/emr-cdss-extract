package com.yx.cdss.extract.provider.common.lock;

public class LockThread2 implements Runnable {

	private MyResource r1;
	private MyResource r2;

	public LockThread2(MyResource r1, MyResource r2) {
		super();
		this.r1 = r1;
		this.r2 = r2;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (r2) {
				System.out.println("=== 线程[" + Thread.currentThread().getName() + "-"
						+ Thread.currentThread().getId() + "获得了 R2 锁");
				synchronized (r1) {
					System.out.println("=== 线程[" + Thread.currentThread().getName() + "-"
							+ Thread.currentThread().getId() + "]获得了 R1 锁");
				}
			}
		}
	}
}
