import java.util.ArrayList;
import java.util.List;

public class List_And_Iterator_Demo 
{
public static void main(String s[])
{
	        List lst=new ArrayList();
	        lst.add("One");
	        lst.add("Two");
	        lst.add("Three");
	        lst.add("Four");
	        for(Object obj:lst){
	            System.out.println(obj);
	        }
	        for(int i=0;i<lst.size();i++){
	            System.out.println(lst.get(i));
	        }
	        System.out.println(lst);

	    }
}
