package lab4;

class Person
{
	String name;
	float age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
}

class Account
{
    long accNum=0;
	double balance;
	Person accHolder;
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum() {
		this.accNum = accNum++;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	void deposit(double x)
	{
		balance=balance+x;
	}
	void withdraw(double x)
	{
		balance=balance-x;
	}
	public double getBalance()
	{
		return balance;
}
}
class Savings extends Account
{
	final double minBalance=500;
	void withdraw(double x)
	{   if((balance-x)>minBalance)
		balance=balance-x;
	else
		System.out.println("Account should have a minimum balance of 500");
	}
	
}
class Current extends Account
{
	final double overDraftLimit=500;
	void withdraw(double x)
	{   if((balance-x)<overDraftLimit)
		System.out.println("False");
	else
		System.out.println("True");
	}
	
}


public class Exercise4_1 {

	public static void main(String[] args) {
		Account acc1=new Savings();
		Person p1 = new Person();
		acc1.setAccNum();
		acc1.setBalance(2000);
		p1.setName("smith");
		Account acc2=new Current();
		Person p2 = new Person();
		acc2.setAccNum();
		acc2.setBalance(3000);
		p2.setName("Kathy");
		
		acc1.deposit(2000);
		acc2.withdraw(4000);
		acc1.withdraw(4000);
		System.out.println("Smith Balance = " +acc1.getBalance());
		System.out.println("Kathy Balance = " +acc2.getBalance());
	}

}
