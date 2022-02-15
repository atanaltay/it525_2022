package threadsynchronization;

public class AccountMain {

	
	public static void main(String[] args) {
		
		Account account = new Account(1000);
		
		WithdrawMoneyThread wifeAction = new WithdrawMoneyThread(account, 800);
		WithdrawMoneyThread husbandAction = new WithdrawMoneyThread(account, 800);
		
		Thread t1 = new Thread(wifeAction);
		Thread t2 = new Thread(husbandAction);
		
		
		t1.start();
		t2.start();
		
	}
	
	
	
	static class WithdrawMoneyThread implements Runnable{
		Account acc;
		double amount;
		
		public WithdrawMoneyThread(Account acc,double amount) {
			this.acc = acc;
			this.amount = amount;
		}
		
		
		
		@Override
		public void run() {
			
			acc.withdrawMoney(amount);
			
			
			
			
		}
	}
	
	
	
}
