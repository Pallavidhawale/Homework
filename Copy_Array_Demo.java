package Array_25_01;

public class Copy_Array_Demo {

	public static void main(String[] args)
	{ 
  
	      char a[]= {'a','b','c','d','e','f','g'};
	      char b[]=new char[4];
	      System.arraycopy(a, 0, b, 0, 4);
	      System.out.println(new String(b));
	    }

}


