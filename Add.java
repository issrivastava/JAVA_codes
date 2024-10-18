/* Aim: WAP to add between two number using packages
* Name: SAGARIKA SRIVASTAVA
* Roll No:44
* UIN : 231P047
* Div : A */
package Experiments_applet;
public class Add {
	int num1;
	int num2;
	Add(int n, int m) {
		num1= n;
		num2 = m;
	}
	public void getAddition() {
			int result;
			result = num1+num2;
			System.out.println("The addition of two number is " + result);
	}
}