class Account {
	private int acc;
	private int bal;
	Account(int acc,int bal){
		this.acc = acc;
		this.bal = bal;
	}
	int getBalance(){
		return bal;
	}
	private void setBalance(int bal){
		this.bal = bal;
	}
  void withdraw(int amt){
	//	int bal = getBalance();
		try{
			Thread.sleep(500);
	//	}catch(InterruptedException e){
			
		}
		bal = bal-amt;
		this.setBalance(bal);
	}
}
class withdrawTransaction extends Thread{
	Account acc;
	int bal;
	withdrawTransaction(Account acc,int bal){
		this.acc = acc;
		this.bal = bal;
	}
	public void run(){
		acc.withdraw(bal);
	}
}

 class Runtime1{
	public static void main(String agrs[]){
		Account acc1 =  new Account(1001,10000);
		Account acc2 = new Account(1002,10000);
		Account acc3 = new Account(1003,10000);
		
		withdrawTransaction t1 = new withdrawTransaction(acc1,2000);
		withdrawTransaction t2 = new withdrawTransaction(acc2,4000);
		withdrawTransaction t3 = new withdrawTransaction(acc3,6000);
		withdrawTransaction t4 = new withdrawTransaction(acc3,4000);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		try{
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		}catch(Exception e){}
		
		System.out.println(acc1.getBalance());
		System.out.println(acc2.getBalance());
		System.out.println(acc3.getBalance());
		
	}
}