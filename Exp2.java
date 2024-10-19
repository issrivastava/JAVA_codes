package Exps_java;
import java.util.* ;
public class Exp2 {
public static void main(String[] args) {
		
		 int acc_no;
		 String name;
		 float amount;
		 Scanner sc=new Scanner(System.in);
		
		 System.out.println("Enter Account Number :\n");
		 acc_no=sc.nextInt();
		
		 System.out.println("Enter Customer Name :\n");
		 name=sc.next();
		
		 System.out.println("Enter Customer Amount :\n");
		 amount=sc.nextFloat();
		
		 AccountHelp obj1=new AccountHelp();
		
		 obj1.insert(acc_no,name,amount);
		 obj1.display();
		 obj1.checkBalance();
		
		 System.out.print("Enter Amount to be deposited :\n");
		 float dep_amount=sc.nextFloat();
		 
		 obj1.deposit(dep_amount);
		 obj1.checkBalance();
		
		 System.out.print("Enter Amount to be withdrawn :\n");
		 float wit_amount=sc.nextFloat();
		 
		 obj1.withdraw(wit_amount);
		 obj1.checkBalance();
		 
		 System.out.print("THANK YOU\n");
	}
}
class AccountHelp
{
		 int acc_no;
		 String name;
		 float amount;
		 void insert(int a,String n,float amt)
	{
		 acc_no=a;
		 name=n;
		 amount=amt;
	 }
		 void deposit(float amt)
		 {
		  amount=amount+amt;
		  System.out.println(amt+" deposited");
		 }
		 void withdraw(float amt)
		 {
		   if(amount<amt)
		   {
		   System.out.println("Insufficeint Balance");
		   }
		 else
		 	{
		   amount=amount-amt;
		   System.out.println(amt + "withdrawn");
		 	}
		 }
		 void display()
		 {
		 System.out.println("Account Number :"+acc_no);
		 System.out.println("Customer Name : "+name);
		 System.out.println("Customer Amount :"+amount);
		 }
		 void checkBalance()
		 {
		    System.out.println("Balance is:"+amount);
		 }
}