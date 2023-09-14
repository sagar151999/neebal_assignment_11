/*
 * Write a program that meets the following requirements:
Create an array with 100 randomly chosen integers. Prompt the user to enter the
index of the array, then display the corresponding element value. If the specified
index is out of bounds, display the message Out of Bounds.
 */


package assignment_no_11;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
public class randomly_integers_choosen {

	public static void main(String[] args) 
	{
		int[] randomArray = generateRandomArray(100);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an index from o to 99 for corresponding element");
		int index=sc.nextInt();
		if(index>=0 && index<randomArray.length)
		{
			int element=randomArray[index];
			System.out.println("element at index "+index+ ":"+element);
		}
		else
		{
			System.out.println("out of bounds");
		}
		sc.close();
		}
		

	

	private static int[] generateRandomArray(int size) {
		int []arr=new int[size];
		Random random=new Random();
		for(int i=0;i<size;i++)
		{
			arr[i]=random.nextInt(1000);
		}
		return arr;
	}

}

