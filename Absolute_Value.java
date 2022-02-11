package Functional_programming;

import java.util.ArrayList;

public class Absolute_Value
{
    public static void main(String[] args) 
    {
	ArrayList<Integer> list =new ArrayList<Integer>();
list.add(-42);
list.add(-17);
list.add(68);
list.stream()
.map(Math::abs)
.forEach(System.out::println);{
		// TODO Auto-generated method stub
}

	}

}
