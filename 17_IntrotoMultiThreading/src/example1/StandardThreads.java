package example1;

public class StandardThreads {

	
	public static void main(String[] args) {
		
		CountThread1 t1 = new  CountThread1("T1");
		t1.start();
		
		
		CountThread1 t2 = new  CountThread1("T2");
		t2.start();
		
		
		System.out.println("----------------MAIN--------------------");
		
		System.out.println("----------------MAIN--------------------");
		
		
		
		Thread t3 = new Thread(new CountThread2("t3"));
		t3.start();
		
		
		Thread t4 = new Thread(()->{
			
			int count =0;
			
			while(count<100) {
				count++;
				System.out.println("Count: t5 ::" + count);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		t4.start();
		
		
	}
	
	
	static class CountThread2 implements Runnable{
		String name;
		public CountThread2(String name) {
			this.name = name;
		}
		
		@Override
		public void run() {
			int count =0;
			
			while(count<100) {
				count++;
				System.out.println("Count:" + name + "::" + count);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	
	
	//The legacy Thread
	static class CountThread1 extends Thread{
		String name;
		public CountThread1(String name) {
			this.name = name;
		}
		
		@Override
		public void run() {

			int count =0;
			
			while(count<100) {
				count++;
				System.out.println("Count:" + name + "::" + count);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	
	}
	
	
	
	
	
}
