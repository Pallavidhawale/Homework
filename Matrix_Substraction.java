package Array_25_01;

public class Matrix_Substraction
{
	public static void main(String s[])
	{
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int b[][]= {{2,3,4},{5,6,7},{8,9,0}};
	int c[][]=new int[3][3];
	for (int i = 0; i < c.length; i++) 
	{
		for (int j = 0; j < c.length; j++) 
		{
			for (int k = 0; k < c.length; k++) 
			{
				c[i][j]=c[i][j]+a[i][k]-b[k][j];
			}
		}
	}
	for (int i = 0; i < c.length; i++) 
	{
		for (int j = 0; j < c.length; j++) 
		{
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
}

}
