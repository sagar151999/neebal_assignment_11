/*
 * Write a program that prompts user to read two integers and display their sum. Your
program should prompt the user to read the number again if the input is incorrect.
 */


package assignment_no_11;

import java.util.Scanner;

public class Integer_sum {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int number1,number2;
	do {
		try
		{
			System.out.println("enter the first integer");
			 number1=Integer.parseInt(sc.nextLine());
			 System.out.println("enter the second integer");
			 number2=Integer.parseInt(sc.nextLine());
			 int sum=number1+number2;
			 System.out.println("sum: "+sum);
			 break;
		}
		catch(NumberFormatException e)
		{
			System.out.println("invalid input. please enter valid integers");
		}
	}
	while(true);
	sc.close();
	}

}
