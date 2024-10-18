/*AIM:WAP TO PERFORM ACCOUNT TRANSACTION
 *NAME:SIDRA SOLKAR
 *UIN:231P087
 *DIV:A
 *ROLL NO:43
 */
package skl_oop_b3_odd;
import java.util.*;
public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int acc_no;
		 String name;
		 float amount;
		
		 //creating object of scanner class
		 Scanner sc=new Scanner(System.in);
		
		 //accepting input from user
		 System.out.println("\n Enter Account Number :");
		 acc_no=sc.nextInt();
		
		 System.out.println("\n Enter Customer Name : ");
		 name=sc.next();
		
		 System.out.println("\n Enter Customer Amount :");
		 amount=sc.nextFloat();
		
		 //creating object of a class AccountHelp
		 AccountHelp obj1=new AccountHelp();
		
		 //calling a method
		 obj1.insert(acc_no,name,amount);
		 obj1.display();
		 obj1.checkBalance();
		
		 System.out.print("\n Enter Amount to be deposited : ");
		 float dep_amount=sc.nextFloat();
		 obj1.deposit(dep_amount);
		 obj1.checkBalance();
		
		 System.out.print("\n Enter Amount to be withdrawn : ");
		 float wit_amount=sc.nextFloat();
		 obj1.withdraw(wit_amount);
		 obj1.checkBalance();
		 System.out.print("\n THANK YOU ");
		 }
		 }
class AccountHelp
{
		 int acc_no;
		 String name;
		 float amount;
		
		 //insert method
		 void insert(int a,String n,float amt)
		 {
		 acc_no=a;
		 name=n;
		 amount=amt;
		 }
		
		 //deposit method
		 void deposit(float amt)
		 {
		  amount=amount+amt;
		  System.out.println(amt+" deposited");
		 }
		
		 //void withdraw
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
		
		 //method
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


