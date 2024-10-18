/*Aim : WAP to find Largest between two number using packages.
* Name: SAGARIKA SRIVASTAVA
* Roll No:44
* UIN : 231P047
* Div : A */
package Experiments_applet;
import myPackage.Compare;
public class Demo {
public static void main(String[] args) 
	{
	int n=10, m=20;
	Compare current = new Compare(n, m);
	if(n != m) 
		current.getmax();
	else 
		System.out.println("Both the values are same");
	
		System.out.println("Name:SAGARIKA SRIVASTAVA");
		System.out.println("UIN:231P047");
	}
}