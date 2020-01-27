package application;

import java.util.Arrays;
import java.util.List;

public class Program {
	
	
	// method
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

	
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);

		List<String> myStrgs = Arrays.asList("Marias", "Alex", "Bob");
		printList(myStrgs);
	
	}
}