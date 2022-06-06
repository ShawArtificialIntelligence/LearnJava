class Bank{
	
	int balance = 0;
	String name = "";
	
	void setData(){
		balance = 1000;
		name = "Rabi";		
	}
	
	void debitAmt(){
		int bal = balance;
		bal = bal - 500;		
	}
	
	void display(){
		System.out.println(balance);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.setData();
		bank.debitAmt();
		bank.display();
	}
}	