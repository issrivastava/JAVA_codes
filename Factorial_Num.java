/*Aim : WAP to compute factorial of a number using package.
* Name: SAGARIKA SRIVASTAVA
* Roll No:44
* UIN : 231P047
* Div : A */
package Experiments_applet;
public class Factorial_Num { 
		int n;
		Factorial_Num(int num)
		{
			n = num;
		}
		public int getFactorial_Num()
		{
		 if (n == 0 || n == 1) 
		  {
	       return 1;
	      }
	     int result = 1;
	     for (int i = 2; i <= n; i++) 
	      { 
	    	  result *= i;
	      }
	     System.out.println("the factorial of "+n+" is "+ result);
	     return result;
		}
	}