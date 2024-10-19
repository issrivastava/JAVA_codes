package Exps_java;
import java.util.* ;
public class Exp1_02 {
	public static void main(String[] args) {
		int x , y ;
		char ch;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Name:Sagarika Srivastava\nUIN:231P047\nDiv:A\nRoll no:44\n");
		do{
			
		
		System.out.println("MENU:");
	 System.out.println("'+'for ADDITION");
		 System.out.println("'-'for SUBTRACTION");
		System.out.println("'*'for MULTIPLICATION");
		System.out.println("'/'for DIVISION");
		 System.out.println("'%'for MODULUS");
	 System.out.println("'#'for EXIT");
	
		System.out.println("ENTER SYMBOL FOR THE OPERATION:");
		ch=sc.next().charAt(0);
		
		switch(ch)
		 {
		case '+': System.out.println("ADDITION:");
		System.out.println("Enter Your First Number:");
		x=sc.nextInt();
	 System.out.println("Enter Your Second Number:");
		 y=sc.nextInt();
		
		 System.out.println("x+y:"+(x+y));
		 break ;
		
		 case '-': System.out.println("SUBTRACTION:");
	 System.out.println("Enter Your First Number:");
		 x=sc.nextInt();
		 System.out.println("Enter Your Second Number:");
		y=sc.nextInt();
		
		 System.out.println("x-y:"+(x-y));
	 break ;
		
		 case '*' :System.out.println("MULTIPLICATION:");
		 System.out.println("Enter Your First Number:");
		 x=sc.nextInt();
		 System.out.println("Enter Your Second Number:");
		 y=sc.nextInt();
		
		 System.out.println("x*y:"+(x*y));
		 break ;
		
		 case '/': System.out.println("DIVISION:");
		 System.out.println("Enter Your First Number:");
		x=sc.nextInt();
		 System.out.println("Enter Your Second Number:");
y=sc.nextInt();
		 System.out.println("x/y:"+(x/y));
		break ;
		
		case '%': System.out.println("MODULUS:");
		System.out.println("Enter Your First Number:");
		 x=sc.nextInt();
		System.out.println("Enter Your Second Number:");
		 y=sc.nextInt();
		
		 System.out.println("x%y:"+(x%y));
		break ;
		
		case '#': System.out.println("THANK YOU");
		System.exit(0);
		
	 default: System.out.println("WRONG CHOICE!!");
	
		 }
		
		}while(ch!='#');
	}
	}