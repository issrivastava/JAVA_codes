package Exps_java;
import java.util.* ;
public class Exp2_pattern {

	public static void main(String[] args) {

		int i,j,n ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Name:Sagarika Srivastava\nUIN:231P047\nDiv:A\nRoll no:44\n");

		System.out.println("Enter number of row/column:");
		n=sc.nextInt();
		stop: {
		nextRow:
		for (i=1;i<=7;i++)
		{
		if (i==6)
		break stop;
		//System.out.println("");
		for (j=1;i<=10;j++)
		{
		if(j>i)
		continue nextRow;
		System.out.println("*");
		
		 }
		 }
		
		 }

	}

}
