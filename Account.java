package Assignments;

 class Account1 {
	int acc_no;
	String name;
	float amount;
	
	void insert(int a, String n, float amt) {
	acc_no = a;
	name = n;
	amount = amt; }
	
	void display()
	{ System.out.println(acc_no+" "+name+" "+amount); }
	
    void deposit(float amt){
    amount =amount+amt;
    System.out.println(amt+" Deposited");    }
    
    void withdraw(float amt)
    {
    	if (amount<amt) {
    		System.out.println("Insufficient funds"); }
    	else {
    	   amount=amount-amt;
    		System.out.println(amt+" withdrawn"); }
    }
    void checkbalance()
    { System.out.println(amount+" is the Balance"); }
}
    public class Account {
    
    public static void main(String[] args) {
    	Account1 a1 = new Account1();
    	a1.insert(1234, "kavish", 1000);
    	a1.deposit(1000);
    	a1.checkbalance();
    	a1.withdraw(250);
    	a1.display();
	}
    }
