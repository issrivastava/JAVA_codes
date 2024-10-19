package Exps_java;
import java.util.* ;
public class Exp_j1 {
public static void main(String[] args) {
int choice , x , y ;
Scanner sc=new Scanner(System.in);
System.out.println("Name:Sagarika Srivastava\nUIN:231P047\nDiv:A\nRoll no:44\n");
do{
	System.out.println("MENU");
	System.out.println("1.ADDITION");
	System.out.println("2.SUBTRACTION");
	System.out.println("3.MULTIPLICATION");
	System.out.println("4.DIVISION");
	System.out.println("5.MODULUS");
	System.out.println("6.EXIT");
	
	System.out.println("Enter Your Choice:");
	choice=sc.nextInt();
	
	System.out.println("Enter Your First Number:");
	x=sc.nextInt();
	System.out.println("Enter Your Second Number:");
	y=sc.nextInt();
	
	
	
	switch(choice)
	{
	case 1:
	System.out.println("ADDITION of the two numbers is :");
	System.out.println("x+y:"+(x+y));
	break ;
	
	case 2:
	System.out.println("SUBTRACTION of the two numbers is :");
	System.out.println("x-y:"+(x-y));
	break ;
	
	case 3:
    System.out.println("MULTIPLICATION of the two numbers is:");
	System.out.println("x*y:"+(x*y));
	break ;
	
	case 4: 
	System.out.println("DIVISION of the two numbers is :");
	System.out.println("x/y:"+(x/y));
    break ;
	
	case 5:
	System.out.println("MODULUS of the two numbers is:");
	System.out.println("x%y:"+(x%y));
	break ;
	
	case 6:
	System.out.println("THANK YOU");
	System.exit(0);
	
	default: 
	System.out.println("WRONG CHOICE!!");
     
	}
    }while(choice!=6);
}
}