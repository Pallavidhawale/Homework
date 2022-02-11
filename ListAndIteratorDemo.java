    import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;

	public class ListAndIteratorDemo {
	    public static void main(String[] args) {
	        List lst=new ArrayList();
	        lst.add("One");
	        lst.add("Two");
	        lst.add("Three");
	        lst.add("Four");
	        Iterator iterator = lst.iterator();
	        while(iterator.hasNext()){
	            System.out.println(iterator.next());
	        }
	        for(Object obj:lst){
	            System.out.println(obj);
	        }
	        for(int i=0;i<lst.size();i++){
	            System.out.println(lst.get(i));
	        }
	        System.out.println(lst);

	    }
	}


