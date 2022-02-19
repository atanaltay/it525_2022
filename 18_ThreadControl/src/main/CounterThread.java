package main;

public class CounterThread implements Runnable{
	
	CountListener listener;
	
	boolean canRun = true;
	boolean isPaused = false;
	
	
	public CounterThread(CountListener listener) {
		this.listener =listener;
	}
	
	
	@Override
	public void run() {
		
		int count =0;
		
		
		while(count<100) {
			if(canRun) {
				if(!isPaused) {
					count++;
					listener.countIncremented(count);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					
					try {
						synchronized (this) {
							wait();
						}
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				}
				
			}else {
				break;
			}
			
		}

	}
	
	public void pauseThread() {
		isPaused = true;
		
	}
	
	public void resumeThread() {
		isPaused = false;
		synchronized (this) {
			notify();
		}
		
	}
	
	public void stopThread() {
		this.canRun = false;
	}

}
