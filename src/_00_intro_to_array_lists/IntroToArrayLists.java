package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList (java.util) class
		ArrayList<String> arr = new ArrayList<String>();
		// 2. Add five Strings to your list
		arr.add("Java is the best");
		arr.add("C++ is okay...");
		arr.add("Java is cool");
		arr.add("Java is amazing!");
		arr.add("Java is the best coding language in the entire universe!!!!!!!!!!!!!!!!!!");

		System.out.println("Step 3:");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

		System.out.println("Step 4:");
		// 4. Print all the Strings using a for-each loop
		for (String s : arr) {
			System.out.println(s);
		}

		System.out.println("Step 5:");
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < arr.size(); i++) {
			if(i % 2 == 0) {
				System.out.println(arr.get(i));
			}
		}

		System.out.println("Step 6:");
		// 6. Print all the Strings in reverse order.
		for(int i = arr.size() - 1; i >= 0; i--) {
			System.out.println(arr.get(i));
		}
		System.out.println("Step 7:");
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < arr.size(); i++) {
			if(arr.get(i).contains("e")) {
				System.out.println(arr.get(i));
			}
		}
		
	}
}
