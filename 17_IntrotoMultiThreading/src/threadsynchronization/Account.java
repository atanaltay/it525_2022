package threadsynchronization;

public class Account {

	private double balance;
	
	
	public Account(double balance) {
		this.balance = balance;
	}
	
	
	public synchronized  void withdrawMoney(double amount) {
		

			if(amount<=balance) {
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				balance-=amount;
				System.out.println("Money withdrawn");
			}else {
				System.out.println("Not enough balance");
			}
			
			System.out.println("Balance: " + balance);
		
		
		
		
		
	}
	
	/*
	public  void withdrawMoney(double amount) {
		
		
		synchronized (this) {
			if(amount<=balance) {
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				balance-=amount;
				System.out.println("Money withdrawn");
			}else {
				System.out.println("Not enough balance");
			}
			
			System.out.println("Balance: " + balance);
		}
		
		
		
		
	}
	*/
	
	
}
