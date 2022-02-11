package Functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayList_String {

	public static void main(String[] args) 
	{
		List<String> words = Arrays.asList(
			    "To", "be", "or", "Not", "to", "be");
			Set<String> words2 = words.stream()
			    .map(String::toLowerCase)
			    .collect(Collectors.toSet());
			System.out.println("word set = " + words2);
			 
			    
			// convert into set of lowercase words
			List<String> words1 = Arrays.asList(
			    "To", "be", "or", "Not", "to", "be");
			Set<String> words21 = words1.stream()
			    .map(String::toLowerCase)
			    .collect(Collectors.toSet());
			System.out.println("word set = " + words21);

	}

}
