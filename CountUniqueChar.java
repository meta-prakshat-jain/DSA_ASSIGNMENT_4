package Assignment_4;

import java.util.HashMap;
import java.util.Scanner;
/**
 *  THis class helps to counts the number of unique characters in a
 *   given string and stores the results in a HashMap.
 */
public class CountUniqueChar {
	/**
	 * Method iterates through each character of the input string 
	 * `str` using a for loop. This loop runs `n` times, 
	 * where `n` is the length of the string.
	 * @param str
	 * @param uniqueString
	 * @return the unique char in the given input
	 */
	static int uniqueCharacter (String str, HashMap<String, Integer> uniqueString) {
		HashMap<Character, Integer> uniqueCharHashMap=new HashMap<>(); 
		if(!uniqueString.containsKey(str)) {
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			uniqueCharHashMap.put(ch, 1);
		}
		uniqueString.put(str, uniqueCharHashMap.size());
		}else {
			System.out.println("Already Present in the Hash map retrive stored result");
		}
		System.out.println(uniqueString);
		System.out.println(uniqueCharHashMap);
		
		return uniqueString.get(str);
	}
	public static void main(String[] args) {
		HashMap<String, Integer> uniqueString=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose 1: to enter the string");
		int choose=sc.nextInt();
		sc.nextLine();
		switch(choose) {
		case 1:
		while(true) {
			System.out.println("Enter the String:");
			String str=sc.nextLine();
			System.out.println( uniqueCharacter(str, uniqueString));
			if(str.equals("2"))break;
		}
		case 2:
			break;
		}
		
	}

}
