/* Aim : WAP to find Largest between two number using packages
* Name: SAGARIKA SRIVASTAVA
* Roll No:44
* UIN : 231P047
* Div : A 
*/
package Experiments_applet;
public class Compare {	
 int num1, num2;
 public Compare(int n, int m) {
	num1 = n;
	num2 = m;
}
  public void getmax() {
	if (num1 > num2) 
	{
	  System.out.println("Maximum value of two numbers is " + num1);
	}
	else 
	{
	  System.out.println("Maximum value of two numbers is " + num2);
	}
}	
public static void main(String args[]) {
	Compare obj = new Compare();
	obj1.getmax();
	System.out.println("Name: SAGARIKA SRIVASTAVA\nRoll No:44\n UIN:231P047");
}
}