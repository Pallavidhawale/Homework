package Array_25_01;

import java.util.Scanner;

public class Dynamic_Array {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array");
		int num=sc.nextInt();
		int sum=0;
		int arr[]=new int[num];
		System.out.println("enter number");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("sum of array is:"+sum);
     }

}     


		


