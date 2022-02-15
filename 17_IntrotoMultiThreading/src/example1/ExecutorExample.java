package example1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

	
	public static void main(String[] args) {
		
		
		ExecutorService srv = Executors.newCachedThreadPool();
		
		srv.submit(()->{
			int count =0;
			
			while(count<100) {
				count++;
				System.out.println("Count 1 -- "  + count);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
		srv.submit(()->{
			int count =0;
			
			while(count<100) {
				count++;
				System.out.println("Count 2 -- "  + count);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
			}
		});
		
		srv.shutdown();
		
		
	}
	
	
	
	
}
