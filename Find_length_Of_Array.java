package Array_25_01;

import java.util.Scanner;

public class Find_length_Of_Array 
{

	public static void main(String[] args) 
	{
		 int[] a=new int[10];
		
		  Scanner s=new Scanner(System.in);
		  System.out.println("Enter size");
		  int n=s.nextInt();
		  System.out.println("Enter elements");
		  for(int i=0;i<n;i++)
		   {
		        a[i]=s.nextInt();
		   }
		       System.out.println("length:"+a.length);
		}
		    
	}


